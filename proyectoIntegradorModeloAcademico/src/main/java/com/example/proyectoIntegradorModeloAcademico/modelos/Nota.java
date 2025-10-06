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


    @ManyToOne
    @JoinColumn(name = "fk_estudiante", referencedColumnName = "id")
    @JsonBackReference(value = "relacionentreesudianteynota")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "fk_materia", referencedColumnName = "id")
    @JsonBackReference(value = "relacionentrenotasymateria")
    private Materia materia;

    public Nota() {
    }

    public Nota(Integer id, Double valor, TipoEvaluacion tipoEvaluacion, LocalDate fecha) {
        this.id = id;
        this.valor = valor;
        this.tipoEvaluacion = tipoEvaluacion;
        this.fecha = fecha;
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

}
