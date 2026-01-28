package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao pd;
	
	@Override
	public List<Product> findAll() {
		
		return pd.findAll();
	}


	@Override
	public List<Product> getProductByProductId(int productid) {
		
		return pd.getProductByProductId(productid);
	}


	@Override
	public List<Product> getProductByProductName(String productname) {
		
		return pd.getProductByProductName(productname);
	}

	
	
	

}
