package com.everis.taller.app.service;

import java.util.List;

import com.everis.taller.app.domain.Alumno;

public interface IAlumnoService {
	
	public Alumno guardarAlumno(Alumno a);
	public List<Alumno> listarAlumno();
	public Alumno updateAlumno(Alumno a);
	public void eliminarAlumno(Long id);
	public Alumno buscarAlumno(Long id);
}
