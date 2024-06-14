package com.intranet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.intranet.entity.Opcion;
import com.intranet.entity.Rol;
import com.intranet.entity.RolHasOpcion;
import com.intranet.entity.RolHasOpcionPK;
import com.intranet.repository.OpcionRepository;
import com.intranet.repository.RolHasOpcionRepository;
import com.intranet.repository.RolRepository;

public class AsignacionServiceImpl implements AsignacionService{
	@Autowired
    private RolRepository rolRepository;

    @Autowired
    private OpcionRepository opcionRepository;

    @Autowired
    private RolHasOpcionRepository rolHasOpcionRepository;

    @Override
    public List<Rol> obtenerRoles() {
        return rolRepository.findAll();
    }

    @Override
    public List<Opcion> obtenerOpciones() {
        return opcionRepository.findAll();
    }

    @Override
    public List<RolHasOpcion> obtenerAsignaciones() {
        return rolHasOpcionRepository.findAll();
    }

    @Override
    public void agregarAsignacion(int idRol, int idOpcion) {
        Rol rol = rolRepository.findById(idRol).orElse(null);
        Opcion opcion = opcionRepository.findById(idOpcion).orElse(null);

        if (rol != null && opcion != null) {
            RolHasOpcionPK pk = new RolHasOpcionPK();
            pk.setIdRol(idRol);
            pk.setIdOpcion(idOpcion);

            RolHasOpcion rolHasOpcion = new RolHasOpcion();
            rolHasOpcion.setRolHasOpcionPK(pk);
            rolHasOpcion.setRol(rol);
            rolHasOpcion.setOpcion(opcion);

            rolHasOpcionRepository.save(rolHasOpcion);
        }
    }

    @Override
    public void eliminarAsignacion(int idRol, int idOpcion) {
        RolHasOpcionPK pk = new RolHasOpcionPK();
        pk.setIdRol(idRol);
        pk.setIdOpcion(idOpcion);

        rolHasOpcionRepository.deleteById(pk);
    }
}
