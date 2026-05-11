package com.clinicalima.model;

import lombok.Data;

@Data
public class Paciente {
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaRegistro;
    private String estado;
    private String direccion;
    private String telefono;
    private String correo;
}