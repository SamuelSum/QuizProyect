package com.dbg.quizback.dto;

import java.util.List;

import com.dbg.quizback.model.Answer;
import com.dbg.quizback.model.Dificulty;

import lombok.Data;

@Data
public class QuestionPostDTO extends QuestionDTO {

	   private String statement;
	   private Dificulty dificulty;
	   private List<Answer> respuestas;
}
