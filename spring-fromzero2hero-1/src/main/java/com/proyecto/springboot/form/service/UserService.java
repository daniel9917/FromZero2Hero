package com.proyecto.springboot.form.service;

import com.proyecto.springboot.form.model.User;

public interface UserService {
	
	public User createUser (User user);
	public User updateUser (User user);
	public void deleteUser (User user);
	public User getById (Long id);
	public Iterable<User> getAll();
	
}
