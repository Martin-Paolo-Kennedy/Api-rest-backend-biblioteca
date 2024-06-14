package com.intranet.service;

import java.util.List;

import com.intranet.entity.Ejemplo;

public interface EjemploService {
	public abstract Ejemplo insertaActualizaEjemplo(Ejemplo obj);
	public abstract List<Ejemplo> listaEjemplo();
}
