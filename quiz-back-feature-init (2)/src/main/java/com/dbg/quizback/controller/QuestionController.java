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

import com.dbg.quizback.component.mapper.answer.AnswerMapper;
import com.dbg.quizback.component.mapper.dificulty.DificultyMapper;
import com.dbg.quizback.component.mapper.question.QuestionMapper;
import com.dbg.quizback.component.mapper.question.QuestionPostMapper;
import com.dbg.quizback.component.mapper.question.QuestionPutAnswerMapper;
import com.dbg.quizback.dto.DificultyDTO;
import com.dbg.quizback.dto.questionDTOs.QuestionDTO;
import com.dbg.quizback.dto.questionDTOs.QuestionPostDTO;
import com.dbg.quizback.dto.questionDTOs.QuestionPutAnswerDTO;
import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Dificulty;
import com.dbg.quizback.model.Question;
import com.dbg.quizback.service.QuestionService;

@RestController
@RequestMapping(value = "/question")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	@Autowired
	QuestionMapper questionMapper;

	@Autowired
	QuestionPostMapper questionPostMapper;

	@Autowired
	AnswerMapper answerMapper;

	@Autowired
	QuestionPutAnswerMapper questionPutAnswerMapper;

	@Autowired
	DificultyMapper dificultyMapper;

	@RequestMapping(method = RequestMethod.GET)
	public List<QuestionDTO> findAll(@RequestParam(defaultValue = "0", required = false) Integer page,
			@RequestParam(defaultValue = "10", required = false) Integer size) {
		final List<Question> questions = questionService.findAll(PageRequest.of(page, size));
		//final List<Question> q = questionService.getAnswerByQuestion(questions);
		
		//List <QuestionDTO> lq = questionMapper.modelToDto(q);
		
		
		return questionMapper.modelToDto(questions);
		
	}

	@RequestMapping(value = "/{id}", method= RequestMethod.GET)
	public QuestionDTO findById(@PathVariable("id") Integer id) {

		final Optional<Question> question = questionService.findById(id);
		
		//questionService.getAnswerByOneQuestion(question.get());
		return questionMapper.modelToDto(question.get());
	}

	@RequestMapping(method = RequestMethod.POST)
	public QuestionPostDTO create(@RequestBody QuestionPostDTO dto) {
		final Question question = questionPostMapper.dtoToModel(dto);
		final Question createQuestion = questionService.create(question);
		return questionPostMapper.modelToDto(createQuestion);

	}

	//Pongo la dificultad en PUT, porque la dificultad dependerá aparte del enunciado,
	//de las respuestas. Y he visto lógico establecer la dificuldad una vez tiene las 
	//respuestas añadidas.
	
	@RequestMapping(value = "/{id}/dificulty", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Integer id, @RequestBody DificultyDTO dto) {
		Dificulty dificulty = dificultyMapper.dtoToModel(dto);

		if (questionService.findById(id).isPresent()) {
			Optional<Question> question = questionService.findById(id);
			questionService.joinDificultyWithQuestion(question.get(), dificulty);
		}

	}

	@RequestMapping(value = "/{id}", method = { RequestMethod.DELETE })
	public void delete(@PathVariable("id") Integer id, @RequestBody QuestionDTO dto) {
		if (questionService.findById(id).isPresent()) {
			Optional<Question> question;
			question = questionService.findById(id);
			questionService.delete(question.get());

		}
	}

	
	@RequestMapping(value = "/{id}", method = { RequestMethod.PUT })
	public void update(@PathVariable("id") Integer id, @RequestBody QuestionPutAnswerDTO dto) {
		Answer answer = questionPutAnswerMapper.dtoToModel(dto);

		if (questionService.findById(id).isPresent()) {
			Optional<Question> question = questionService.findById(id);
			questionService.joinAnswerWithQuestion(question.get(), answer);
		}

	}

}
