package com.dbg.quizback.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ChosenAnswer {
	
	public static final String FIELD_USER = "user";
	public static final String FIELD_QUIZ = "quiz";
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer idChosenAnswer;
	
	
	@JoinColumn(name = FIELD_USER)
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
	@JoinColumn(name = FIELD_QUIZ)
	@ManyToOne(fetch = FetchType.LAZY)
	private Quiz quiz;
	

	@OneToOne
	@JoinColumn(name= "ID_ANSWER")
	private Answer chosenAnswer;
	
	@OneToOne
	@JoinColumn(name= "idQuestion")
	private Question question;

}
