package com.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.intranet.entity.Tesis;
import com.intranet.repository.TesisRepository;

public class TesisServiceImp implements TesisService{
	@Autowired
	private TesisRepository repository;

	@Override
	public List<Tesis> listarTesis() {
		return repository.findAll();
	}

	@Override
	public Tesis registrarTesis(Tesis Tesis) {
		return repository.save(Tesis);
		
	}

	@Override
	public Tesis actualizaTesis(Tesis obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

	@Override
	public void eliminaTesis(int idTesis) {
		// TODO Auto-generated method stub
		repository.deleteById(idTesis);;
	}

	@Override
	public List<Tesis> listaTesisPorTituloLike(String titulo) {
		// TODO Auto-generated method stub
		return repository.listaPorTituloLike(titulo);
	}
}
