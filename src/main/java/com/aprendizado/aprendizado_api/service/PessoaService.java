package com.aprendizado.aprendizado_api.service;

import org.springframework.stereotype.Service;

import com.aprendizado.aprendizado_api.model.Pessoa;
import com.aprendizado.aprendizado_api.repository.PessoaRepository;

import lombok.AllArgsConstructor;

@Service // So indentificando
@AllArgsConstructor // cria automaticamente construtor com todos argumentos
public class PessoaService {
    private PessoaRepository pessoaRepository;

    public Pessoa criar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa); 
    }
}
