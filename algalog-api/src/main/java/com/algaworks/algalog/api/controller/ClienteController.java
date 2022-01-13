package com.algaworks.algalog.api.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;
import com.algaworks.algalog.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class ClienteController {
	
	private ClienteRepository repository;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return repository.findAll();
		
	}

}
