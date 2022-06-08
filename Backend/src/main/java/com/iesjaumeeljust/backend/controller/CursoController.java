package com.iesjaumeeljust.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iesjaumeeljust.backend.model.Curso;
import com.iesjaumeeljust.backend.service.CursoService;

@RestController
@RequestMapping("/api")
public class CursoController {

    @Autowired
    CursoService cursoService;
    
    @GetMapping("/cursos/modulo")
    @ResponseBody
    public List<Curso> getCursosByModulo(@RequestParam("idModulo") Integer idModulo){
        return cursoService.getCursosByModulo(idModulo);
    }
}
