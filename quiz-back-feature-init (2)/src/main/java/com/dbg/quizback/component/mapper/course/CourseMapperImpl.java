package com.dbg.quizback.component.mapper.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.component.mapper.quiz.QuizMapper;
import com.dbg.quizback.dto.courseDTOs.CourseDTO;
import com.dbg.quizback.dto.quizDTOs.QuizDTO;
import com.dbg.quizback.model.Course;
import com.dbg.quizback.model.Quiz;

@Component
public class CourseMapperImpl extends AbstractMapper<Course, CourseDTO> implements CourseMapper{

	@Autowired
	QuizMapper quizMapper;
	
	
	@Override
	public Class<? extends CourseDTO> dtoClazz() {
		
		return CourseDTO.class;
	}

	@Override
	public Class<? extends Course> modelClazz() {
		
		return Course.class;
	}
	
	public Course dtoToModel (QuizDTO q) {
	
		Quiz quiz = quizMapper.dtoToModel(q);
		
		Course course = quiz.getCourse();
		
		return course;
	}
	

}
