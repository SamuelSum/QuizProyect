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
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
public class Tag {
	
	public static final String FIELD_QUIZ = "quiz";
	public static final String FIELD_TAG = "tag";
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer idTag;
	
	@Column(name = "TAG_TYPE")
	private String tag;
	
	@OneToMany(fetch =  FetchType.LAZY)
	private List<Question> question;
	
	@ManyToMany
	@JoinTable(name = "TAG_QUIZ",
			   joinColumns = {@JoinColumn(name = "idTag")},
			   inverseJoinColumns = {@JoinColumn(name = "idQuiz")})
	private List<Quiz> quiz;


}
