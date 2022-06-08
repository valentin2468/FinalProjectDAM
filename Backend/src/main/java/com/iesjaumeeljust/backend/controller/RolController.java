package com.iesjaumeeljust.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iesjaumeeljust.backend.model.Rol;
import com.iesjaumeeljust.backend.service.RolService;

@RestController
@RequestMapping("/api")
public class RolController {
    
    @Autowired
    RolService rolService;
    
    @GetMapping("/rol")
    public Rol getRolByName(@RequestParam("nombre") String nombre){
        return rolService.findRolByName(nombre);
    }
}
