package com.tivit.springboot.backend.ips.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.tivit.springboot.backend.ips.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
