package com.dbg.quizback.component.mapper.user;

import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.userDTOs.UserIdDTO;
import com.dbg.quizback.model.User;

@Component
public class UserIdMapperImpl extends AbstractMapper<User, UserIdDTO> implements UserIdMapper{

	@Override
	public Class<? extends UserIdDTO> dtoClazz() {
	
		return UserIdDTO.class;
	}

	@Override
	public Class<? extends User> modelClazz() {
		
		return User.class;
	}

}
