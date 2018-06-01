package com.dbg.quizback.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AnswerDTO implements Serializable {

	private String idAnswer;
	private String answer;
	private Boolean correct;
	
}
