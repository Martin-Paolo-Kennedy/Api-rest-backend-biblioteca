package com.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.entity.Revista;
import com.intranet.repository.RevistaRepository;

@Service
public class RevistaServiceImp implements RevistaService{
	@Autowired
    private RevistaRepository revistaRepository;

    @Override
    public Revista regitrarRevista(Revista obj) {
        return revistaRepository.save(obj);
    }

    @Override
    public List<Revista> listaRevista() {
        return revistaRepository.findAll();
    }

    @Override
    public Revista insertaActualizaRevista(Revista revista) {
        return revistaRepository.save(revista);
    }

    @Override
    public List<Revista> listaRevistaPorNombreLike(String nombre) {
        return revistaRepository.listaPorNombreLike(nombre);
    }

    @Override
    public void eliminaRevista(int idRevista) {
        revistaRepository.deleteById(idRevista);
    }

    @Override
    public List<Revista> listaConsultaDinamica(String nombre, String frecuencia, int estado, int idPais) {    
      return revistaRepository.listaConsultaDinamica(nombre, frecuencia, estado, idPais);
    }
}
