package com.madams.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController {
	
	@RequestMapping("")
	public String index(Model model){
		
		return "contact";
	}
}
