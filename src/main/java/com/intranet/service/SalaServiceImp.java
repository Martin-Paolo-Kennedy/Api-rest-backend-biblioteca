package com.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import com.intranet.entity.Sala;
import com.intranet.repository.SalaRepository;

@Service
public class SalaServiceImp implements SalaService{
	@Autowired
    private SalaRepository salaRepository;

    @Override
    public Sala regitrarSala(Sala obj) {
        return salaRepository.save(obj);
    }

    @Override
    public List<Sala> listaSala() {
        return salaRepository.findAll();
    }
    @Override
	public Sala insertaActualizaSala(Sala sala) {
		return salaRepository.save(sala);
	}
	
	@Override
	public List<Sala> listaSalaPorNombreLike (String numero) {
		return salaRepository.listaPorNombreLike(numero);
	}

	@Override
	public void eliminaSala (int idSala) {
		salaRepository.deleteById(idSala);
	}

//NECESARIO PARA RESERVA SALA
	@Override
	public List<Sala> listaSalas(String filtro, Pageable ageable) {
		return salaRepository.listaSalas(filtro, ageable);
	}
//*****************************

	@Override
	public List<Sala> listaConsultaDinamica(String numero, String recursos, int estado, int idSede) {
		return salaRepository.listaConsultaDinamica(numero, recursos, estado, idSede);

	}
}
