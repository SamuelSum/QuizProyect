package com.dbg.quizback.dto.quizDTOs;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class QuizIdDTO implements Serializable {

	
	private static final long serialVersionUID = 6992281858371127894L;
	private Integer idQuiz;
}
