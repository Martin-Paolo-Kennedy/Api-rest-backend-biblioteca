package com.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.entity.Autor;
import com.intranet.repository.AutorRepository;

@Service

public class AutorServiceImp implements AutorService{
	@Autowired	
	private AutorRepository repository;

	@Override
	public Autor insertaActualizaAutor(Autor obj) {
		return repository.save(obj);
	}
	
	@Override
	public List<Autor> listaAutorPorNombreLike(String nombres) {
		return repository.listaPorNombreLike(nombres);
	}

	@Override
	public void eliminaAutor(int idAutor) {
		repository.deleteById(idAutor);
	}
	
	@Override
	public List<Autor> listaConsultaDinamica(String nombres, String telefono, int estado,int idPais) {
		return repository.listaConsultaDinamica(nombres, telefono, estado, idPais);
	}

	@Override
	public List<Autor> listarTodo() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
