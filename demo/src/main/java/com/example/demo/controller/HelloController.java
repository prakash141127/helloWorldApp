package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	
	@PostMapping("/hello")
	public String helloWorld() {
		return "Hey hai hello";
	}
	
	
	
	@GetMapping("/get")
	public String getDetails() {
		return "This is a getmapping for to get the details form the db";
	}

}
