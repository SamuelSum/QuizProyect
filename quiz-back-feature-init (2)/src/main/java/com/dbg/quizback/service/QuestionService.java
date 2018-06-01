package com.dbg.quizback.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.domain.Pageable;

import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Question;

public interface QuestionService extends AbstractCRUDService<Question, Integer>{

	//public void añadirRespuestas(Question question);

	public void añadirRespuestas(Question question, Answer answer);


	

}
