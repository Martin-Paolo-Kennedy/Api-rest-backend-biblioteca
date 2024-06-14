package com.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.entity.Libro;
import com.intranet.repository.LibroRepository;

@Service
public class LibroServicelmp implements LibroService{
	@Autowired
    private LibroRepository libroRepository;

    @Override
    public Libro insertaActualizaLibro(Libro obj) {
        return libroRepository.save(obj);
    }

    @Override
    public List<Libro> listaLibro() {
        return libroRepository.findAll();
    }

    // Agrega la implementación del nuevo método
    @Override
    public List<Libro> listaConsultaDinamica(String titulo, String serie) {
       
        return LibroRepository.listaConsultaDinamica(titulo, serie);
    }
}
