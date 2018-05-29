package com.dbg.quizback.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dbg.quizback.model.Result;

public interface ResultDAO extends PagingAndSortingRepository<Result, Integer>{
	

}
