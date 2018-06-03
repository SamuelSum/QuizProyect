package com.dbg.quizback.dto.questionDTOs;

import java.io.Serializable;
import java.util.List;

import com.dbg.quizback.dto.AnswerDTO;
import com.dbg.quizback.model.Dificulty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class QuestionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8680080386060236852L;
	private Integer idQuestion;
	private String statement;
//	private Dificulty dificulty;
	private AnswerDTO respuesta;

	
}
