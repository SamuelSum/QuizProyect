package com.dbg.quizback.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.domain.Pageable;

import com.dbg.quizback.model.Question;

public interface QuestionService extends AbstractCRUDService<Question, Integer>{

	Optional<Question> findAnswerById(Integer id);
	

}
