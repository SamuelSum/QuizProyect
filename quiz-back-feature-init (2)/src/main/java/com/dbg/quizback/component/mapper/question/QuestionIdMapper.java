package com.dbg.quizback.component.mapper.question;

import com.dbg.quizback.component.mapper.Mapper;
import com.dbg.quizback.dto.questionDTOs.QuestionIdDTO;
import com.dbg.quizback.model.Question;

public interface QuestionIdMapper extends Mapper<Question, QuestionIdDTO> {

	Question dtoToModel2(QuestionIdDTO dto);

}
