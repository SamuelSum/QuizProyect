package com.dbg.quizback.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dbg.quizback.dao.TagDAO;
import com.dbg.quizback.model.Tag;

@Service
public class TagServiceImpl  implements TagService {

	@Autowired
	TagDAO tagDao;
	
	@Override
	public Tag create(Tag t) {
		// TODO Auto-generated method stub
		return tagDao.save(t);
	}

	@Override
	public void update(Tag t) {
		tagDao.save(t);
		
	}

	@Override
	public Optional<Tag> findById(Integer id) {
		
		return tagDao.findById(id);
	}

	@Override
	public List<Tag> findAll(Pageable p) {
		int page = p.getPageNumber();
		int size = p.getPageSize();
		return tagDao.findAll(PageRequest.of(page, size)).stream().collect(Collectors.toList());
		
	}

	@Override
	public void delete(Tag t) {
		tagDao.delete(t);
		
	}

}
