package com.dbg.quizback.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Result {

	public static final String FIELD_USER = "user";
	public static final String FIELD_QUIZ = "quiz";

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	@Column
	private double record;

	@JoinColumn(name = FIELD_USER)
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
	@JoinColumn(name = FIELD_QUIZ)
	@ManyToOne(fetch = FetchType.LAZY)
	private Quiz quiz;
	
	
	//@OneToMany(fetch = FetchType.LAZY, mappedBy = Result.FIELD_USER)
	//private List<Result> result;
	
	

}
