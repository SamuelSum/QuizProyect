package com.dbg.quizback.component.mapper.quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.component.mapper.course.CourseMapper;
import com.dbg.quizback.component.mapper.question.QuestionMapper;
import com.dbg.quizback.dto.quizDTOs.QuizGetDTO;
import com.dbg.quizback.model.Question;
import com.dbg.quizback.model.Quiz;
import com.dbg.quizback.service.QuestionService;

@Component
public class QuizGetMapperImpl extends AbstractMapper<Quiz, QuizGetDTO> implements QuizGetMapper {

	@Autowired
	QuestionService questionService;

	@Autowired
	QuestionMapper questionMapper;

	@Autowired
	CourseMapper courseMapper;

	@Override
	public Class<? extends QuizGetDTO> dtoClazz() {
		// TODO Auto-generated method stub
		return QuizGetDTO.class;
	}

	@Override
	public Class<? extends Quiz> modelClazz() {
		// TODO Auto-generated method stub
		return Quiz.class;
	}

	@Override
	public QuizGetDTO modelToDto(Quiz q) {
		QuizGetDTO dto = new QuizGetDTO();
		dto.setIdQuiz(q.getIdQuiz());
		List<Question> questions = questionService.findByIdQuiz(q);
		dto.setCourse(courseMapper.modelToDto(q.getCourse()));
		dto.setQuestions(questionMapper.modelToDto(questions));
		return dto;

	}

}
