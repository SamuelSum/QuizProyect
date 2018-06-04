package com.dbg.quizback.service;

import java.util.List;
import java.util.Optional;
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
	public List<Course> findAll(Pageable p) {
		int page = p.getPageNumber();
		int size = p.getPageSize();
		return courseDao.findAll(PageRequest.of(page, size)).stream().collect(Collectors.toList());
	}

	@Override
	public void delete(Course t) {
		courseDao.delete(t);

	}

}
