package com.dbg.quizback.component.mapper.quiz;

import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.quizDTOs.QuizGetDTO;
import com.dbg.quizback.model.Quiz;

@Component
public class QuizGetMapperImpl extends AbstractMapper<Quiz, QuizGetDTO> implements QuizGetMapper {

	@Override
	public Class<? extends QuizGetDTO> dtoClazz() {
		// TODO Auto-generated method stub
		return QuizGetDTO.class;
	}

	@Override
	public Class<? extends Quiz> modelClazz() {
		// TODO Auto-generated method stub
		return Quiz.class;
	}

}
