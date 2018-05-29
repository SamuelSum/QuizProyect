package com.dbg.quizback.controller;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.quizback.component.mapper.course.CourseMapper;

import com.dbg.quizback.dto.CourseGenericDTO;
import com.dbg.quizback.model.Course;
import com.dbg.quizback.service.CourseService;
import com.dbg.quizback.service.UserService;

@RestController
@RequestMapping(value = "/course")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	CourseMapper courseMapper;
	
	@RequestMapping(method = RequestMethod.GET)
	public Set<CourseGenericDTO> findAll(@RequestParam(defaultValue = "0", required = false) Integer page,
			@RequestParam(defaultValue = "10", required = false) Integer size){
		final Set<Course> coursers = courseService.findAll(PageRequest.of(page, size));
	    return courseMapper.modelToDto(coursers);
	}
	
	
	
	
	
	@RequestMapping(method = RequestMethod.POST)
	public CourseGenericDTO create(@RequestBody CourseGenericDTO dto) {
		final Course course = courseMapper.dtoToModel(dto);
		final Course createCourse = courseService.create(course);
		return courseMapper.modelToDto(createCourse);
		
	}
	
	@RequestMapping(value = "/{id}", method = { RequestMethod.DELETE})
	public void delete (@PathVariable("id") Integer id) {
		if (courseService.findById(id).isPresent()) {
			Optional<Course> course;
			course = courseService.findById(id);
			courseService.delete(course.get());
		}
	}
	

}
