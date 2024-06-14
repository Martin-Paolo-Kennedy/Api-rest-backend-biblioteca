package com.intranet.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import com.intranet.entity.Sala;

@Service
public interface SalaService {
	public abstract Sala regitrarSala(Sala obj);

	  public abstract List<Sala> listaSala();

	  public abstract Sala insertaActualizaSala(Sala sala);


	  public abstract List<Sala> listaSalaPorNombreLike(String numero);

	  public abstract void eliminaSala(int idSala);
	//NECESARIO PARA RESERVA SALA
	  
	  public abstract List<Sala> listaSalas(String filtro, Pageable ageable);
	  /*
		public abstract Sala regitrarSala(Sala obj);
	    public abstract List<Sala> listaSala();
	    public abstract Sala insertaActualizaSala(Sala sala);
		public abstract List<Sala> listaSalaPorNombreLike(String numero);
		public abstract void eliminaSala(int idSala);
		*/
		
		public List<Sala> listaConsultaDinamica(String numero, String recursos, int estado,int idSede);
		/*
	*/
}
