package com.dbg.quizback.component.mapper.question;

import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.questionDTOs.QuestionPostDTO;
import com.dbg.quizback.model.Question;

@Component
public class QuestionPostMapperImpl extends AbstractMapper<Question, QuestionPostDTO> implements QuestionPostMapper{

	@Override
	public Class<? extends QuestionPostDTO> dtoClazz() {
		
		return QuestionPostDTO.class;
	}

	@Override
	public Class<? extends Question> modelClazz() {
		
		return Question.class;
	}

}
