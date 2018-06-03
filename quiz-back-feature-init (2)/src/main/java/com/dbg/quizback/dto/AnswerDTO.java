package com.dbg.quizback.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AnswerDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8092537752530027930L;
	private String idAnswer;
	private String answer;
	private Boolean correct;
	
}
