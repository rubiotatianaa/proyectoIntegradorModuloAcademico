package com.example.proyectoIntegradorModeloAcademico.repositorios;

import com.example.proyectoIntegradorModeloAcademico.modelos.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INotaRepositorio extends JpaRepository<Nota, Integer> {

}
