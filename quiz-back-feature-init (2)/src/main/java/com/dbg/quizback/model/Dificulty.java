package com.dbg.quizback.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "DIFICULTY")
public class Dificulty {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column
	private Integer idDificulty;
	
	@Column(name = "VALUE_DIFICULTY")
	private Integer dificulty;

	
//	@OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", nullable = false)
//	private Question quiestion;
	
	
}



