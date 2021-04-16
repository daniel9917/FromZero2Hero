package com.proyecto.springboot.form.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.form.model.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Long>{	

}
