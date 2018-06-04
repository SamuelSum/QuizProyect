package com.dbg.quizback.dto.quizDTOs;

import java.io.Serializable;
import java.util.List;

import com.dbg.quizback.dto.courseDTOs.CourseDTO;
import com.dbg.quizback.dto.questionDTOs.QuestionDTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class QuizGetDTO implements Serializable {
	
	private static final long serialVersionUID = -7136155772673540212L;
	private Integer idQuiz;
	private List<QuestionDTO> questions;
	private CourseDTO course;

}
