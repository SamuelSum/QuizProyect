package com.dbg.quizback.model;


import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class Question {
	
	public static final String FIELD_ANSWER = "answer";
	public static final String FIELD_QUIZ = "quiz";

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer idQuestion;
	
	@Column(nullable = false)
	private String statement;
	
	@ManyToMany
	@JoinTable(name = "Question_Quiz",
			   joinColumns = {@JoinColumn(name = "idQuestion")},
			   inverseJoinColumns = {@JoinColumn(name = "idQuiz")})
	private List<Quiz> quiz;
	
	@JoinColumn
	@ManyToOne(fetch = FetchType.LAZY)
	private Dificulty dificulty;
	

	
	@OneToMany(fetch = FetchType.LAZY)
	@Column(name = "ID_ANSWER")
	private List<Answer> answers;
	
	
}




















