package com.dbg.quizback.component.mapper.user;

import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.UserDTO;
import com.dbg.quizback.dto.UserGenericDTO;
import com.dbg.quizback.model.User;

@Component
public class UserGenericMapperImpl extends AbstractMapper<User, UserGenericDTO> implements UserGenericMapper {

	@Override
	public Class<? extends UserGenericDTO> dtoClazz() {
		return UserGenericDTO.class;
	}

	@Override
	public Class<? extends User> modelClazz() {
		return User.class;
	}

}
