package com.dbg.quizback.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dbg.quizback.dao.UserDAO;
import com.dbg.quizback.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDao;

	//

	@Override
	public User create(User t) {
		return userDao.save(t);
	}

	@Override
	public void update(User t) {
		userDao.save(t);

	}

	@Override
	public Optional<User> findById(Integer id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> findAll(Pageable p) {
		int page = p.getPageNumber();
		int size = p.getPageSize();
		return userDao.findAll(PageRequest.of(page, size)).stream().collect(Collectors.toList());
	}

	@Override
	public void delete(User t) {
		userDao.delete(t);

	}

}
