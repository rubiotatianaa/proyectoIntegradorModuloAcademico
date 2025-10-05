package com.example.proyectoIntegradorModeloAcademico.modelos;

import com.example.proyectoIntegradorModeloAcademico.ayudas.TipoEvaluacion;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "notas")
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "valor", nullable = false, unique = false)
    private Double valor;

    @Column(name = "tipoevaluacion", nullable = false, unique = false)
    @Enumerated(EnumType.STRING)
    private TipoEvaluacion tipoEvaluacion;

    @Column(name = "fecha", nullable = false, length = 20)
    private LocalDate fecha;

    @Column(name = "estudiante_id", nullable = false, unique = true)
    private Integer estudiante_id;

    @Column(name = "materia_id", nullable = false, unique = true)
    private Integer materia_id;


    public Nota() {
    }

    public Nota(Integer id, Double valor, TipoEvaluacion tipoEvaluacion, LocalDate fecha, Integer estudiante_id, Integer materia_id) {
        this.id = id;
        this.valor = valor;
        this.tipoEvaluacion = tipoEvaluacion;
        this.fecha = fecha;
        this.estudiante_id = estudiante_id;
        this.materia_id = materia_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public TipoEvaluacion getTipoEvaluacion() {
        return tipoEvaluacion;
    }

    public void setTipoEvaluacion(TipoEvaluacion tipoEvaluacion) {
        this.tipoEvaluacion = tipoEvaluacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getEstudiante_id() {
        return estudiante_id;
    }

    public void setEstudiante_id(Integer estudiante_id) {
        this.estudiante_id = estudiante_id;
    }

    public Integer getMateria_id() {
        return materia_id;
    }

    public void setMateria_id(Integer materia_id) {
        this.materia_id = materia_id;
    }
}
