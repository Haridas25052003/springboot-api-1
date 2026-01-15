package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.Questions;

public interface QuestionsDao extends JpaRepository<Questions,Long>{
	List<Questions> findAll();
	List<Questions> getQuestionsById(Long id);
	
	List<Questions> getQuestionsByTopic(String topic);
	
	List<Questions> getQuestionsByDifficulty(String difficulty);

	List<Questions> getQuestionsByIdAndTopic(int id,String Topic);
	
	List<Questions> getQuestionsByIdOrTopic(int id,String topic);

	List<Questions> getQuestionsByIdAndDifficulty(int id,String difficulty);
	
	List<Questions> getQuestionsByIdOrDifficulty(int id,String difficulty);

	public void deleteById(Long id);
	
}
