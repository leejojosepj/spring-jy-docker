package com.jy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/season")
	public String getMessage() {
		return "Welcome to spring";
	}

}
