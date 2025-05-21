package com.tarbi.springmvcboot;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductDB db;
	
	public List<Product> getAllProducts(){
		return db.findAll();
	}
	
	public Product getProduct(String name) {
		
		return db.findByName(name);
		}

	public Product getOneProduct(int id) {
		return db.getById(id);
		
	}

	public Product addProduct(Product p) {
		return db.save(p);
	}
	}

