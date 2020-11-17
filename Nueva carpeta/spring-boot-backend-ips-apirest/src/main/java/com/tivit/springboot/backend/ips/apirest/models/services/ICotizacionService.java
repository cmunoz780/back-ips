package com.tivit.springboot.backend.ips.apirest.models.services;

import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;

import com.tivit.springboot.backend.ips.apirest.models.entity.Cotizacion;

public interface ICotizacionService {

	List<Cotizacion> getAllCotizacion();
}
