package com.intranet.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.intranet.entity.Editorial;
import com.intranet.service.EditorialService;
import com.intranet.util.AppSettings;


@Controller
@RequestMapping("/url/editorial")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)

public class EditorialController {
	@Autowired
	private EditorialService EditService;
	
	@GetMapping	
	@ResponseBody
	public ResponseEntity<List<Editorial>> listaEditorial(){
		List<Editorial> lista = EditService.listaEditorial();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<?> inserta(@RequestBody Editorial obj){
		HashMap<String, Object> salida = new HashMap<>();
		
		obj.setFechaActualizacion(new Date());
		obj.setFechaRegistro(new Date());
		obj.setEstado(AppSettings.ACTIVO);
		
		
		Editorial objSalida = EditService.insertaActualizaEditorial(obj);
		if (objSalida == null) {
			salida.put("mensaje","Error en el registro");
		}else {
			salida.put("mensaje","Se registró la Ejemplo con el ID ==> " + objSalida.getIdEditorial());
		}
		return ResponseEntity.ok(salida);
	}
}
