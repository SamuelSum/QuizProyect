package com.dbg.quizback.component.mapper.question;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.QuestionPostAnswerDTO;
import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Question;

@Component
public class QuestionPostAnswerMapperImpl  extends AbstractMapper<Answer, QuestionPostAnswerDTO> implements QuestionPostAnswerMapper  {

	@Override
	public Class<? extends QuestionPostAnswerDTO> dtoClazz() {
		// TODO Auto-generated method stub
		return QuestionPostAnswerDTO.class;
	}

	@Override
	public Class<? extends Answer> modelClazz() {
		// TODO Auto-generated method stub
		return Answer.class;
	}

	
}
