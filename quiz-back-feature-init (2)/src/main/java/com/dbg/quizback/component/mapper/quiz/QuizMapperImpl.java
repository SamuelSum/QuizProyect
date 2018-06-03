package com.dbg.quizback.component.mapper.quiz;

import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.QuizDTO;
import com.dbg.quizback.model.Quiz;

@Component
public class QuizMapperImpl extends AbstractMapper<Quiz, QuizDTO> implements QuizMapper {

	@Override
	public Class<? extends QuizDTO> dtoClazz() {
		// TODO Auto-generated method stub
		return QuizDTO.class;
	}

	@Override
	public Class<? extends Quiz> modelClazz() {
		// TODO Auto-generated method stub
		return Quiz.class;
	}

}
