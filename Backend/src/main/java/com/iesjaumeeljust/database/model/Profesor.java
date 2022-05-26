package com.iesjaumeeljust.database.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Profesor {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	@Column(unique = true)
	private String dni;
	private String direccion;
	private String telefono;
	private Date fechaNacimiento;
	@OneToOne
	@JoinColumn(name = "usuario_profesor", referencedColumnName = "id")
	private Usuario usuario;
}
