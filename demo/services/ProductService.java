package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.RepositoryIface;
import com.example.demo.resource.Product;


public class ProductService {
	@Autowired
	RepositoryIface repo;

	public Product getProduct(long id) {
	
		return repo.findById(id).orElse(null);
	}

	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Product add(Product product) {
		Product p=repo.save(product);
		// TODO Auto-generated method stub
		return p;	}

}
