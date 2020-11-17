package com.tivit.springboot.backend.ips.apirest.models.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.tivit.springboot.backend.ips.apirest.models.dao.ICotizacionDao;
import com.tivit.springboot.backend.ips.apirest.models.entity.Cotizacion;

public class CotizacionServiceImpl implements ICotizacionService {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Cotizacion> getAllCotizacion() {
		StoredProcedureQuery findByYearProcedure = em
				.createNamedStoredProcedureQuery("getAllEmployees");
		return findByYearProcedure.getResultList();
	}

	
	
}
