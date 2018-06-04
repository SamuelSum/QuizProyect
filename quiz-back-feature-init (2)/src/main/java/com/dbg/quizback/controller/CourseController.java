package com.dbg.quizback.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.quizback.component.mapper.course.CourseMapper;
import com.dbg.quizback.component.mapper.course.CoursePostMapper;
import com.dbg.quizback.component.mapper.user.UserMapper;
import com.dbg.quizback.dto.courseDTOs.CourseDTO;
import com.dbg.quizback.dto.courseDTOs.CoursePostDTO;
import com.dbg.quizback.dto.userDTOs.UserDTO;
import com.dbg.quizback.model.Course;
import com.dbg.quizback.model.User;
import com.dbg.quizback.service.CourseService;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

	@Autowired
	CourseService courseService;

	@Autowired
	CoursePostMapper coursePostMapper;

	@Autowired
	CourseMapper courseMapper;
	
	@Autowired
	UserMapper userMapper;

	@RequestMapping(method = RequestMethod.GET)
	public List<CourseDTO> findAll(@RequestParam(defaultValue = "0", required = false) Integer page,
			@RequestParam(defaultValue = "10", required = false) Integer size) {
		final List<Course> coursers = courseService.findAll(PageRequest.of(page, size));
		return courseMapper.modelToDto(coursers);
	}

	@RequestMapping(method = RequestMethod.POST)
	public CoursePostDTO create(@RequestBody CoursePostDTO dto) {
		final Course course = coursePostMapper.dtoToModel(dto);
		final Course createCourse = courseService.create(course);
		return coursePostMapper.modelToDto(createCourse);

	}

	@RequestMapping(value = "/{id}", method = { RequestMethod.DELETE })
	public void delete(@PathVariable("id") Integer id) {
		if (courseService.findById(id).isPresent()) {
			Optional<Course> course;
			course = courseService.findById(id);
			courseService.delete(course.get());
		}
	}
	
	@RequestMapping(value = "/{id}", method = { RequestMethod.PUT })
	public void update(@PathVariable("id") Integer id, @RequestBody UserDTO dto) {
		User user = userMapper.dtoToModel(dto);
		
		if(courseService.findById(id).isPresent()) {
			Optional<Course> course = courseService.findById(id);
			course.get().getUsers().add(user);
		}
		
		
	}

}
