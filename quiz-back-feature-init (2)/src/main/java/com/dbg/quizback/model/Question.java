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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;





import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Question {
	
	public static final String FIELD_ANSWER = "answer";
	public static final String FIELD_QUIZ = "quiz";

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int idQuestion;
	
	@Column(nullable = false)
	private String statement;
	
	@ManyToMany
	@JoinTable(name = "Question_Quiz",
			   joinColumns = {@JoinColumn(name = "idQuestion")},
			   inverseJoinColumns = {@JoinColumn(name = "idQuiz")})
	private List<Quiz> quiz;
	
	@OneToOne
	@JoinColumn(name= "ID_DIFICULTAD")
	private Dificulty dificulty;
	

	
	@OneToMany(fetch = FetchType.LAZY)
	@Column(name = "ID_ANSWER")
	private List<Answer> answers;
	
	
}