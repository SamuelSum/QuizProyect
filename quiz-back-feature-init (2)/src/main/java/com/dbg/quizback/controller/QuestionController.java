package com.dbg.quizback.controller;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.quizback.component.mapper.question.QuestionMapper;
import com.dbg.quizback.component.mapper.question.QuestionPostMapper;
import com.dbg.quizback.dto.QuestionDTO;
import com.dbg.quizback.dto.QuestionPostDTO;
import com.dbg.quizback.model.Question;
import com.dbg.quizback.model.User;
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
	
	
	@RequestMapping(method = RequestMethod.GET)
	public Set<QuestionDTO> findAll (@RequestParam(defaultValue = "0", required = false) Integer page,
			@RequestParam(defaultValue = "10", required =  false) Integer size){
		final Set<Question> questions = questionService.findAll(PageRequest.of(page, size));
		return questionMapper.modelToDto(questions);
	}
	
	@RequestMapping(value = "/{id}")
	public QuestionDTO findById(@PathVariable("id") Integer id) {
		
		final Optional<Question> question = questionService.findById(id);
		return questionMapper.modelToDto(question.get());
	}

	@RequestMapping(method = RequestMethod.POST)
	public QuestionDTO create (@RequestBody QuestionPostDTO dto) {
		final Question question = questionPostMapper.dtoToModel(dto);
		final Question createQuestion = questionService.create(question);
		return questionPostMapper.modelToDto(createQuestion);
		
	}
	
	@RequestMapping(value = "/{id}", method = { RequestMethod.DELETE })
	public void delete(@PathVariable("id") Integer id) {
		if (questionService.findById(id).isPresent()) {
			Optional<Question> question;
			question = questionService.findById(id);
			questionService.delete(question.get());

		}
	}
}
	
