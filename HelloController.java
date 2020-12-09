package com.jonali.com.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HelloController {
	
	@RequestMapping(value = "/basic", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello World";
	}
	
	@RequestMapping("/proper_greeting")
	public String properHello() {
		return "Greetings, How are you?";
	}
	
	@RequestMapping("/user_form")
	public String userForm() {
		return "<form action=\"/home/user_greeting\" method=\"GET\">\n"
				+ "  <input type=\"text\" name=\"firstName\" value=\"\"><br><br>\n"
				+ "  <input type=\"text\" name=\"lastName\" value=\"\"><br><br>\n"
				+ "  <input type=\"submit\" value=\"Submit\">\n"
				+ "</form>";
	}
	
	@RequestMapping("/user_greeting")
	public String printUserGreeting(@RequestParam String firstName, @RequestParam String lastName) {
		return "Hello there, " + firstName + " " + lastName;
	}

	@RequestMapping("/orders/{id}")
	public String getOrder(@PathVariable String id) {
		return "Order ID: "+ id;
	}
	
}




// Create a second route method
// Create a user form method 
// Create a POST method for user form
// Display first and last name of user input using @RequestParams = display parameters of the post request parameters
// Create a method which displays id using @PathVariables = display id that is part of the URL. it's part of the path