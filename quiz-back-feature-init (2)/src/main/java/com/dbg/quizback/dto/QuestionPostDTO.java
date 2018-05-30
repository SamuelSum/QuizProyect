package com.dbg.quizback.dto;

import com.dbg.quizback.model.Dificulty;

import lombok.Data;

@Data
public class QuestionPostDTO extends QuestionDTO {

	   private String statement;
	   private Integer dificulty;
}
