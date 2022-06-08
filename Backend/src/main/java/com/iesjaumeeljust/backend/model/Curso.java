package com.iesjaumeeljust.backend.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer año;
	@ManyToOne
	@JoinColumn(name = "modulo_curso")
	@JsonManagedReference
	private Modulo modulo;
	@OneToMany(mappedBy = "curso")
	@JsonBackReference
	private List<Asignatura> asignaturas;
	@OneToMany(mappedBy = "curso")
	@JsonBackReference
	private List<Alumno> alumnos;
}
