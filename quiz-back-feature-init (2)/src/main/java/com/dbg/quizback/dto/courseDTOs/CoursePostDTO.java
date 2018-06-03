package com.dbg.quizback.dto.courseDTOs;

import java.io.Serializable;
import java.util.Date;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CoursePostDTO implements Serializable{
	
    
	   
	private static final long serialVersionUID = 142662363701287714L;
	private Date date; // Recuerda que el formato es: yyyy-MM-dd
     
	
	

}
