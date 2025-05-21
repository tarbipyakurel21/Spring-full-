package com.tarbi.springmvcboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data //using lombok to reduce number of lines of code
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String type;
	private String place;
	private int warranty;
	
	public Product() {
		super();
	}

	public Product(int id, String name, String type, String place, int warranty) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.place = place;
		this.warranty = warranty;
	}
	
	
	
}
