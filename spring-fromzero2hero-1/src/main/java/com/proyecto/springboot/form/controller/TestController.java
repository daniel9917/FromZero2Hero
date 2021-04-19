package com.proyecto.springboot.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.springboot.form.model.Rol;
import com.proyecto.springboot.form.model.User;
import com.proyecto.springboot.form.repository.RolRepository;
import com.proyecto.springboot.form.repository.UserRepository;
import com.proyecto.springboot.form.serviceImpl.UserServiceImpl;

@RestController
public class TestController {
	
	@Autowired
	UserRepository urepo;
	
	@Autowired
	RolRepository rrepo;
	
	private Rol r;
	
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody String create(){
		
		User u = new User();
		u.setName("Maria");
		u.setLastname("ruiz");
		u.setAge(21);
		u.setEmail("asdsadasdsa.45@hotmail.com");
		u.setPassword("123456789");
		
		urepo.save(u);
		
		return "Hello";
		
	}
	
	
	@RequestMapping(value = "/post/{id}", method = RequestMethod.POST)
	public @ResponseBody String createAdmin(@RequestBody User u, @PathVariable int id) {
		
		
		r = this.rrepo.findById((long) id).get(); 				
		if(r == null || u == null) {
			return "fallo";
		}
		else{
			u.setRole_id(r);
			this.urepo.save(u);
			return "Nombre: "+ u.getName() + " Apellido: "+u.getLastname()+" Email: "+u.getEmail()+
					" Age: "+u.getAge()+" Password: "+u.getPassword()+" id: "+u.getId()+", rol: "+r.getNombre();			
		}
		
	}
	
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public @ResponseBody Iterable<User> getAll(){
		return urepo.findAll();
	}
		
	

	
	

}
