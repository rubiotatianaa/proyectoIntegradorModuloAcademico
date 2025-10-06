package com.example.proyectoIntegradorModeloAcademico.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "Grupo")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "materia", nullable = false)
    private String materia;

    @Column(name = "semestre", nullable = false)
    private Integer semestre;

    public Grupo() {
    }

    public Grupo(String nombre, String materia, Integer semestre) {
        this.nombre = nombre;
        this.materia = materia;
        this.semestre = semestre;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

