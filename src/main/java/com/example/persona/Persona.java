package com.example.persona;

import lombok.Data;

@Data
public class Persona {
    private String nombre;
    private String poblacion;
    private int edad;

    public Persona (String nombre, String poblacion, int edad) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.edad = edad;
    }
}
