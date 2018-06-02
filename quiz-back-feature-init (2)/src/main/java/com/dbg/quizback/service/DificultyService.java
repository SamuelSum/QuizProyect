package com.dbg.quizback.service;

import com.dbg.quizback.model.Dificulty;
import com.dbg.quizback.model.Question;

public interface DificultyService extends AbstractCRUDService<Dificulty, Integer>{

	public Dificulty UpdateDifLevel(Dificulty d, Integer dificultyLevel);

	

}
