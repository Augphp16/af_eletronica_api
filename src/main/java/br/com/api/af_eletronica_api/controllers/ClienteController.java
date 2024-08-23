package br.com.api.af_eletronica_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.af_eletronica_api.models.Cliente;
import br.com.api.af_eletronica_api.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository cliente_repository;

    @GetMapping("/listar")
    public Iterable<Cliente> listar() {
        return cliente_repository.findAll();
    }

    @PostMapping("/cadastrar")
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        return cliente_repository.save(cliente);
    }

}
