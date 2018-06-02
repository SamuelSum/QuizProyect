package com.dbg.quizback.service;

import com.dbg.quizback.model.Dificulty;

public interface DificultyService extends AbstractCRUDService<Dificulty, Integer>{

	public Dificulty UpdateDifLevel(Dificulty d, Integer dificultyLevel);

}
