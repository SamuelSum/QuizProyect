package com.dbg.quizback.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dbg.quizback.dao.AnswerDAO;
import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Question;

@Service
public class AnswerServiceImpl implements AnswerService {

	@Autowired
	AnswerDAO answerDao;
	
	@Autowired
	QuestionService questionService;
	
	
	@Override
	public Answer create(Answer t) {
		return answerDao.save(t);
		
	}

	@Override
	public void update(Answer t) {
		answerDao.save(t);
		
	}

	
	
	@Override
	public Optional<Answer> findById(Integer id) {
		return answerDao.findById(id);
	}

	@Override
	public Set<Answer> findAll(Pageable p) {
		int page = p.getPageNumber();
		int size = p.getPageSize();
		return answerDao.findAll(PageRequest.of(page, size)).stream().collect(Collectors.toSet());
	}

	@Override
	public void delete(Answer t) {
		answerDao.delete(t);
		
	}
/*
	public void combineAndswerQuestion (Answer a, Integer idQuestion) {
		
		
		
		Optional<Question> question = questionService.findById(idQuestion);
		Question questionFinal = question.get();
		questionFinal.setAnswers(a);
	
	}
	*/

	@Override
	public void create4Answer(Answer answer) {
		
		}
		
	
	
}
