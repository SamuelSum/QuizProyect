package com.dbg.quizback.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserGenericDTO implements Serializable{
	
	private String email;
	private String name;
	private String password;
	
}
