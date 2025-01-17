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
@Table(name = "rol_has_opcion")

public class RolHasOpcion {
	@EmbeddedId
	private RolHasOpcionPK rolHasOpcionPK;

	@ManyToOne
	@JoinColumn(name = "idRol", nullable = false, insertable = false, updatable = false)
	private Rol rol;
	
	@ManyToOne
	@JoinColumn(name = "idOpcion", nullable = false, insertable = false, updatable = false)
	private Opcion opcion;

	public RolHasOpcionPK getRolHasOpcionPK() {
		return rolHasOpcionPK;
	}

	public void setRolHasOpcionPK(RolHasOpcionPK rolHasOpcionPK) {
		this.rolHasOpcionPK = rolHasOpcionPK;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Opcion getOpcion() {
		return opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}
	
}
