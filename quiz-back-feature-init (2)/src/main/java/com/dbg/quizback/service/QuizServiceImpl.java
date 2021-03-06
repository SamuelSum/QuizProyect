package com.dbg.quizback.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dbg.quizback.dao.QuizDAO;
import com.dbg.quizback.model.Question;
import com.dbg.quizback.model.Quiz;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	QuizDAO quizDao;
	
	@Autowired
	QuestionService questionService;
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	QuizService quizService;
	
	
	@Override
	public Quiz create(Quiz t) {
		courseService.create(t.getCourse());
		return quizDao.save(t);
	}

	@Override
	public void update(Quiz t) {
		quizDao.save(t);
		
	}

	@Override
	public Optional<Quiz> findById(Integer id) {
		
		return quizDao.findById(id);
	}

	@Override
	public List<Quiz> findAll(Pageable p) {
		int page = p.getPageNumber();
		int size = p.getPageSize();
		return quizDao.findAll(PageRequest.of(page, size)).stream().collect(Collectors.toList());
	}

	@Override
	public void delete(Quiz t) {
	   quizDao.delete(t);
		
	}

	@Override
	public void joinQuestionWithQuiz(Integer id, Integer idQuestion) {
		
		Optional<Question> real = questionService.findById(idQuestion);
		Optional<Quiz> quiz = quizService.findById(id);
				
		if(quiz.get().getQuestions().size()<=10) {
			quiz.get().getQuestions().add(real.get());
			quizService.update(quiz.get());
		//	quizDao.save(quiz.get());
		}
		
		
	/*	
		List <Question> lq = quiz.get().getQuestions();
		lq.add(real.get());
		quiz.get().setQuestions(lq);
		
		
		quizDao.save(quiz.get());
			*/			
	}


}
