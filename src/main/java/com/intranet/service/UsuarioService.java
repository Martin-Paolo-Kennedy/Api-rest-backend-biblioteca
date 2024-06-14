package com.intranet.service;

import java.util.List;

import com.intranet.entity.Opcion;
import com.intranet.entity.Rol;
import com.intranet.entity.Usuario;

public interface UsuarioService {
	public abstract List<Opcion> traerEnlacesDeUsuario(int idUsuario);

	public abstract List<Rol> traerRolesDeUsuario(int idUsuario);

	public abstract Usuario buscaPorLogin(String login);
}
