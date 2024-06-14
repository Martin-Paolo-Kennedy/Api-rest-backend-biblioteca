package com.intranet.service;

import java.util.List;

import com.intranet.entity.Libro;

public interface LibroService {
	 public abstract Libro insertaActualizaLibro(Libro obj);

	    public abstract List<Libro> listaLibro();

	    // Agrega un método para consultar libros por título y serie
	    public abstract List<Libro> listaConsultaDinamica(String titulo, String serie);
}
