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
	}

