package com.bolsasideas.springbootbackendapirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bolsasideas.springbootbackendapirest.models.entity.Cliente;

//CrudRepository este puede ir en vez de JpaRepository
public interface IClienteDao extends JpaRepository<Cliente, Long>{

}
