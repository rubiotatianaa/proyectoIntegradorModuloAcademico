package com.example.proyectoIntegradorModeloAcademico.modelos.dtos;

public class DTOGrupo {
    private String nombre;
    private String materia;
    private Integer semestre;

    public DTOGrupo() {
    }

    public DTOGrupo(String nombre, String materia, Integer semestre) {
        this.nombre = nombre;
        this.materia = materia;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
}

