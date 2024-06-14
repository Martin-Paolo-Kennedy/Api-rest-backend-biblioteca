package com.intranet.service;

import java.util.List;

import com.intranet.entity.Revista;

public interface RevistaService {
	public abstract Revista regitrarRevista(Revista obj);

    public abstract List<Revista> listaRevista();

    public abstract Revista insertaActualizaRevista(Revista revista);

    public abstract List<Revista> listaRevistaPorNombreLike(String nombre);

    public abstract void eliminaRevista(int idRevista);
    
    public abstract List<Revista> listaConsultaDinamica(String nombre, String frecuencia, int estado,int idPais);
}
