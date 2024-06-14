package com.intranet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intranet.entity.Autor;

@Service

public interface AutorService {
	public abstract Autor insertaActualizaAutor(Autor obj);
	public abstract List<Autor> listaAutorPorNombreLike(String nombres);
	public abstract void eliminaAutor(int idAutor);
	public abstract List<Autor> listarTodo();
	public List<Autor> listaConsultaDinamica(String nombres, String telefono, int estado,int idPais);
}

