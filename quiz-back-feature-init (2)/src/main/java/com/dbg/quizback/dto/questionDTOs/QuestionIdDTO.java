package com.dbg.quizback.dto.questionDTOs;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class QuestionIdDTO implements Serializable {

	private static final long serialVersionUID = -2556791362885236550L;
	private Integer idQuestion;

}
