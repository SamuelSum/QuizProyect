package com.dbg.quizback.dto;

import java.io.Serializable;


import com.dbg.quizback.dto.courseDTOs.CourseDTO;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class QuizDTO implements Serializable {

	
	
	private static final long serialVersionUID = -469369518159302308L;
//	private List<QuestionDTO> questions;
	private CourseDTO course;
	//Falta meter Results..y tags
	
	
}
