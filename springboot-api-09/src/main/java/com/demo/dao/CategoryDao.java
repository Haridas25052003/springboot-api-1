package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.model.*;

public interface CategoryDao extends JpaRepository<Category,Integer>{

}
