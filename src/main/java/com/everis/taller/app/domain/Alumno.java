package com.everis.taller.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_alumno")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alumno", length = 5)
	private Long idAlumno;
	
	@Column(name = "nombre_alumno", length = 5, nullable = true)
	@Max(value = 5)
	private String nombre;
	
	@Column(name = "edad_alumno", length = 5, nullable = true)
	@NotNull
	@Max(value = 5)
	private Integer edad;
	
	@Column(name = "apell_alumno", length = 5, nullable = true)
	@Max(value = 5)
	private String apellidos;

	@Column(name = "dni_Alumno", length = 8, unique = true, nullable = false)
	@Size(max = 8)
	private Long dni;
	
	@Column(name = "direccion", length = 100, nullable = true)
	@Size(max = 100)
	private String direccion;
	
}
