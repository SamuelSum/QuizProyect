package com.dbg.quizback.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Answer {
	
	
	public static final String FIELD_QUESTION = "question";
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "ID_ANSWER")
	private Integer idAnswer;
	
	@Column(name = "ANSWER")
	private String answer;
	
	@Column(name = "CORRECT")
	private boolean correct;
	
	
	
	
	@JoinColumn(name = FIELD_QUESTION)
	@ManyToOne(fetch = FetchType.LAZY)
	private Question question;



	
	/*
	@JoinColumn(name = FIELD_COURSE)
	@ManyToOne(fetch = FetchType.LAZY)
	private Course course;
     */
	
	//Falta acotar de tal forma que solo se puedan generar 4 respuestas?
}
