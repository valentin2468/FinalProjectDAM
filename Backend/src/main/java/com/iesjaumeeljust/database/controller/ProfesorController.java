package com.iesjaumeeljust.database.controller;

import java.util.HashSet;
import java.util.List;

import com.iesjaumeeljust.database.model.Modulo;
import com.iesjaumeeljust.database.service.ProfesorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProfesorController {
    @Autowired
    ProfesorService profesorService;

    @GetMapping("/profesor/modulos")
    @ResponseBody
    public List<Modulo> getModulosByProfesor(@RequestParam("idProfesor") Integer idProfesor){
        return profesorService.findModulosByProfesor(idProfesor);
    }
}
