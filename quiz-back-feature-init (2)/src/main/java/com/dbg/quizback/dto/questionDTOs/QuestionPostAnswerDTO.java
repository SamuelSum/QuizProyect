package com.dbg.quizback.dto.questionDTOs;

import java.io.Serializable;

import com.dbg.quizback.model.Answer;

import lombok.Data;

@Data
public class QuestionPostAnswerDTO implements Serializable {

	private String answer;
	private Boolean correct;
	
}
