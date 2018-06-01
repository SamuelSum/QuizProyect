package com.dbg.quizback.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
public class Answer {
	
	
	public static final String FIELD_QUESTION = "question";
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "ID_ANSWER")
	private Integer idAnswer;
	
	@Column(name = "ANSWER")
	private String answer;
	
	@Column(name = "CORRECT", columnDefinition = "TINYINT")
	private Boolean correct;
	
	@JoinColumn(name = FIELD_QUESTION)
	@ManyToOne(fetch = FetchType.LAZY)
	private Question question;
}
