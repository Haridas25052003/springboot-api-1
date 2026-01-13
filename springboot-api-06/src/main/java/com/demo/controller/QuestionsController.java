package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Questions;
import com.demo.service.QuestionsService;

@RestController
public class QuestionsController {
	
	@Autowired
	private QuestionsService qs;
	
//	@PostMapping
//	public Questions create(@RequestBody Questions questions) {
//		return qs.createQuestions(questions);
//	}
	
	@GetMapping(value="/")
	public List<Questions> m1(){
		return qs.findAll();
	}
	
	@GetMapping(value="/req1/{id}")
	public List<Questions> m2(@PathVariable Long id){
		return qs.getQuestionsById(id);
	}
	
	@GetMapping(value="/req2/{topic}")
	public List<Questions> m3(@PathVariable String topic){
		return qs.getQuestionsByTopic(topic);
	}
	
	@GetMapping(value="/req3/{difficulty}")
	public List<Questions> m4(@PathVariable String difficulty){
		return qs.getQuestionsByDifficulty(difficulty);
	}
	
	@GetMapping(value="/req4/{id}/{topic}")
	public List<Questions> m5(@PathVariable int id,@PathVariable String topic){
		return qs.getQuestionsByIdAndTopic(id, topic);
	}
	
	@GetMapping(value="/req5/{id}/{topic}")
	public List<Questions> m6(@PathVariable int id,@PathVariable String topic){
		return qs.getQuestionsByIdOrTopic(id, topic);
	}
	
	@GetMapping(value="/req6/{id}/{difficulty}")
	public List<Questions> m7(@PathVariable int id,@PathVariable String difficulty){
		return qs.getQuestionsByIdAndDifficulty(id,difficulty);
	}
	
	@GetMapping(value="/req7/{id}/{difficulty}")
	public List<Questions> m8(@PathVariable int id,@PathVariable String difficulty){
		return qs.getQuestionsByIdOrDifficulty(id, difficulty);
	}
	
	@DeleteMapping(value="/req8/{id}")
	public String m9(@PathVariable Long id) {
		qs.deleteById(id);
		return "question deleted successfully";
	}
}
