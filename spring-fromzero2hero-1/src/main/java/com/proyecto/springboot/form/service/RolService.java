package com.proyecto.springboot.form.service;

import org.springframework.stereotype.Service;

import com.proyecto.springboot.form.model.Rol;

@Service
public interface RolService {
	
	public Rol create (Rol rol);
	public Rol update (Rol rol);
	public void delete(Rol rol);
	public Rol findById(Long id);
	public Iterable<Rol> findAll();

}
