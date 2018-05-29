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

import com.dbg.quizback.component.mapper.user.UserMapper;
import com.dbg.quizback.dto.UserDTO;
import com.dbg.quizback.dto.UserGenericDTO;
import com.dbg.quizback.dto.UserPostDTO;
import com.dbg.quizback.model.User;
import com.dbg.quizback.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	UserMapper userMapper;
	
	@RequestMapping(method = RequestMethod.GET)
	public Set<UserGenericDTO> findAll(@RequestParam(defaultValue = "0", required = false) Integer page,
			@RequestParam(defaultValue = "10", required = false) Integer size) {
		final Set<User> users = userService.findAll(PageRequest.of(page, size));
		return userMapper.modelToDto(users);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserGenericDTO findById(@PathVariable("id") Integer id) {

		final Optional<User> user = userService.findById(id);
		return userMapper.modelToDto(user.get());
	}
	 

	@RequestMapping(method = RequestMethod.POST)
	public UserGenericDTO create(@RequestBody UserGenericDTO dto) {
		final User user = userMapper.dtoToModel(dto);
		final User createUser = userService.create(user);
		return userMapper.modelToDto(createUser);
	}
/*
	@RequestMapping(value = "/{id}", method = { RequestMethod.PUT })
	public void update(@PathVariable("id") Integer id, @RequestBody UserPostDTO dto) {
		final User user = userMapper.dtoToModel(dto);
		user.setIdUser(id);
		userService.update(user);

	}
*/
	
	@RequestMapping(value = "/{id}", method = { RequestMethod.DELETE })
	public void delete(@PathVariable("id") Integer id) {
		if (userService.findById(id).isPresent()) {
			Optional<User> user;
			user = userService.findById(id);
			userService.delete(user.get());

		}

		
	}

}
