package com.iesjaumeeljust.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iesjaumeeljust.backend.model.Rol;
import com.iesjaumeeljust.backend.repository.RolRepository;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    RolRepository rolRepository;

    @Override
    public Rol findRolByName(String nombre) {
        return rolRepository.findRolByName(nombre);
    }

    @Override
    public Rol saveRol(Rol rol) {
        return rolRepository.save(rol);
    }
    
}
