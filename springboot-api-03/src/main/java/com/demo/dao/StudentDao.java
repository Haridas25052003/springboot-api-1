package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Student;

public interface StudentDao extends JpaRepository<Student,Integer>{

	Student saveStudent(Student s);
	
	List<Student> findAll();
	
	Student findStudenById(int id);
}
