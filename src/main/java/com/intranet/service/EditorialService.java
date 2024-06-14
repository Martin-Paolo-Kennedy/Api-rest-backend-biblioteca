package com.intranet.service;

import java.util.List;

import com.intranet.entity.Editorial;

public interface EditorialService {
	public abstract Editorial insertaActualizaEditorial(Editorial editorial);
	public abstract List<Editorial> listaEditorial();

	public abstract List<Editorial> listaEditorialPorRazLike(String razon);
	public abstract void eliminarEditorial(int idEditorial);
	
	public abstract List<Editorial> listaConsultaDinamica(String razonSocial, String direccion, int estado, int idPais);
}
