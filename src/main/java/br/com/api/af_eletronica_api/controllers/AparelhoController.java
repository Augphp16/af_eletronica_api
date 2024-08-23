package br.com.api.af_eletronica_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.af_eletronica_api.models.Aparelho;
import br.com.api.af_eletronica_api.repository.AparelhoRepository;

@RestController
@RequestMapping("/aparelhos")
public class AparelhoController {

    @Autowired
    private AparelhoRepository aparelho_repository;

    @GetMapping("/listar")
    public Iterable<Aparelho> listar() {
        return aparelho_repository.findAll();
    }

    @PostMapping("/cadastrar")
    public Aparelho cadastrar(@RequestBody Aparelho aparelho) {
        return aparelho_repository.save(aparelho);
    }
    
}
