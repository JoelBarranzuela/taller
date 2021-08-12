package com.everis.taller.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.taller.app.domain.Alumno;

public interface IRepositoryAlumno extends JpaRepository<Alumno, Long>{

	

}
