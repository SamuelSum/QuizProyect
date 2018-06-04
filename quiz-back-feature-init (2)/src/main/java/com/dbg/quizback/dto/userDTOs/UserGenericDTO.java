package com.dbg.quizback.dto.userDTOs;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserGenericDTO implements Serializable {

	private static final long serialVersionUID = 4205203361918507755L;
	private String email;
	private String name;
	private String password;

}
