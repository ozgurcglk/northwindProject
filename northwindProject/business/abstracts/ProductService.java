package com.turkcell.northwindProject.business.abstracts;

import java.util.List;

import com.turkcell.northwindProject.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
	void add(Product product);
	
}
