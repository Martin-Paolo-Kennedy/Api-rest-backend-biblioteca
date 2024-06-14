package com.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intranet.entity.Autor;
import com.intranet.entity.Libro;
import com.intranet.entity.LibroHasAutor;
import com.intranet.entity.LibroHasAutorPK;
import com.intranet.repository.AutorRepository;
import com.intranet.repository.LibroRepository;
import com.intranet.repository.libroAutorRepository;

@Service
public class AsignacionLibroAutorServiceImp implements AsignacionLibroAutorService{
	@Autowired
	private LibroRepository libRepo;
	
	@Autowired 
	private AutorRepository AutRepo;
	
	@Autowired
	private libroAutorRepository libAutRepo;
	
	@Override
	public List<Libro> obtenerLibro() {
		// TODO Auto-generated method stub
		return libRepo.findAll();
	}

	@Override
	public List<Autor> obtenerAutor() {
		// TODO Auto-generated method stub
		return AutRepo.findAll();
	}

	@Override
	public List<LibroHasAutor> obtenerAsignacion() {
		// TODO Auto-generated method stub
		return libAutRepo.findAll();
	}

	@Override
	public void agregarAsignacion(int idLibro,int idAutor) {
		// TODO Auto-generated method stub
		Libro lib = libRepo.findById(idLibro).orElse(null);
        Autor aut = AutRepo.findById(idAutor).orElse(null);

        if (lib != null && aut != null) {
            LibroHasAutorPK pk = new LibroHasAutorPK();
            pk.setIdAutor(idAutor);
            pk.setIdLibro(idLibro);

            LibroHasAutor libHasAutor = new LibroHasAutor();
            libHasAutor.setLibroHasAutorPK(pk);
            libHasAutor.setLibro(lib);
            libHasAutor.setAutor(aut);

            libAutRepo.save(libHasAutor);
        }
	}

	@Override
	public void eliminarAsignacion(int idLibro, int idAutor) {
		// TODO Auto-generated method stub
		LibroHasAutorPK pk = new LibroHasAutorPK();
        pk.setIdLibro(idLibro);
        pk.setIdAutor(idAutor);

        libAutRepo.deleteById(pk);
	}
}
