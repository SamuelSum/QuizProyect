package com.dbg.quizback.component.mapper.dificulty;

import org.springframework.stereotype.Component;

import com.dbg.quizback.component.mapper.AbstractMapper;
import com.dbg.quizback.dto.DificultyDTO;
import com.dbg.quizback.model.Dificulty;

@Component
public class DificultyMapperImpl extends AbstractMapper<Dificulty, DificultyDTO> implements DificultyMapper{

	@Override
	public Class<? extends DificultyDTO> dtoClazz() {
		// TODO Auto-generated method stub
		return DificultyDTO.class;
	}

	@Override
	public Class<? extends Dificulty> modelClazz() {
		// TODO Auto-generated method stub
		return Dificulty.class;
	}

}
