package com.example.Swiggy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/customer")
public class SwiggyController {
	@GetMapping(path="/getAll")
	public String getCustomer() {
		return "Name fetched";
		
	
	}
	
	



}