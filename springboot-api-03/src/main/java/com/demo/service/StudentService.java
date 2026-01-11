package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {

	List<Student> findAll();
	
	Student findStudenById(int id);

	Student saveStudent(Student s);
}
