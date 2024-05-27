package com.aprendizado.aprendizado_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizado.aprendizado_api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
