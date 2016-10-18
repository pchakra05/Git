package com.pcsoft.fum.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping("/")
	public String index() {
		return "Hello FUM <a href=/abc>ABC</a>";
	}
	
	@GetMapping("/abc")
	public String abc(){
		return "abc";
	}
	
}
