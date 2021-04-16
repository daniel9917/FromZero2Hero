package com.proyecto.springboot.form.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rol {

	/**
	 * There's three types of roles
	 * 
	 * 1. Administrator -> The administrator has the might to create, modify or remove
	 * 					   courses from the platform. Also he can modify users and 
	 * 					   contents in the db.
	 * 2. Teacher -> The teacher can create a course (which is a group of students)
	 * 				 and enable or disable contents for the course.
	 * 3. User -> The user might only access the materials provided by the Teacher.
	 * 
	 * */
	@Id
	Long id;
	
	String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Rol [id=" + id + ", nombre=" + nombre + "]";
	}

	public Rol(Long id, String nombre) {	
		this.id = id;
		this.nombre = nombre;
	}
	
	public Rol() {		
	}

//	//The instance of the type is created according the role.
//	public void assignRol(int type) {
//		switch (type) {
//			case 1:
//				this.id = (long) 1;
//				this.nombre = "Administrador";
//				break;
//			case 2:
//				this.id = (long) 2;
//				this.nombre = "Docente";
//				break;
//			case 3:
//				this.id = (long) 3;
//				this.nombre = "Estudiante";
//				break;
//			default:
//				break;
//		}					
//	}
//	
	
	
	
	

	

	
}
