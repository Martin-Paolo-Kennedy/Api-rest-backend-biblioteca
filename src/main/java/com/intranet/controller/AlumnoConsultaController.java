package com.intranet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.intranet.entity.Alumno;
import com.intranet.service.AlumnoService;
import com.intranet.util.AppSettings;


//consultaAlumno
@RestController
@RequestMapping("/url/consultaAlumno")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)

public class AlumnoConsultaController {
	@Autowired
	private AlumnoService service;
	
	@GetMapping("/consultaAlumnoPorParametros")
	@ResponseBody
	public List<Alumno> listaConsultaAlumno( 
					@RequestParam(name = "nombres" , required = false, defaultValue = "") String nombres,
					@RequestParam(name = "apellidos" , required = false, defaultValue = "") String apellidos,
					@RequestParam(name = "dni" , required = false, defaultValue = "") String dni,
					@RequestParam(name = "idPais" , required = false, defaultValue = "-1") int idPais){

		List<Alumno> lstSalida = service.listaConsultaDinamica("%"+ nombres + "%", "%"+ apellidos + "%", dni, idPais);
		
		return lstSalida;
	}
}
