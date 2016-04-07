package com.madams.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.madams.model.StatesList;
import com.madams.service.StatesService;

@RestController
@RequestMapping(value="/api")
public class StatesRestController {
	
	@Autowired
	private StatesService _service;
	
	@RequestMapping(value = "/states", method = RequestMethod.GET)
	public List<StatesList> getListStatus(){
		return _service.findAll();
	}
	
	@RequestMapping(value = "/state/{code}", method = RequestMethod.GET)
	public StatesList getStatusByType(@PathVariable("code") String code){
		return _service.findById(code);
	}
}
