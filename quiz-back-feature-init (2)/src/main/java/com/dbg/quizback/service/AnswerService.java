package com.dbg.quizback.service;

import java.util.List;

import com.dbg.quizback.model.Answer;

public interface AnswerService extends AbstractCRUDService<Answer, Integer>{

	void create4Answer(Answer answers);

}
