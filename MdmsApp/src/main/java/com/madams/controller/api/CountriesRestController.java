package com.madams.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.madams.model.CountriesList;
import com.madams.service.CountriesService;

@RestController
@RequestMapping(value="/api")
public class CountriesRestController {
	
	@Autowired
	private CountriesService _service;
	
	@RequestMapping(value = "/countries", method = RequestMethod.GET)
	public List<CountriesList> getListStatus(){
		return _service.findAll();
	}
	
	@RequestMapping(value = "/country/{country}", method = RequestMethod.GET)
	public CountriesList getStatusByType(@PathVariable("country") String country){
		return _service.findById(country);
	}
}
