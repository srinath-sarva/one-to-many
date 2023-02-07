package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@GetMapping({"/","/home"})
	public String home() {
		
		return("<h1>SpringSecurity home page </h1>");
	}
	
	@GetMapping("/balance")
	public String balance() {
		return("<h1>SpringSecurity balance 9000</h1>");
	}
	@GetMapping("/statement")
	public String statement() {
		return("<h1>statement sent to emiail</h1>") ;
	}
	@GetMapping("/loan")
	public String loan() {
		return("<h1>welcome to loan page</h1>");
	}
	
	@GetMapping("/contact")
	public String contact() {
		return("<h1>tHnks for contacting us</h1>");
	}
	

	
}
