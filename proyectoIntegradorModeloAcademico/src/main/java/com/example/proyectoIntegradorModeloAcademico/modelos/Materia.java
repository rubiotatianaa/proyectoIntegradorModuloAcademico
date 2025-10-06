package com.example.proyectoIntegradorModeloAcademico.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
@Entity
@Table(name="materia")
public class Materia {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer Id_Materia;

    @Column(name = "materia", nullable = false, unique = false, length = 100)
    private String Nombre_Materia;

    @Column(name = "codigo_materia", nullable = false, unique = false, length = 100)
    private String Codigo_Materia;
       // @ManyToOne
       // @JoinColumn(name = "docente_id", referencedColumnName = "id")
    @ManyToOne
    @JoinColumn(name = "fk_materia", referencedColumnName = "id_Materia")
    @JsonBackReference(value = "relacionentrenotasymateria")
    private Materia materia;

    public Materia() {
    }

    public Materia(Integer id_Materia, String nombre_Materia, String codigo_Materia, Materia materia) {
        Id_Materia = id_Materia;
        Nombre_Materia = nombre_Materia;
        Codigo_Materia = codigo_Materia;
        this.materia = materia;
    }

    public Integer getId_Materia() {
        return Id_Materia;
    }

    public void setId_Materia(Integer id_Materia) {
        Id_Materia = id_Materia;
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

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    //public Docente getDocente_id() {
           // return docente;
        }

        //public void setDocente_id(Docente docente) {
            //this.docente = docente;






