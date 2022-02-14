package com.turkcell.northwindProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turkcell.northwindProject.entities.concretes.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}
