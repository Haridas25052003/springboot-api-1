package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> findAll();
	
	List<Product> getProductByProductId(int productid);

	List<Product> getProductByProductName(String productname);
	//List<Product> getProductByProductid(int id);
}
