package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coches")
public class ControladorCoche {
    @GetMapping("/coche")
    public ResponseEntity<Coche> obtenerCoche() {
        Coche c = new Coche("MARCA", "TIPO", "COLOR", 7, 2000f, "Diesel");
        return ResponseEntity.ok(c);
    }

    @PostMapping("/coche")
    public ResponseEntity<Coche> ejemploPostCoche(@RequestBody Coche c) {
        System.out.println("POR CONSOLA: "+ c);
        return ResponseEntity.ok(c);
    }
}
