package com.tivit.springboot.backend.ips.apirest.models.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;


@Entity
@Table(name="cotizaciones")

@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "getAllCotizacion", procedureName = "getAllCotizacion", resultClasses = Cotizacion.class) })
public class Cotizacion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
