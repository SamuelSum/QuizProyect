package com.dbg.quizback.component.mapper.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.component.mapper.answer.AnswerMapper;
import com.dbg.quizback.dto.questionDTOs.QuestionDTO;
import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Question;
import com.dbg.quizback.service.AnswerService;

@Component
public class QuestionMapperImpl extends AbstractMapper<Question, QuestionDTO> implements QuestionMapper {

	@Autowired
	AnswerMapper answerMapper;
	// dto.setCourse(courseMapper.modelToDto(quiz.getCourse()));

	@Autowired
	AnswerService answerService;

	@Override
	public Class<? extends QuestionDTO> dtoClazz() {
		// QuestionDTO dto = new QuestionDTO();
		// dto.setRespuestas(answerMapper.modelToDto(quest));
		return QuestionDTO.class;
	}

	@Override
	public Class<? extends Question> modelClazz() {
		return Question.class;
	}

	@Override
	public QuestionDTO modelToDto(Question q) {
		QuestionDTO dto = new QuestionDTO();
		dto.setIdQuestion(q.getIdQuestion());
		dto.setStatement(q.getStatement());
		List<Answer> ans = answerService.findByIdQuestion(q);
		dto.setRespuestas(answerMapper.modelToDto(ans));
		return dto;
	}

	/*
	 * @Override public QuestionDTO modelToDto (Question q) { QuestionDTO dto = new
	 * QuestionDTO(); dto.setIdQuestion(q.getIdQuestion());
	 * dto.setStatement(q.getStatement()); Optional<Answer>
	 * ans=answerService.findById(q.getAnswers().get(0).getIdAnswer());
	 * dto.setRespuesta(answerMapper.modelToDto(ans.get())); return dto; }
	 * 
	 */

}
