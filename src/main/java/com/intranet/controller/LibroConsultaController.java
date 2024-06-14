package com.intranet.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.intranet.entity.Libro;
import com.intranet.service.LibroService;


@RestController
@RequestMapping("/url/consultaLibro")
@CrossOrigin(origins = "http://localhost:4200")
public class LibroConsultaController {
	@Autowired
    private LibroService service;

    @GetMapping("/consultaLibroPorParametros")
    @ResponseBody
    public List<Libro> listaConsultaLibro( 
            @RequestParam(name = "titulo" , required = false, defaultValue = "") String titulo,
            @RequestParam(name = "serie" , required = false, defaultValue = "") String serie) {

        List<Libro> lstSalida = service.listaConsultaDinamica("%" + titulo + "%", serie);

        return lstSalida;
    }
}
