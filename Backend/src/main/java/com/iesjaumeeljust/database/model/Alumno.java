package com.iesjaumeeljust.database.model;

import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Alumno {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	@Column(unique = true)
	private String dni;
	private String direccion;
	private String telefono;
	private Date fechaNacimiento;
	
	@ManyToOne
	@JoinColumn(name = "curso_alumno")
	private Curso curso;
	
}
