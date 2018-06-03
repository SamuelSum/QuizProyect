package com.dbg.quizback.component.mapper.question;



import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.questionDTOs.QuestionIdDTO;
import com.dbg.quizback.model.Question;

@Component
public class QuestionIdMapperImpl extends AbstractMapper<Question, QuestionIdDTO> implements QuestionIdMapper{

	@Override
	public Class<? extends QuestionIdDTO> dtoClazz() {
		// TODO Auto-generated method stub
		return QuestionIdDTO.class;
	}

	@Override
	public Class<? extends Question> modelClazz() {
		// TODO Auto-generated method stub
		return Question.class;
	}


}
