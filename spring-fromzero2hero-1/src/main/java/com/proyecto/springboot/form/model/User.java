package com.proyecto.springboot.form.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class User {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@Id	
	Long id;
		
	@OneToOne
	@MapsId
	@JoinColumn(name = "role_id")
	Rol role_id;
		
	String name;
	String lastname;
	int age;
	String email;
	String password;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Rol getRole_id() {
		return role_id;
	}
	public void setRole_id(Rol role_id) {
		this.role_id = role_id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", role_id=" + role_id + ", name=" + name + ", lastname=" + lastname + ", age=" + age
				+ ", email=" + email + ", password=" + password + "]";
	}


	
	
	
			
}
