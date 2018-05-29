package com.dbg.quizback.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.dbg.quizback.model.Dificulty;

@Repository
public interface DificultyDAO extends PagingAndSortingRepository<Dificulty, Integer> {

}
