package com.pcsoft.fum.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcsoft.fum.jpamodel.Customer;
import com.pcsoft.fum.services.ICustomerService;

@RestController
public class LoginController {
	
	@Autowired
	private ICustomerService service;
	
	@GetMapping("/")
	public Customer index() {
		return service.saveAndGet();
	}
	
	@GetMapping("/abc")
	public String abc(){
		return "abc";
	}
	
}
