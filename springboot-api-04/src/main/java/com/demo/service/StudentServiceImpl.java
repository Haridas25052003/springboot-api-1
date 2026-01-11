package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao sd;
	
	@Override
	public List<Student> findAll() {
		
		return sd.findAll();
	}

	@Override
	public Student findStudentById(int id) {
		
		return sd.findStudentById(id);
	}

	@Override
	public List<Student> findByCity(String city) {
		
		return sd.findByCity(city);
	}

	@Override
	public List<Student> findStudentByIdAndName(int id, String name) {
		
		return sd.findStudentByIdAndName(id, name);
	}

	@Override
	public List<Student> findStudentByIdAndCity(int id, String name) {
		
		return sd.findStudentByIdAndName(id, name);
	}

	@Override
	public List<Student> findStudentByIdOrName(int id, String name) {
		
		return sd.findStudentByIdOrName(id, name);
	}

	@Override
	public List<Student> findStudentByIdOrCity(int id, String city) {
		
		return sd.findStudentByIdOrCity(id, city);
	}

	@Override
	public List<Student> findStudentByPercentageLessThan(double percentage) {
		
		return sd.findStudentByPercentageLessThan(percentage);
	}

	@Override
	public List<Student> findStudentByPercentageGreaterThan(double percentage) {
		
		return sd.findStudentByPercentageGreaterThan(percentage);
	}

}
