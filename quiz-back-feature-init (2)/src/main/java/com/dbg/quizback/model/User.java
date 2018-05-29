package com.dbg.quizback.model;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class User {

	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer idUser;

	@Column(nullable = false)
	private String name;

	@Column(unique = true, nullable = false)
	private String email;

	@Column(nullable = false)
	private String password;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = Result.FIELD_USER)
	private List<Result> result;

	}


	

