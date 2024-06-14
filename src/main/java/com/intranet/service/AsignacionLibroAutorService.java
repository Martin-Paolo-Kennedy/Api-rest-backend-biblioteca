package com.intranet.service;

import java.util.List;

import com.intranet.entity.Autor;
import com.intranet.entity.Libro;
import com.intranet.entity.LibroHasAutor;

public interface AsignacionLibroAutorService {
	List<Libro> obtenerLibro();
    List<Autor> obtenerAutor();
    List<LibroHasAutor> obtenerAsignacion();
    void agregarAsignacion(int idLibro,int idAutor);
    void eliminarAsignacion(int idLibro,int idAutor);
}
