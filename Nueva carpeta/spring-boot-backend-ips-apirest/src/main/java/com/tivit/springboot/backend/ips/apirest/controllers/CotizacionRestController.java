package com.tivit.springboot.backend.ips.apirest.controllers;

import org.springframework.http.HttpStatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.tivit.springboot.backend.ips.apirest.models.entity.Cotizacion;
import com.tivit.springboot.backend.ips.apirest.models.services.ICotizacionService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class CotizacionRestController {
	
	@Autowired
	private ICotizacionService cotizacionService;
	
	@GetMapping("/cotizaciones")
	public List<Cotizacion> index() {
		return cotizacionService.getAllCotizacion();
	}

}
