package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.QuestionsDao;
import com.demo.model.Questions;

@Service
public class QuestionsServiceImpl implements QuestionsService{
	
	@Autowired
	private QuestionsDao qd;

	@Override
	public List<Questions> findAll() {
		
		return qd.findAll();
	}

	
//	public Questions addQuestions(Questions questions) {
//		
//		return qd.save(questions);
//	}

	@Override
	public List<Questions> getQuestionsById(Long id) {
		
		return qd.getQuestionsById(id);
	}

	@Override
	public List<Questions> getQuestionsByTopic(String topic) {
		
		return qd.getQuestionsByTopic(topic);
	}


	@Override
	public List<Questions> getQuestionsByDifficulty(String difficulty) {
		
		return qd.getQuestionsByDifficulty(difficulty);
	}


	@Override
	public List<Questions> getQuestionsByIdAndTopic(int id, String Topic) {
		
		return qd.getQuestionsByIdAndTopic(id, Topic);
	}


	@Override
	public List<Questions> getQuestionsByIdOrTopic(int id, String topic) {
		
		return qd.getQuestionsByIdOrTopic(id, topic);
	}


	@Override
	public List<Questions> getQuestionsByIdAndDifficulty(int id, String difficulty) {
		
		return qd.getQuestionsByIdAndDifficulty(id, difficulty);
	}


	@Override
	public List<Questions> getQuestionsByIdOrDifficulty(int id, String difficulty) {
		
		return qd.getQuestionsByIdOrDifficulty(id, difficulty);
	}


	@Override
	public void deleteById(Long id) {

        qd.deleteById(id);
		
	}

}
