package com.proyecto.springboot.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springboot.form.model.User;
import com.proyecto.springboot.form.repository.UserRepository;
import com.proyecto.springboot.form.serviceImpl.UserServiceImpl;

@RestController
public class TestController {
	
	@Autowired
	UserRepository repo;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody String create(){
		
		User u = new User();
		u.setName("Maria");
		u.setLastname("ruiz");
		u.setAge(21);
		u.setEmail("asdsadasdsa.45@hotmail.com");
		u.setPassword("123456789");
		
		repo.save(u);
		
		return "Hello";
		
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public @ResponseBody String createfromJson(@RequestBody User u) {
		if (u == null) {
			return "fallo";
		}
		else {
			this.repo.save(u);
			return "Nombre: "+ u.getName() + " Apellido: "+u.getLastname()+" Email: "+u.getEmail()+
					" Age: "+u.getAge()+" Password: "+u.getPassword()+" id: "+u.getId();			
		}
		
	}
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public @ResponseBody Iterable<User> getAll(){
		return repo.findAll();
	}
		
	

	
	

}
