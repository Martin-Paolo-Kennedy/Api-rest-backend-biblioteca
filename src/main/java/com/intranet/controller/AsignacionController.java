package com.intranet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.intranet.entity.Opcion;
import com.intranet.entity.Rol;
import com.intranet.entity.RolHasOpcion;
import com.intranet.service.AsignacionService;


@RestController
@RequestMapping("/url/asignaciones")
@CrossOrigin(origins = "http://localhost:4200")

public class AsignacionController {
	@Autowired
    private AsignacionService asignacionService;

    @GetMapping("/roles")
    @ResponseBody
    public List<Rol> obtenerRoles() {
        return asignacionService.obtenerRoles();
    }

    @GetMapping("/opciones")
    @ResponseBody
    public List<Opcion> obtenerOpciones() {
        return asignacionService.obtenerOpciones();
    }

    @GetMapping("/asignaciones")
    @ResponseBody
    public List<RolHasOpcion> obtenerAsignaciones() {
        return asignacionService.obtenerAsignaciones();
    }

    @PostMapping("/agregarAsignaciones")
    @ResponseBody
    public void agregarAsignacion(@RequestParam int idRol, @RequestParam int idOpcion) {
        asignacionService.agregarAsignacion(idRol, idOpcion);
    }

    @DeleteMapping("/asignaciones/{idRol}/{idOpcion}")
    @ResponseBody
    public void eliminarAsignacion(@PathVariable int idRol, @PathVariable int idOpcion) {
        asignacionService.eliminarAsignacion(idRol, idOpcion);
    }
}
