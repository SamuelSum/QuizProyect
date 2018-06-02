package com.dbg.quizback.service;


import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dbg.quizback.dao.QuestionDAO;
import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Dificulty;
import com.dbg.quizback.model.Question;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionDAO questionDao;
	
	@Autowired
	AnswerService answerService;
	
	@Autowired
	DificultyService dificultyService;
	
	
	@Override
	public Question create(Question t, Integer dificultyLevel) {
		Question question = t;
		Dificulty d = dificultyService.create(question.getDificulty());
		dificultyService.UpdateDifLevel(d, dificultyLevel);;
		t.setDificulty(d); 		
        return questionDao.save(t);
	}

	@Override
	public void update(Question t) {
		questionDao.save(t);
		
	}
	

	@Override
	public Optional<Question> findById(Integer id) {
		
		return questionDao.findById(id);
	}

	@Override
	public Set<Question> findAll(Pageable p) {
		int page = p.getPageNumber();
		int size = p.getPageSize();
		return questionDao.findAll(PageRequest.of(page, size)).stream().collect(Collectors.toSet());
		
	}

	@Override
	public void delete(Question t) {
	questionDao.delete(t);
	

		
	}

	@Override
	public void joinAnswerWithQuestion(Question question, Answer answer) {
		
		answerService.create(question, answer);
		List<Answer> answers = question.getAnswers();
		answers.add(answer);
		questionDao.save(question);
		
	}

	@Override
	public Question create(Question t) {
		
		return questionDao.save(t);
	}




}
