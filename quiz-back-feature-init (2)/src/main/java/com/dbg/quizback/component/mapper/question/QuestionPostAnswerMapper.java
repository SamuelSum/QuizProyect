package com.dbg.quizback.component.mapper.question;

import java.util.List;

import com.dbg.quizback.component.mapper.Mapper;
import com.dbg.quizback.dto.QuestionPostAnswerDTO;
import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Question;

public interface QuestionPostAnswerMapper extends Mapper<Answer, QuestionPostAnswerDTO> {

	Answer dtoToModel(QuestionPostAnswerDTO dto);

}
