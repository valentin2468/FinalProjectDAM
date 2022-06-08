package com.iesjaumeeljust.backend.security;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.iesjaumeeljust.backend.model.Usuario;
import com.iesjaumeeljust.backend.repository.UsuarioRepository;

@Service
public class UsuarioDetailsService implements UserDetailsService {

    @Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findById(username)
				.orElseThrow(() -> new UsernameNotFoundException("El usuario " + username + " no se ha encontrado"));
		
		UsuarioDetails usuarioDetails = new UsuarioDetails(usuario);
		
		return usuarioDetails;
	}
}
