package com.madams.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.madams.model.Mother;
import com.madams.service.MotherService;

@RestController
@RequestMapping(value="/api")
public class MotherRestController {
	//@Autowired
	//private TodoService service;
	
	@Autowired
	private MotherService motherService;
	

//	@RequestMapping(value = "/todo/", method = RequestMethod.GET)
//	public @ResponseBody List<Todo> listAllTodos() {
//		List<Todo> users = service.retrieveTodos("in28Minutes");
//		return users;
//	}
//
//	@RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
//	public @ResponseBody Todo retrieveTodo(@PathVariable("id") int id) {
//		return service.retrieveTodo(id);
//	}
	
	@RequestMapping(value = "/mother/{id}", method = RequestMethod.GET)
	public @ResponseBody List<Mother> retrieveMother(@PathVariable("id") int id) {
		List<Mother> mother = motherService.retrieveMother(id);
		return mother;
	}
	
	@RequestMapping(value = "/mother", method = RequestMethod.GET)
	public @ResponseBody List<Mother> listAllTodos() {
		List<Mother> mothers = motherService.allMotherList();
		return mothers;
	}
}
