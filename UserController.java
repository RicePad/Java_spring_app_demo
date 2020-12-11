package com.jonali.com.web;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jonali.com.domain.Product;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/{userId}")
	public String displayUser(@PathVariable int userId) {
		return "User Found: " + userId;
	}
	
	
	@RequestMapping("/{id}/invoices")
	public String displayUserInvoices(@PathVariable("id") int userId, 
									  @RequestParam(value="date", required=false) Date dateOrNull) {
		return "Invoice found for user " + userId + "on the date: " + dateOrNull;
	}
	
	@RequestMapping("/{userId}/items")
	public List<String> displayStringsJson(){
		return Arrays.asList("Shoes", "laptop", "button");
	}
	
	@RequestMapping("/{userId}/products_as_json")
	public List<Product> displayProductsJson(){
		return Arrays.asList(new Product(1, "shoes", 52.99),
							 new Product(2, "shoes", 42.99),
							 new Product(3, "shoes", 32.99)
				);
	}
	
}
