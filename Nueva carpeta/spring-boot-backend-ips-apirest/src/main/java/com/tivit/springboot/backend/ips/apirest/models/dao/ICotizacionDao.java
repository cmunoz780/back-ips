package com.tivit.springboot.backend.ips.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tivit.springboot.backend.ips.apirest.models.entity.Cotizacion;

public interface ICotizacionDao extends CrudRepository<Cotizacion, Long > {

}
