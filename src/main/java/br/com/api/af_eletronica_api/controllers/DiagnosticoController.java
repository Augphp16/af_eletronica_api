package br.com.api.af_eletronica_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.af_eletronica_api.models.Diagnostico;
import br.com.api.af_eletronica_api.repository.DiagnosticoRepository;

@RestController
@RequestMapping("/diagnosticos")
public class DiagnosticoController {

    @Autowired
    private DiagnosticoRepository diagnostico_repository;

    @GetMapping("/listar")
    public Iterable<Diagnostico> listar() {
        return diagnostico_repository.findAll();
    }

    @PostMapping("/cadastrar")
    public Diagnostico cadastrar(@RequestBody Diagnostico diagnostico) {
        return diagnostico_repository.save(diagnostico);
    }

}
