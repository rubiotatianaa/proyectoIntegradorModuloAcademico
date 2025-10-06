package com.example.proyectoIntegradorModeloAcademico.modelos.dtos;

import com.example.proyectoIntegradorModeloAcademico.ayudas.RolesUsuarios;

import java.time.LocalDate;

public class DTOEstudiante {

    private String nombre;
    private String contraseña;
    private RolesUsuarios rol;
    private Double promedio;
    private LocalDate fechaNacimiento;

    public DTOEstudiante() {
    }

    public DTOEstudiante(String nombre, String contraseña, RolesUsuarios rol, Double promedio, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.rol = rol;
        this.promedio = promedio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public RolesUsuarios getRol() {
        return rol;
    }

    public void setRol(RolesUsuarios rol) {
        this.rol = rol;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
