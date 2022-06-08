package com.iesjaumeeljust.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iesjaumeeljust.backend.model.Usuario;
import com.iesjaumeeljust.backend.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario")
    public Usuario getUsuarioById(@RequestParam("idUsuario") String nombre){
        return usuarioService.findUsuarioById(nombre);
    }
}
