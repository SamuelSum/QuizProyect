package com.dbg.quizback.component.mapper.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.userDTOs.UserDTO;
import com.dbg.quizback.model.User;
import com.dbg.quizback.service.UserService;

@Component
public class UserMapperImpl extends AbstractMapper<User, UserDTO> implements UserMapper {

	@Autowired
	UserService userService;

	@Autowired
	UserMapper userMapper;

	@Override
	public Class<? extends UserDTO> dtoClazz() {
		// TODO Auto-generated method stub
		return UserDTO.class;
	}

	@Override
	public Class<? extends User> modelClazz() {
		// TODO Auto-generated method stub
		return User.class;
	}

	@Override
	public User dtoToModel(UserDTO dto) {

		Optional<User> userf = userService.findById(dto.getIdUser());

		return userf.get();

	}

}
