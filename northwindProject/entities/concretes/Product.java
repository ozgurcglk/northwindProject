package com.turkcell.northwindProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//class level annotation
@Data
@AllArgsConstructor
@NoArgsConstructor
// veritabanı ilişkisi
// persistence = kalıcı hale getirmek, veritabanı, JPA
@Table(name="products")
@Entity
public class Product {

	// field level annotation
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int productId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private int unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;

}
