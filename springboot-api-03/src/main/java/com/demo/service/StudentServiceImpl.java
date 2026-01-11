package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao sd;

	@Override
	public List<Student> findAll() {
		
		return sd.findAll();
	}

	@Override
	public Student findStudenById(int id) {
		
		return sd.findStudenById(id);
	}

	@Override
	public Student saveStudent(Student s) {
		
		return sd.saveStudent(s);
	}

	
}
