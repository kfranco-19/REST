package com.umg.mark01.core.entities;


import lombok.Data;

@Data
public class Persona {
    private long id;
    private String nombre;
    private String apellido;
    private String apodo;
    private String correo;
    private String direccion;

}

