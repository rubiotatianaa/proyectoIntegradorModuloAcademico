package com.example.proyectoIntegradorModeloAcademico.modelos.dtos;

import com.example.proyectoIntegradorModeloAcademico.ayudas.TipoEvaluacion;

import java.time.LocalDate;

public class DTONota {


    private Double valor;
    private TipoEvaluacion tipoEvaluacion;
    private LocalDate fecha;
    private Integer estudianteId;
    private Integer materiaId;

    public DTONota() {
    }

    public DTONota(Double valor, TipoEvaluacion tipoEvaluacion,LocalDate fecha, Integer estudianteId, Integer materiaId) {
        this.valor = valor;
        this.tipoEvaluacion = tipoEvaluacion;
        this.fecha = fecha;
        this.estudianteId = estudianteId;
        this.materiaId = materiaId;
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

    public Integer getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Integer estudianteId) {
        this.estudianteId = estudianteId;
    }

    public Integer getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Integer materiaId) {
        this.materiaId = materiaId;
    }
}
