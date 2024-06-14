package com.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intranet.entity.LibroHasAutor;
import com.intranet.entity.LibroHasAutorPK;

public interface libroAutorRepository extends JpaRepository<LibroHasAutor, LibroHasAutorPK>{

}
