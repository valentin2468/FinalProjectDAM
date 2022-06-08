package com.iesjaumeeljust.backend.service;

import com.iesjaumeeljust.backend.model.Usuario;

public interface UsuarioService {
    public Usuario findUsuarioById(String nombre);
    public Usuario saveUsuario(Usuario usuario);
}
