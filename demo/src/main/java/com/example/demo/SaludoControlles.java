package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoControlles {
    @GetMapping("/saludo")
    public String saludoBasico() {return "Hola, que hay?";}
}
