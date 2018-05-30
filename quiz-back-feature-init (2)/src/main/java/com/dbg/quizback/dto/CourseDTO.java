package com.dbg.quizback.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.dbg.quizback.model.Quiz;

import lombok.Data;

@Data
public class CourseDTO implements Serializable{

	
	   private Integer idCourse;
	   private Date date;
       private List<Quiz> quiz;
}
