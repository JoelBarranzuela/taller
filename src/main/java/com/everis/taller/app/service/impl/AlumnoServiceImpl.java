package com.everis.taller.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.everis.taller.app.domain.Alumno;
import com.everis.taller.app.repository.IRepositoryAlumno;
import com.everis.taller.app.service.IAlumnoService;


@Service
public class AlumnoServiceImpl implements IAlumnoService{
	
	
	@Autowired
	public IRepositoryAlumno repo;

	@Override
	public Alumno guardarAlumno(Alumno a) {
		
		return repo.save(a);

	}

	@Override
	public List<Alumno> listarAlumno() {
		return repo.findAll();
	}

	@Override
	public Alumno updateAlumno(Alumno a) {
		
		return repo.save(a);
	}

	@Override
	public void eliminarAlumno(Long id) {
		
		 repo.deleteById(id);
		
	}

	@Override
	public Alumno buscarAlumno(Long id) {
		
		return repo.findById(id).get();
	}

}
