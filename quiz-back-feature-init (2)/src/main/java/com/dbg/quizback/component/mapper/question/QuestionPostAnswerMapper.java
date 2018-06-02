package com.dbg.quizback.component.mapper.question;



import com.dbg.quizback.component.mapper.Mapper;
import com.dbg.quizback.dto.questionDTOs.QuestionPostAnswerDTO;
import com.dbg.quizback.model.Answer;

public interface QuestionPostAnswerMapper extends Mapper<Answer, QuestionPostAnswerDTO> {

	Answer dtoToModel(QuestionPostAnswerDTO dto);

}
