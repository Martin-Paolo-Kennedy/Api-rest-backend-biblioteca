package com.intranet.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "libro_tiene_autor")

public class LibroHasAutor {
	@EmbeddedId
	private LibroHasAutorPK libroHasAutorPK;

	@ManyToOne
	@JoinColumn(name = "idLibro", nullable = false, insertable = false, updatable = false)
	private Libro  libro;
	
	@ManyToOne
	@JoinColumn(name = "idAutor", nullable = false, insertable = false, updatable = false)
	private Autor autor;

	public LibroHasAutorPK getLibroHasAutorPK() {
		return libroHasAutorPK;
	}

	public void setLibroHasAutorPK(LibroHasAutorPK libroHasAutorPK) {
		this.libroHasAutorPK = libroHasAutorPK;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
