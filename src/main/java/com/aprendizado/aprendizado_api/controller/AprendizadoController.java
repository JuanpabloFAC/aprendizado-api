package com.aprendizado.aprendizado_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendizado")
public class AprendizadoController {
    
    @GetMapping("/hello")
    public String aprendizado() {
        return "Aprendizado API";
    }
}
