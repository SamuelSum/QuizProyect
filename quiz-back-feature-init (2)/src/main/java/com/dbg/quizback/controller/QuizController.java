package com.dbg.quizback.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.quizback.component.mapper.question.QuestionIdMapper;
import com.dbg.quizback.component.mapper.quiz.QuizGetMapper;
import com.dbg.quizback.component.mapper.quiz.QuizMapper;
import com.dbg.quizback.dto.questionDTOs.QuestionPutAnswerDTO;
import com.dbg.quizback.dto.quizDTOs.QuizDTO;
import com.dbg.quizback.dto.quizDTOs.QuizGetDTO;
import com.dbg.quizback.dto.quizDTOs.QuizPutQuestionsDTO;
import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Question;
import com.dbg.quizback.model.Quiz;
import com.dbg.quizback.service.QuizService;

@RestController
@RequestMapping(value = "/quiz")
public class QuizController {

	@Autowired
	QuizMapper quizMapper;
	
	@Autowired
	QuizGetMapper quizGetMapper;
	
	@Autowired
	QuestionIdMapper questionIdMapper;
	
	@Autowired
	QuizService quizService;
	

	
	@RequestMapping(method = RequestMethod.POST)
	public QuizDTO create(@RequestBody QuizDTO dto) {
		final Quiz quiz = quizMapper.dtoToModel(dto);
		final Quiz createQuiz = quizService.create(quiz);
		return quizMapper.modelToDto(createQuiz);

	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<QuizGetDTO> findAll(@RequestParam(defaultValue = "0", required = false) Integer page,
			@RequestParam(defaultValue = "10", required = false) Integer size){
		final List<Quiz> quizs = quizService.findAll(PageRequest.of(page, size));
		return quizGetMapper.modelToDto(quizs);
	}
	
	@RequestMapping(value = "/{id}", method = { RequestMethod.PUT})
	public void update(@PathVariable("id") Integer id, @RequestBody QuizPutQuestionsDTO dto) {
		
		//List <Question> questions = questionIdMapper.dtoToModel(dtos);
		
	}
}
	
	
	/*
	 * 
	@RequestMapping(value = "/{id}", method = { RequestMethod.PUT })
	public void update(@PathVariable("id") Integer id, @RequestBody QuestionPutAnswerDTO dto) {
		Answer answer = questionPutAnswerMapper.dtoToModel(dto);

		if (questionService.findById(id).isPresent()) {
			Optional<Question> question = questionService.findById(id);
			questionService.joinAnswerWithQuestion(question.get(), answer);
		}

	}
	 */
	

