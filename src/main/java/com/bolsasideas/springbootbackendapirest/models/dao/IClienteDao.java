package com.bolsasideas.springbootbackendapirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsasideas.springbootbackendapirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
