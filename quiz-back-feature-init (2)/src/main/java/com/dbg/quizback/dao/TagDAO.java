package com.dbg.quizback.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dbg.quizback.model.Tag;

public interface TagDAO extends PagingAndSortingRepository<Tag, Integer>{

}
