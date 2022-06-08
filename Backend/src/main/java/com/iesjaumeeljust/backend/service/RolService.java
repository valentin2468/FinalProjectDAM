package com.iesjaumeeljust.backend.service;

import com.iesjaumeeljust.backend.model.Rol;

public interface RolService {
    public Rol findRolByName(String nombre);
    public Rol saveRol(Rol rol);
}
