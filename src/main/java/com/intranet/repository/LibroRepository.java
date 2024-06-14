package com.intranet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intranet.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{
static List<Libro> listaConsultaDinamica(String titulo, String serie) {
		
		return null;
	}
}
