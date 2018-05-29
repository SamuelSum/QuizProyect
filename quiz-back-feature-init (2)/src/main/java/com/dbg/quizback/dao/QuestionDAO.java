package com.dbg.quizback.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.dbg.quizback.model.Question;

@Repository
public interface QuestionDAO extends PagingAndSortingRepository<Question, Integer>{

	
}
