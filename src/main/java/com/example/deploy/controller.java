package com.example.deploy;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class controller {
	
	@GetMapping("/")
	@CrossOrigin("*")
	public String hello() {
		
				return "Hello I'm ready to be deployed";
	}
	

}
