package com.dbg.quizback.dto.quizDTOs;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class QuizPutQuestionsDTO implements Serializable {

	private static final long serialVersionUID = -2948411319518607553L;
	private Integer idQuestion;

}
