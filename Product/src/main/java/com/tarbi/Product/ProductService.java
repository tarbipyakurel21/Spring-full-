package com.tarbi.Product;


import java.util.ArrayList;
import java.util.List;



public class ProductService {

	List<Product> products=new ArrayList<>();
	ProductDB db=new ProductDB();
	
	
	public void addProduct(Product p) {
		
	db.save(p);
	
	}
	
	
	public List<Product> getAllProducts(){
		
		return db.getAll();
		}

	public Product getProduct(String name) {
		
		for (Product p:products) {
			
			if(p.getName().equals(name)) {
				return p;
			}
			
		}
		return null;
		
	}

	public List<Product> getProductsWithText(String text) {
		
		String str=text.toLowerCase();
		
		List<Product> prods=new ArrayList<>();
		
		for(Product p:products) {
			String name=p.getName().toLowerCase();
			String type=p.getType().toLowerCase();
			String place=p.getPlace().toLowerCase();
			
			if(name.contains(str) || type.contains(str) ||place.contains(str)) {
				
				prods.add(p);
			}
			
		}

		return prods;
	}
	
	public List<Product> getProductbyPlace(String place) {
		String lowercaseplace=place.toLowerCase();
		List<Product> placeprod=new ArrayList<>();
		
		for (Product p: products) {
			
			String lowercasegetPlace=p.getPlace().toLowerCase();
			if (lowercasegetPlace.contains(lowercaseplace)) {
				placeprod.add(p);
			}
				}
		return placeprod;
		}
	}
