package com.intranet.service;

import java.util.List;

import com.intranet.entity.Tesis;

public interface TesisService {
	public abstract Tesis registrarTesis(Tesis obj);
	public abstract List<Tesis> listarTesis();
	
	public abstract Tesis actualizaTesis(Tesis obj);
	public abstract void eliminaTesis(int idTesis);
	public abstract List<Tesis> listaTesisPorTituloLike(String titulo);
}
