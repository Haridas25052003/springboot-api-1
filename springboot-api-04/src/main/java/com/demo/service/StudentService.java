package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {

	List<Student> findAll();
	
	Student findStudentById(int id);
	
	List<Student> findByCity(String city);
    
	List<Student> findStudentByIdAndName(int id,String name);
	
	List<Student> findStudentByIdAndCity(int id,String name);
	
	List<Student> findStudentByIdOrName(int id,String name);
	
	List<Student> findStudentByIdOrCity(int id,String city);
	
	List<Student> findStudentByPercentageLessThan(double percentage);
	
	List<Student> findStudentByPercentageGreaterThan(double percentage);
}
