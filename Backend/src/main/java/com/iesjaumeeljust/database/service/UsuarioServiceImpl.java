package com.iesjaumeeljust.database.service;

import com.iesjaumeeljust.database.model.Usuario;
import com.iesjaumeeljust.database.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario findUsuarioById(Integer id) {
        return usuarioRepository.findById(id).get();
    }
    
}
