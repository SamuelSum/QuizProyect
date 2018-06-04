package com.dbg.quizback.dto.questionDTOs;

import java.io.Serializable;

import lombok.Data;

@Data
public class QuestionPutAnswerDTO implements Serializable {

	private static final long serialVersionUID = 594540464926450058L;
	private String answer;
	private Boolean correct;

}
