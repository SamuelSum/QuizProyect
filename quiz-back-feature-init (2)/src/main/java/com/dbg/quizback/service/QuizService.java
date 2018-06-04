package com.dbg.quizback.service;


import com.dbg.quizback.model.Quiz;

public interface QuizService extends AbstractCRUDService<Quiz, Integer> {

	
	public void joinQuestionWithQuiz (Integer id, Integer idQuestion);


}
