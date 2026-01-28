package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Category;
import com.demo.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService cs;
	
	@PostMapping("/add")
	public Category m1(@RequestBody Category category) {
		return cs.addCategory(category);
	}

}
