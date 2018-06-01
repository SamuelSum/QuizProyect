package com.dbg.quizback.dto;

import java.io.Serializable;
import java.util.List;

import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Dificulty;

import lombok.Data;


@Data
public class QuestionDTO implements Serializable {

	private Integer idQuestion;
	private String statement;
	private Dificulty dificulty;
	private List<Answer> respuestas;

	
}
