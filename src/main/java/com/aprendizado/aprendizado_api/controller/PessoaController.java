package com.aprendizado.aprendizado_api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendizado.aprendizado_api.model.Pessoa;
import com.aprendizado.aprendizado_api.service.PessoaService;
//Dentro de controller nunca colocamos repository, apenas services

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/pessoa")
@AllArgsConstructor // instanciar os atributos da classe

public class PessoaController {
    private PessoaService pessoaService;
    @PostMapping
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa){
        return pessoaService.criar(pessoa);
    } 
}
