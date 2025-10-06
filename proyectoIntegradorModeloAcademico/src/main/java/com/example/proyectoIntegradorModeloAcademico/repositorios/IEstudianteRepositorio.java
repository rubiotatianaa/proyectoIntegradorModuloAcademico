package com.example.proyectoIntegradorModeloAcademico.repositorios;

import com.example.proyectoIntegradorModeloAcademico.modelos.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepositorio extends JpaRepository<Estudiante, Integer> {
}
