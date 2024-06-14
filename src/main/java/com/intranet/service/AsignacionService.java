package com.intranet.service;

import java.util.List;

import com.intranet.entity.Opcion;
import com.intranet.entity.Rol;
import com.intranet.entity.RolHasOpcion;

public interface AsignacionService {
	List<Rol> obtenerRoles();
    List<Opcion> obtenerOpciones();
    List<RolHasOpcion> obtenerAsignaciones();
    void agregarAsignacion(int idRol, int idOpcion);
    void eliminarAsignacion(int idRol, int idOpcion);
}
