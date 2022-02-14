package com.turkcell.northwindProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turkcell.northwindProject.business.abstracts.ProductService;
import com.turkcell.northwindProject.dataAccess.abstracts.ProductDao;
import com.turkcell.northwindProject.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	ProductDao productDao;
	
	// newlemek yerine
	@Autowired
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		// business code
		return this.productDao.findAll();
	}

	@Override
	public void add(Product product) {
		this.productDao.save(product);		
	}

}
//spring ioc
