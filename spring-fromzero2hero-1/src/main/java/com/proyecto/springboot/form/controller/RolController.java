package com.proyecto.springboot.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springboot.form.model.Rol;
import com.proyecto.springboot.form.repository.RolRepository;
import com.proyecto.springboot.form.serviceImpl.RolServiceImpl;

@RestController
@RequestMapping("/rol")
public class RolController {
	
	@Autowired
	RolRepository rsi;
	
	@RequestMapping (value = "/getall", method = RequestMethod.GET)
	public @ResponseBody Iterable<Rol> getRoles () {
		return rsi.findAll();								
	}
	
	@RequestMapping (value = "/create", method = RequestMethod.POST)
	public @ResponseBody String save(@RequestBody Rol rol){
		Rol r = rsi.save(rol);
		return "Rol creado con nombre: "+r.getNombre()+", y id "+r.getId()+".";
	}
	
	@RequestMapping (value = "/", method = RequestMethod.GET)
	public @ResponseBody String welcome() {
		return "Welcome from the role section";
	}
	
	
	

}
