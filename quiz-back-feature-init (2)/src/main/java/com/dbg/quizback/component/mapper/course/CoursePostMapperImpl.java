package com.dbg.quizback.component.mapper.course;

import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;


import com.dbg.quizback.dto.CoursePostDTO;
import com.dbg.quizback.model.Course;

@Component
public class CoursePostMapperImpl extends AbstractMapper <Course, CoursePostDTO> implements CoursePostMapper {

	@Override
	public Class<? extends CoursePostDTO> dtoClazz() {
		return CoursePostDTO.class;
	}

	@Override
	public Class<? extends Course> modelClazz() {
		return Course.class;
	}

}
