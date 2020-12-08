package com.jonali.com.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("greeting")
public class HelloController {
	@RequestMapping(value = "/basic", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello World";
	}

}


// Create a second route method
// Create a user form method 
// Create a POST method for user form
// Display first and last name of user input using @RequestParams = display parameters of the post request parameters
// Create a method which displays id using @PathVariables = display id that is part of the URL. it's part of the path