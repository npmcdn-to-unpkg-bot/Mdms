package com.madams.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.madams.model.MaritalStatusList;
import com.madams.model.Status;
import com.madams.service.MaritalStatusService;

@RestController
@RequestMapping(value="/api")
public class MaritalStatusRestController {
	@Autowired
	private MaritalStatusService _service;
	
	@RequestMapping(value = "/marital/status", method = RequestMethod.GET)
	public List<Status> getListStatus(){
		return _service.findAll();
	}
	
	@RequestMapping(value = "/marital/status/{id}", method = RequestMethod.GET)
	public MaritalStatusList getStatusByType(@PathVariable("id") int id){
		return _service.findById(id);
	}
}
