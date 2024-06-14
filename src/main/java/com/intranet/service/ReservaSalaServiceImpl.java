package com.intranet.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.entity.ReservaSala;
import com.intranet.entity.Sala;
import com.intranet.entity.Usuario;
import com.intranet.repository.ReservaSalaRepository;
import com.intranet.repository.SalaRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReservaSalaServiceImpl implements ReservaSalaService{
	@Autowired
	  private ReservaSalaRepository repository;

	  @Autowired
	  private SalaRepository salaRepository;

	  @Override
	  @Transactional
	  public ReservaSala registraReservaSala(ReservaSala obj) {
	    Sala sala = new Sala();
	    sala = salaRepository.findById(obj.getSala().getIdSala()).orElse(null);
	    sala.setEstado(obj.getSala().getEstado());

	    Usuario usu = new Usuario();
	    usu.setIdUsuario(obj.getUsuarioRegistro().getIdUsuario());
	    sala.setUsuarioRegistro(usu);

	    sala.setFechaActualizacion(new Date());
	    salaRepository.save(sala);
	    return repository.save(obj);
	  }
}
