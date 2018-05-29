package com.dbg.quizback.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dbg.quizback.model.Quiz;

public interface QuizDAO extends PagingAndSortingRepository<Quiz, Integer>{

}
