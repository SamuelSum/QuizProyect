package com.dbg.quizback.dto.questionDTOs;

import java.io.Serializable;

import lombok.Data;

@Data
public class QuestionPutDificultyDTO implements Serializable {
	
	private static final long serialVersionUID = -3953692826487498633L;
	Integer dificultLevel;

}
