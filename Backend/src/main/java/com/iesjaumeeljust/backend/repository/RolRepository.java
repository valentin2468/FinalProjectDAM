package com.iesjaumeeljust.backend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.iesjaumeeljust.backend.model.Rol;

public interface RolRepository extends CrudRepository<Rol, Integer> {
    @Query("select r from Rol r where r.nombre = ?1")
    Rol findRolByName(String nombre);
}
