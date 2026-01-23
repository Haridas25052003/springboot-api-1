package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiLimitConfigDao extends JpaRepository<ApiLimitConfigDao,String>{

	int getDailyLimit();

}
