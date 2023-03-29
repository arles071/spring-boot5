package com.bolsasideas.springbootbackendapirest.models.services;

import org.springframework.data.domain.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import com.bolsasideas.springbootbackendapirest.models.entity.Cliente;
import com.bolsasideas.springbootbackendapirest.models.entity.Region;

public interface IClienteService {

	public List<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public List<Region> findAllRegiones();
}
