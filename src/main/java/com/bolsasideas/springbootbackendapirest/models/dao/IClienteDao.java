package com.bolsasideas.springbootbackendapirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsasideas.springbootbackendapirest.models.entity.Cliente;
import com.bolsasideas.springbootbackendapirest.models.entity.Region;

//CrudRepository este puede ir en vez de JpaRepository
public interface IClienteDao extends JpaRepository<Cliente, Long>{

	@Query("from Region")
	public List<Region> findAllRegiones();
}
