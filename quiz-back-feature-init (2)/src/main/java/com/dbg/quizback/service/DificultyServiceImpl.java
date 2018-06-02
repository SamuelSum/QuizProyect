package com.dbg.quizback.service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dbg.quizback.dao.DificultyDAO;
import com.dbg.quizback.model.Dificulty;

@Service
public class DificultyServiceImpl implements DificultyService {

	@Autowired
	DificultyDAO dificultyDao;
	
	@Override
	public void update(Dificulty t) {
		dificultyDao.save(t);
	}

	@Override
	public Optional<Dificulty> findById(Integer id) {
		// TODO Auto-generated method stub
		return dificultyDao.findById(id);
	}

	@Override
	public Set<Dificulty> findAll(Pageable p) {
		int page = p.getPageNumber();
		int size = p.getPageSize();
		return dificultyDao.findAll(PageRequest.of(page, size)).stream().collect(Collectors.toSet());
	}

	@Override
	public void delete(Dificulty t) {
		dificultyDao.delete(t);
		
	}

	@Override
	public Dificulty create(Dificulty t) {
		// TODO Auto-generated method stub
		return dificultyDao.save(t);
	}

	@Override
	public Dificulty UpdateDifLevel(Dificulty d, Integer dificultyLevel) {
		d.setDificultyLevel(dificultyLevel);
		return dificultyDao.save(d);
		
	}


	

}
