package com.dbg.quizback.dto.courseDTOs;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class CourseDTO implements Serializable {

	private static final long serialVersionUID = 6543743459395572830L;
	private Integer idCourse;
	private Date date;

}
