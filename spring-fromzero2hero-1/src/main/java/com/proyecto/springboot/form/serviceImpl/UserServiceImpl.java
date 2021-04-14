package com.proyecto.springboot.form.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.springboot.form.model.User;
import com.proyecto.springboot.form.repository.UserRepository;
import com.proyecto.springboot.form.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository repo;

	@Override
	public User createUser(User user) {
		return repo.save(user);
	}

	@Override
	public User updateUser(User user) {
		return repo.save(user);
	}

	@Override
	public void deleteUser(User user) {
		repo.delete(user);
		
	}

	@Override
	public User getById(Long id) {		
		return repo.findById(id).get();
	}

	@Override
	public Iterable<User> getAll() { 
		return repo.findAll();
	}
	
	
	
	

}
