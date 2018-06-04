package com.dbg.quizback.component.mapper.quiz;

import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.quizDTOs.QuizIdDTO;
import com.dbg.quizback.model.Quiz;

@Component
public class QuizIdMapperImpl extends AbstractMapper<Quiz, QuizIdDTO> implements QuizIdMapper {

	@Override
	public Class<? extends QuizIdDTO> dtoClazz() {
		// TODO Auto-generated method stub
		return QuizIdDTO.class;
	}

	@Override
	public Class<? extends Quiz> modelClazz() {
		// TODO Auto-generated method stub
		return Quiz.class;
	}

}
