package com.everis.taller.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.taller.app.domain.Alumno;

@Repository
public interface IRepositoryAlumno extends JpaRepository<Alumno, Long>{


}
