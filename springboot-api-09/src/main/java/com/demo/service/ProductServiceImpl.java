package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CategoryDao;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao pd;
	
	@Autowired
	private CategoryDao cd;
	
	
}
