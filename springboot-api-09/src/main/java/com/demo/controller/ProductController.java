package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService ps;
	
	@GetMapping(value="/")
	public List<Product> m1(){
		return ps.findAll();
	}
	
	@GetMapping(value="/req1/{productid}")
	public List<Product> m2(@PathVariable int productid){
		return ps.getProductByProductId(productid);
	}
	
	@GetMapping(value="/req2/{productname}")
	public List<Product> m3(@PathVariable String productname){
		return ps.getProductByProductName(productname);
	}
	
}
