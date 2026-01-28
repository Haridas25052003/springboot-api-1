package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.model.Category;
import com.demo.service.CategoryService;

@Component
public class TestDataLoader implements CommandLineRunner{

	@Autowired
	private CategoryService cs;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category c1=new Category();
		c1.setCategoryname("hardware");
		
		Category c2=new Category();
		c2.setCategoryname("book and study material");
		
		Category c3=new Category();
		c3.setCategoryname("clothing");
		
		cs.addCategory(c1);
		cs.addCategory(c2);
		cs.addCategory(c3);
		
		System.out.println("categories inserted");
		
	}

}
