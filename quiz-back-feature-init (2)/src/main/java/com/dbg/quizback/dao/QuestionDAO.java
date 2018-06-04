package com.dbg.quizback.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.dbg.quizback.model.Question;
import com.dbg.quizback.model.Quiz;

@Repository
public interface QuestionDAO extends PagingAndSortingRepository<Question, Integer>{

	List<Question> findAllByQuiz(Quiz quiz);

	
}
