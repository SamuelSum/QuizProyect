package com.dbg.quizback.dto.userDTOs;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserIdDTO implements Serializable {

	private static final long serialVersionUID = -5828600804039922691L;
	private String email;
	private String name;
	private String password;
	private Integer idUser;

}
