package com.dbg.quizback.dto.questionDTOs;

import lombok.Data;

@Data
public class QuestionPostDTO extends QuestionDTO {

	private static final long serialVersionUID = 6458554530565629064L;
	private String statement;
	//private Integer dificultyLevel;

}
