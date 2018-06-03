package com.dbg.quizback.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.quizback.component.mapper.answer.AnswerMapper;
import com.dbg.quizback.dto.AnswerDTO;
import com.dbg.quizback.model.Answer;
import com.dbg.quizback.service.AnswerService;

@RestController
@RequestMapping(value = "/answer")
public class AnswerController {

	@Autowired
	AnswerService answerService;
	
	@Autowired
	AnswerMapper answerMapper;
	
	@RequestMapping(method = RequestMethod.GET)
	public  List<AnswerDTO> findAll (@RequestParam(defaultValue = "0", required = false) Integer page,
			@RequestParam(defaultValue  = "10", required = false) Integer size){
		final List<Answer> answers = answerService.findAll(PageRequest.of(page, size));
		return answerMapper.modelToDto(answers);
	}
}












