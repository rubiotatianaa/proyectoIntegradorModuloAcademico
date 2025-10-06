package com.example.proyectoIntegradorModeloAcademico.repositorios;

import com.example.proyectoIntegradorModeloAcademico.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {

    //Buscando un usuario por nombre exacto
    Optional<Usuario> findByNombre(String nombre);

    //Buscando un usuario por correo
    Optional<Usuario>findByCorreo(String correo);

    //Buscando todos los usuarios que tengan un nombre en especifico
    List<Usuario> findByNombreContaining(String nombre);
}
