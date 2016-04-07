package com.madams.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.madams.model.Status;
import com.madams.service.StatusService;

@RestController
@RequestMapping(value="/api")
public class StatusRestController {
	@Autowired
	private StatusService _service;
	
	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public List<Status> getListStatus(){
		return _service.findAll();
	}
	
	@RequestMapping(value = "/status/{type}", method = RequestMethod.GET)
	public List<Status> getStatusByType(@PathVariable("type") String type){
		return _service.findByType(type);
	}
}