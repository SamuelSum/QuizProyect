package com.dbg.quizback.dto;

import java.io.Serializable;
import java.util.List;

import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Dificulty;

import lombok.Data;


@Data
public class QuestionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8680080386060236852L;
	private Integer idQuestion;
	private String statement;
	private Dificulty dificulty;
	private List<Answer> respuestas;

	
}
