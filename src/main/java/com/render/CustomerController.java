package com.render;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class CustomerController {
	
	@GetMapping
	public List<Customer> findAllCustomers() {
		List<Customer> list = Arrays.asList(
				new Customer(1L, "Avigail", "doe", "john@javawhizz.com"),
				new Customer(2L, "Ariel", "public", "mary@javawhizz.com"),
				new Customer(3L, "Odel", "musk", "elon@javawhizz.com"),
				new Customer(4L, "Itamar", "duncan", "dunny@javawhizz.com"),
				new Customer(5L, "Karin", "Shalem", "dunny@javawhizz.com"),
				new Customer(6L, "Shabtay", "Shalem", "dunny@javawhizz.com"),				
				new Customer(7L, "Family", "Shalem", "dunny@javawhizz.com"));
		return list;
	}
}
