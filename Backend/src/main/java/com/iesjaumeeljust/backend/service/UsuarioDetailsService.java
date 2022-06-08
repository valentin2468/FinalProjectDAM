package com.iesjaumeeljust.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.iesjaumeeljust.backend.model.Usuario;
import com.iesjaumeeljust.backend.repository.UsuarioRepository;

public class UsuarioDetailsService implements UserDetailsService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        /* Usuario usuario = usuarioRepository.findByUsuario(username);
        if(usuario == null) {
			throw new UsernameNotFoundException("El usuario " + username + " no se ha encontrado");
		} */
        return null;
    }
    
}
