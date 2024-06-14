package com.intranet.controller;

import java.util.Date;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.intranet.entity.Tesis;
import com.intranet.service.TesisService;
import com.intranet.util.AppSettings;

@RestController
@RequestMapping("/url/tesis")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class TesisController {
	@Autowired
	  private TesisService Service;

	  @PostMapping
	  @ResponseBody
	  public ResponseEntity<?> insertar(@RequestBody Tesis obj) {
	    HashMap<String, Object> salida = new HashMap<>();

	    obj.setFechaActualizacion(new Date());
	    obj.setFechaRegistro(new Date());
	    obj.setEstado(AppSettings.ACTIVO);

	    Tesis objSalida = Service.registrarTesis(obj);

	    if (objSalida == null) {
	      salida.put("mensaje", "Error en el registro");
	    } else {
	      salida.put(
	        "mensaje",
	        "Se registró la Revista con el ID ==> " + objSalida.getIdTesis()
	      );
	    }
	    return ResponseEntity.ok(salida);
	  }
}
