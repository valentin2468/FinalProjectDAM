package com.iesjaumeeljust.backend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.iesjaumeeljust.backend.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>  {
    @Query("select u from Usuario u where u.nombre = ?1")
    public Usuario findByName(String nombre);
}
