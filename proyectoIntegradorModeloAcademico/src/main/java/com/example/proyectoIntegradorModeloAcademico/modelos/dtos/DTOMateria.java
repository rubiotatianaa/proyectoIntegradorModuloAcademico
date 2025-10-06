package com.example.proyectoIntegradorModeloAcademico.modelos.dtos;

import jakarta.persistence.Column;

public class DTOMateria {
    private String Nombre_Materia;

    private String Codigo_Materia;

    public DTOMateria() {
    }

    public DTOMateria(String nombre_Materia, String codigo_Materia) {
        Nombre_Materia = nombre_Materia;
        Codigo_Materia = codigo_Materia;
    }

    public String getNombre_Materia() {
        return Nombre_Materia;
    }

    public void setNombre_Materia(String nombre_Materia) {
        Nombre_Materia = nombre_Materia;
    }

    public String getCodigo_Materia() {
        return Codigo_Materia;
    }

    public void setCodigo_Materia(String codigo_Materia) {
        Codigo_Materia = codigo_Materia;
    }
}