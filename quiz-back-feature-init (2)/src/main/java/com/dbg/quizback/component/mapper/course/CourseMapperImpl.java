package com.dbg.quizback.component.mapper.course;

import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;

import com.dbg.quizback.dto.CourseGenericDTO;
import com.dbg.quizback.model.Course;

@Component
public class CourseMapperImpl extends AbstractMapper <Course, CourseGenericDTO> implements CourseMapper {

	@Override
	public Class<? extends CourseGenericDTO> dtoClazz() {
		return CourseGenericDTO.class;
	}

	@Override
	public Class<? extends Course> modelClazz() {
		return Course.class;
	}

}
