package com.google.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/call")
	public String getMsg() {
		
		return "Helllllo";
	}

}
