package com.demo.service;

import java.util.List;

import com.demo.model.Questions;

public interface QuestionsService {
	
	//Questions createQuestions(Questions questions);
	
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
