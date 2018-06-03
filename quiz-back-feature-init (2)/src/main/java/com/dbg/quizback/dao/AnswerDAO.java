package com.dbg.quizback.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Question;

public interface AnswerDAO extends PagingAndSortingRepository<Answer, Integer> {

	List<Answer> findAllByQuestion(Question question);
}
