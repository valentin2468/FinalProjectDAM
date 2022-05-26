package com.iesjaumeeljust.database.controller;

import com.iesjaumeeljust.database.model.Usuario;
import com.iesjaumeeljust.database.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    public Usuario getUsuarioById(@RequestParam("idUsuario") Integer id){
        return usuarioService.findUsuarioById(id);
    }
}
