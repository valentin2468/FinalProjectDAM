package com.iesjaumeeljust.backend.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.iesjaumeeljust.backend.model.Rol;
import com.iesjaumeeljust.backend.model.Usuario;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UsuarioDetails extends Usuario implements UserDetails{

	private static final long serialVersionUID = -3443505686188951096L;
	
	
	public UsuarioDetails() {}
	
	public UsuarioDetails(Usuario usuario) {
		super.setNombre(usuario.getNombre());
		super.setPassword(usuario.getPassword());
		super.setRol(usuario.getRol());
	}
	

	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		return super.getNombre();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<Rol> roles = new HashSet<Rol>();
        roles.add(super.getRol());
        return roles.stream().map((rol) -> new SimpleGrantedAuthority(rol.getNombre())).collect(Collectors.toList());
    }

}