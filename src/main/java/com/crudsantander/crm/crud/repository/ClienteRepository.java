package com.crudsantander.crm.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crudsantander.crm.crud.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long>{
	
}
