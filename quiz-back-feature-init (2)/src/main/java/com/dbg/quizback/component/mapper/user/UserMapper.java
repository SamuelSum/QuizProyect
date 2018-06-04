package com.dbg.quizback.component.mapper.user;

import com.dbg.quizback.component.mapper.Mapper;
import com.dbg.quizback.dto.userDTOs.UserDTO;
import com.dbg.quizback.model.User;

public interface UserMapper extends Mapper<User, UserDTO> {

	public User dtoToModel(UserDTO dto);
}
