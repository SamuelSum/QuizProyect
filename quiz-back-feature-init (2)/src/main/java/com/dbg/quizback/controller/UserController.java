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

import com.dbg.quizback.component.mapper.user.UserGenericMapper;
import com.dbg.quizback.component.mapper.user.UserIdMapper;
import com.dbg.quizback.dto.userDTOs.UserGenericDTO;
import com.dbg.quizback.dto.userDTOs.UserIdDTO;
import com.dbg.quizback.model.User;
import com.dbg.quizback.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	UserGenericMapper userGenericMapper;
	
	@Autowired
	UserIdMapper userIdMapper;
	
	@RequestMapping(method = RequestMethod.GET)
	public Set<UserGenericDTO> findAll(@RequestParam(defaultValue = "0", required = false) Integer page,
			@RequestParam(defaultValue = "10", required = false) Integer size) {
		final Set<User> users = userService.findAll(PageRequest.of(page, size));
		return userGenericMapper.modelToDto(users);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserIdDTO findById(@PathVariable("id") Integer id) {

		final Optional<User> user = userService.findById(id);
		return userIdMapper.modelToDto(user.get());
	}
	 

	@RequestMapping(method = RequestMethod.POST)
	public UserGenericDTO create(@RequestBody UserGenericDTO dto) {
		final User user = userGenericMapper.dtoToModel(dto);
		final User createUser = userService.create(user);
		return userGenericMapper.modelToDto(createUser);
	}

	@RequestMapping(value = "/{id}", method = { RequestMethod.PUT })
	public void update(@PathVariable("id") Integer id, @RequestBody UserIdDTO dto) {
		final User user = userIdMapper.dtoToModel(dto);
		user.setIdUser(id);
		userService.update(user);

	}

	
	@RequestMapping(value = "/{id}", method = { RequestMethod.DELETE })
	public void delete(@PathVariable("id") Integer id) {
		if (userService.findById(id).isPresent()) {
			Optional<User> user;
			user = userService.findById(id);
			userService.delete(user.get());

		}

		
	}

}
