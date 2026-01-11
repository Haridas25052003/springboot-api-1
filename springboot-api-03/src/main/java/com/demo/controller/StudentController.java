package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService ss;
	@GetMapping(value="/")
	public List<Student> m1(){
		
		return ss.findAll();
	}
	
	@GetMapping(value="/req1/{id}")
	public Student m2(@PathVariable int id) {
		return ss.findStudenById(id);
	}
	
	@PostMapping(value="/req3")
	public Student m3(@RequestBody Student s) {
		return ss.saveStudent(s);
	}
}
