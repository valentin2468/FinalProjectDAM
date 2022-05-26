package com.iesjaumeeljust.database.repository;

import com.iesjaumeeljust.database.model.Usuario;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>  {
    
}
