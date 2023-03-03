package com.nagarro.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest") 
public class MyController {
	
	@GetMapping("")
	public String welcome() {
		return "Welcome to REST API endpoint";
	}
}
