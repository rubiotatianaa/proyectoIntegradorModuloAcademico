package com.example.proyectoIntegradorModeloAcademico.repositorios;

import com.example.proyectoIntegradorModeloAcademico.modelos.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMatriculaRepositorio extends JpaRepository<Matricula, Integer> {

    // Buscar matrícula por periodo exacto
    List<Matricula> findByPeriodo(String periodo);

    // Buscar matrículas de un estudiante específico
    List<Matricula> findByEstudianteId(Integer estudianteId);

    // Buscar matrículas de una materia específica
    List<Matricula> findByMateriaId(Integer materiaId);

    // Buscar matrículas de un grupo específico
    List<Matricula> findByGrupoId(Integer grupoId);

}
