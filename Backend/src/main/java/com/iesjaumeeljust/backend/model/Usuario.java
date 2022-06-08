package com.iesjaumeeljust.backend.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {
    @Id
	@Column(updatable = false, nullable = false)
    private String nombre;
    private String password;
    @OneToOne
    @JoinColumn(name = "profesor_id", referencedColumnName = "id")
    @JsonManagedReference
    private Profesor profesor;
    @ManyToOne
    @JoinColumn(name = "rol_usuario")
	@JsonManagedReference
    private Rol rol;

    public Usuario(String nombre, String password, Profesor profesor){
        this.nombre = nombre;
        this.password = password;
        this.profesor = profesor;
    }
    public Usuario(String nombre, String password, Rol rol){
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
    }
}
