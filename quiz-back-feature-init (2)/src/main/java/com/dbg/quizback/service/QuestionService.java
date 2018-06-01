package com.dbg.quizback.service;




import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Question;

public interface QuestionService extends AbstractCRUDService<Question, Integer>{

	//public void añadirRespuestas(Question question);

	public void joinAnswerWithQuestion(Question question, Answer answer);


	

}
