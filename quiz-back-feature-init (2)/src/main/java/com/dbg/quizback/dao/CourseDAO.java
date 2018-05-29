package com.dbg.quizback.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dbg.quizback.model.Course;

public interface CourseDAO extends PagingAndSortingRepository<Course, Integer>{

}
