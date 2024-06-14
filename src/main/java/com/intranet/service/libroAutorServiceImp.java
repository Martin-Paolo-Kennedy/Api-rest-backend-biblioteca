package com.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.intranet.entity.LibroHasAutor;
import com.intranet.repository.libroAutorRepository;

public class libroAutorServiceImp implements libroAutorService{
	@Autowired
	private libroAutorRepository repository;
	
	@Override
	public LibroHasAutor inserta(LibroHasAutor obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

	@Override
	public List<LibroHasAutor> lista() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
