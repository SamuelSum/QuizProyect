package com.dbg.quizback.component.mapper.question;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.questionDTOs.QuestionIdDTO;
import com.dbg.quizback.model.Question;
import com.dbg.quizback.service.QuestionService;

@Component
public class QuestionIdMapperImpl extends AbstractMapper<Question, QuestionIdDTO> implements QuestionIdMapper{

	@Autowired
	QuestionService questionService;
	
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


	@Override
	public Question dtoToModel2 (QuestionIdDTO dto) {

		Optional<Question> q = questionService.findById(dto.getIdQuestion());
		return q.get();
	}
}
