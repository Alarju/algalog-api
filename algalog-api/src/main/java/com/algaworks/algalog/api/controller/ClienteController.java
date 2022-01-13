package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var Cliente1 = new Cliente();
		Cliente1.setId(1L);
		Cliente1.setNome("João");
		Cliente1.setTelefone("11 989206528");
		Cliente1.setEmail("joao.ramalho@gmail.com");
		
		var Cliente2 = new Cliente();
		Cliente2.setId(2L);
		Cliente2.setNome("Maria");
		Cliente2.setTelefone("11 963068287");
		Cliente2.setEmail("maria.das.dores@gmail.com");
		
		return Arrays.asList(Cliente1, Cliente2);
		
	}

}
