package com.dbg.quizback.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class Quiz {

	public static final String FIELD_COURSE = "course";

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int idQuiz;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = Result.FIELD_QUIZ)
	private List<Result> result;

	@JoinColumn(name = FIELD_COURSE)
	@ManyToOne(fetch = FetchType.LAZY)
	private Course course;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = Tag.FIELD_QUIZ)
	private List<Tag> tags;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = Question.FIELD_QUIZ)
	private List<Question> questions;
}