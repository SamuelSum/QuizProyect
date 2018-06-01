package com.dbg.quizback.service;



import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Question;

public interface AnswerService extends AbstractCRUDService<Answer, Integer>{

	void create(Question question, Answer answer);

}
