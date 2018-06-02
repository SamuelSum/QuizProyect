package com.dbg.quizback.component.mapper.question;



import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.questionDTOs.QuestionPutAnswerDTO;
import com.dbg.quizback.model.Answer;

@Component
public class QuestionPostAnswerMapperImpl  extends AbstractMapper<Answer, QuestionPutAnswerDTO> implements QuestionPutAnswerMapper  {

	@Override
	public Class<? extends QuestionPutAnswerDTO> dtoClazz() {
		// TODO Auto-generated method stub
		return QuestionPutAnswerDTO.class;
	}

	@Override
	public Class<? extends Answer> modelClazz() {
		// TODO Auto-generated method stub
		return Answer.class;
	}

	
}
