package com.demo.dao;

import java.util.List;
import com.demo.model.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryDao extends JpaRepository<Diary,Integer>{
	
	List<Diary> findAll();

}
