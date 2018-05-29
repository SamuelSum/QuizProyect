package com.dbg.quizback.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dbg.quizback.model.Answer;

public interface AnswerDAO extends PagingAndSortingRepository<Answer, Integer> {

}
