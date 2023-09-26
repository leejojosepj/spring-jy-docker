package com.jy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/season")
	public String getMessage() {
		return "Welcome to spring";
	}


	@GetMapping("/season2")
	public String getMessage2() {
		return "Welcome to spring2";
	}

	@GetMapping("/season3")
	public String getMessage3() {
		return "Welcome to spring3";
	}

}
