package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping(value="/")
	public String greeting() {
		return "Welcome to Spring Boot with AWS";
	}
	
	@GetMapping(value="say/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Welcome user " +name+" to spring boot with AWS";
		
	}

}
