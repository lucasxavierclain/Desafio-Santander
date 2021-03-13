package com.crudsantander.crm.crud.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.crudsantander.crm.crud.model.Cliente;
import com.crudsantander.crm.crud.repository.ClienteRepository;

import java.util.List;
@RestController
@RequestMapping("/clientes")

public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping
	public Cliente deletar(@RequestBody Cliente cliente) {
		clienteRepository.delete(cliente);
		return cliente;
	}
	
	@PutMapping
	public Cliente alterar(@RequestBody Cliente cliente) {
		clienteRepository.saveAndFlush(cliente);
		return cliente;
	}
}
