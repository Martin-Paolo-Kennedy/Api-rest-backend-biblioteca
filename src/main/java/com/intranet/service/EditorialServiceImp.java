package com.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.entity.Editorial;
import com.intranet.repository.EditorialRepository;

@Service
public class EditorialServiceImp implements EditorialService{
	@Autowired	
	private EditorialRepository repEdi;

	
	
	
	@Override
	public Editorial insertaActualizaEditorial(Editorial editorial) {
		// TODO Auto-generated method stub
		return repEdi.save(editorial);
	}

	@Override
	public List<Editorial> listaEditorialPorRazLike(String razon) {
		// TODO Auto-generated method stub
		return repEdi.listaPorRazonSocial(razon);
	}

	@Override
	public void eliminarEditorial(int idEditorial) {
		// TODO Auto-generated method stub
		repEdi.deleteById(idEditorial);
	}

	@Override
	public List<Editorial> listaEditorial() {
		// TODO Auto-generated method stub
		return repEdi.findAll();
	}

	@Override
	public List<Editorial> listaConsultaDinamica(String razonSocial, String direccion, int estado, int idPais) {
		// TODO Auto-generated method stub
		return repEdi.listaConsultaDinamica(razonSocial, direccion, estado, idPais);
	}
}
