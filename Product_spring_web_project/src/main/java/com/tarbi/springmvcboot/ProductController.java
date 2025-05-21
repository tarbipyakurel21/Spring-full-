package com.tarbi.springmvcboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class ProductController {

@Autowired
ProductService service;
	
	
	
@GetMapping("/")
public String Homepage() {
	
	return "Hello World";
}

@GetMapping("/products")
public List<Product> getAllProducts() {
	
	return service.getAllProducts();
}

@GetMapping("/product/{name}")
public Product getProducts(@PathVariable String name) {
	
	return service.getProduct(name);
}

@PostMapping("/product")
public Product addProduct(@RequestBody Product p) {
	
	return service.addProduct(p);
}
	
}
