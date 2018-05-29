package com.dbg.quizback.service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dbg.quizback.dao.CourseDAO;
import com.dbg.quizback.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDAO courseDao;
	
	@Override
	public Course create(Course t) {
		
		return courseDao.save(t);
	}

	@Override
	public void update(Course t) {
		courseDao.save(t);
		
	}

	@Override
	public Optional<Course> findById(Integer id) {
		
		return courseDao.findById(id);
	}

	@Override
	public Set<Course> findAll(Pageable p) {
		int page = p.getPageNumber();
		int size = p.getPageSize();
		return courseDao.findAll(PageRequest.of(page, size)).stream().collect(Collectors.toSet());
	}

	@Override
	public void delete(Course t) {
		courseDao.delete(t);
		
		
	}

}