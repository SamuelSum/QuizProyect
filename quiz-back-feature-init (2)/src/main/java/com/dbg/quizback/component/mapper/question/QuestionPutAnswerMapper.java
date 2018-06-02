package com.dbg.quizback.component.mapper.question;



import com.dbg.quizback.component.mapper.Mapper;
import com.dbg.quizback.dto.questionDTOs.QuestionPutAnswerDTO;
import com.dbg.quizback.model.Answer;

public interface QuestionPutAnswerMapper extends Mapper<Answer, QuestionPutAnswerDTO> {

	Answer dtoToModel(QuestionPutAnswerDTO dto);

}
