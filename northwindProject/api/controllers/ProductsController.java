package com.turkcell.northwindProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.northwindProject.business.abstracts.ProductService;
import com.turkcell.northwindProject.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	private ProductService productService;

	@Autowired
	public ProductsController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Product product){
		this.productService.add(product);
	}
}
