package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		return ss.findStudentById(id);
	}
	
	@GetMapping(value="/req2/{city}")
	public List<Student> m3(@PathVariable String city) {
		return ss.findByCity(city);
	}
	
	@GetMapping(value="/req3/{id}/{name}")
	public List<Student> m4(@PathVariable int id, @PathVariable String name){
		return ss.findStudentByIdAndName(id, name);
	}
	
	@GetMapping(value="/req4/{id}/{city}")
	public List<Student> m5(@PathVariable int id, @PathVariable String city){
		return ss.findStudentByIdAndCity(id, city);
	}
	
	@GetMapping(value="/req5/{id}/{name}")
	public List<Student> m6(@PathVariable int id, @PathVariable String name){
		return ss.findStudentByIdOrName(id, name);
	}
	
	@GetMapping(value="/req6/{id}/{city}")
	public List<Student> m7(@PathVariable int id, @PathVariable String city){
		return ss.findStudentByIdOrCity(id, city);
	}
	
	@GetMapping(value="/req7/{percentage}")
	public List<Student> m8(@PathVariable double percentage){
		return ss.findStudentByPercentageLessThan(percentage);
	}
	
	@GetMapping(value="/req8/{percentage}")
	public List<Student> m9(@PathVariable double percentage){
		return ss.findStudentByPercentageGreaterThan(percentage);
	}

}
