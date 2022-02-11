package com.example.persona;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @GetMapping("/user/{nombre}")
    public String getDatosPersona(@PathVariable String nombre) {
        Persona p1 = new Persona(nombre, "Jaén", 26);
        return "Hola " + p1.getNombre();
    }

    @GetMapping("/useradd")
    public Persona postPersona() {
        Persona p1 = new Persona("chuchi", "Logroño", 33 + 1);
        return p1;
    }
}