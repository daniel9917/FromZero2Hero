package com.proyecto.springboot.form.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.form.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
