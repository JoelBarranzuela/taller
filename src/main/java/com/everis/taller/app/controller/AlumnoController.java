package com.everis.taller.app.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.taller.app.domain.Alumno;
import com.everis.taller.app.repository.IRepositoryAlumno;
import com.everis.taller.app.service.IAlumnoService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/alumnos")
@Log4j2
public class AlumnoController {

	@Autowired
	public IAlumnoService alumnoService;
	
	@Autowired
	public IRepositoryAlumno repo;

	@PostMapping("/guardar")
	public ResponseEntity<Object> metodoGuardarAlumno(@RequestBody Alumno a) {
		
		Alumno alumno= alumnoService.guardarAlumno(a);
		
		return new ResponseEntity<>(alumno, HttpStatus.CREATED);
	}

	@GetMapping("/listar")
	public List<Alumno> metodoListarAlumno() {
		return alumnoService.listarAlumno();
	}

	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Object> metodoActualizarAlumno(@RequestBody Alumno a, @PathVariable Long id) {
		
		
		Optional<Alumno> estudiante = repo.findById(id);
		
		if(!estudiante.isPresent()){
			return ResponseEntity.notFound().build();
		}
		
		//a.setIdAlumno(id);
		
		alumnoService.updateAlumno(a);
		
		return ResponseEntity.accepted().build();
	}

	@DeleteMapping("/eliminar/{id}")
	public void metodoEliminarAlumno(@RequestBody Alumno a, @PathVariable Long id) {
		
		
		
		alumnoService.eliminarAlumno(id);
		System.out.println("EL ALMUNO" + id + " fue eliminado");
		log.info("EL ALUMNO A TRAVES DE LOG " + id + "fue eliminado");

	}

	@GetMapping("/buscar")
	public Alumno metodoBuscarAlumno(@RequestParam Long id) {

		System.out.println("Se obtuvo el" + id);
		log.info("EL ALUMNO A TRAVES DE LOG ");
		return alumnoService.buscarAlumno(id);

	}

}
