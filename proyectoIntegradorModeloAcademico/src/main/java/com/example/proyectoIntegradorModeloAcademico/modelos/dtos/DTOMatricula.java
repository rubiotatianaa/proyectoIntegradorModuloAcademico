package com.example.proyectoIntegradorModeloAcademico.modelos.dtos;

public class DTOMatricula {
    private Integer id;
    private Integer estudianteId;
    private Integer materiaId;
    private Integer grupoId;
    private String periodo;

    public DTOMatricula(){

    }

    public DTOMatricula(Integer id, Integer estudianteId, Integer materiaId, Integer grupoId, String periodo) {
        this.id = id;
        this.estudianteId = estudianteId;
        this.materiaId = materiaId;
        this.grupoId = grupoId;
        this.periodo = periodo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(Integer grupoId) {
        this.grupoId = grupoId;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
