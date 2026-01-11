package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Student;

public interface StudentDao extends JpaRepository<Student,Integer>{
	
	List<Student> findAll();
	
	Student findStudentById(int id);
	
	List<Student> findByCity(String city);

	List<Student> findStudentByIdAndName(int id,String name);

	List<Student> findStudentByIdAndCity(int id,String name);
	
    //List<Student> findStudentByIdOrName(int id,String name);

	List<Student> findStudentByIdOrName(int id, String name);
	
	List<Student> findStudentByIdOrCity(int id,String city);
	
	List<Student> findStudentByPercentageLessThan(double percentage);

	//List<Student> findStudentByPercentageLessThan(double percentage);
	
	List<Student> findStudentByPercentageGreaterThan(double percentage);
}
