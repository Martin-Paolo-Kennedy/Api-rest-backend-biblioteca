package com.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.entity.Pais;
import com.intranet.repository.PaisRepository;

@Service
public class PaisServiceImp implements PaisService{
	@Autowired
	private PaisRepository repository;

	@Override
	public List<Pais> listaTodos() {
		return repository.findByOrderByNombreAsc();

	}
}
