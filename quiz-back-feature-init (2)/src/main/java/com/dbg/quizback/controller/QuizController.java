package com.dbg.quizback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.quizback.component.mapper.quiz.QuizMapper;
import com.dbg.quizback.dto.QuizDTO;
import com.dbg.quizback.model.Quiz;
import com.dbg.quizback.service.QuizService;

@RestController
@RequestMapping(value = "/quiz")
public class QuizController {

	@Autowired
	QuizMapper quizMapper;
	
	@Autowired
	QuizService quizService;
	
	@RequestMapping(method = RequestMethod.POST)
	public QuizDTO create(@RequestBody QuizDTO dto) {
		final Quiz quiz = quizMapper.dtoToModel(dto);
		final Quiz createQuiz = quizService.create(quiz);
		return quizMapper.modelToDto(createQuiz);

	}
	
	//public QuizDTO
	
	
	
}
