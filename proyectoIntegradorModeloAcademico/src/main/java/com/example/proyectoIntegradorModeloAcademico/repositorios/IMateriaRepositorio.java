package com.example.proyectoIntegradorModeloAcademico.repositorios;

import com.example.proyectoIntegradorModeloAcademico.modelos.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IMateriaRepositorio extends JpaRepository<Materia,String> {

    //buacar materia por nombre exacto
    Optional<Materia> findByNombre(String Nombre_materia);

    // buscar materia por codigo
    Optional<Materia>findyByCodigo(String Codigo_materia);

}
