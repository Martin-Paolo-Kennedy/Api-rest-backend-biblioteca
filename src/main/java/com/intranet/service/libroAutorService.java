package com.intranet.service;

import java.util.List;

import com.intranet.entity.LibroHasAutor;

public interface libroAutorService {
	public LibroHasAutor inserta(LibroHasAutor obj);
	public List<LibroHasAutor> lista();
}
