package com.proyecto.springboot.form.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.springboot.form.model.Rol;
import com.proyecto.springboot.form.repository.RolRepository;
import com.proyecto.springboot.form.service.RolService;

@Service
public class RolServiceImpl implements RolService{

	@Autowired
	RolRepository repo;
	
	@Override
	public Rol create(Rol rol) {
	
		return repo.save(rol);
	}

	@Override
	public Rol update(Rol rol) {
		return repo.save(rol);
	}

	@Override
	public void delete(Rol rol) { 
		repo.delete(rol);
	}

	@Override
	public Rol findById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public Iterable<Rol> findAll() {		// 
		return repo.findAll();
	}

	public RolServiceImpl(RolRepository repo) {		
		this.repo = repo;
	}
	
	
	

}
