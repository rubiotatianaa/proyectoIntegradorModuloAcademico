package com.example.proyectoIntegradorModeloAcademico.repositorios;
import com.example.proyectoIntegradorModeloAcademico.modelos.Grupo;
import com.example.proyectoIntegradorModeloAcademico.modelos.mapas.IMapaGrupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IGrupoRepositorio extends JpaRepository<Grupo, Long> {

    // Buscar por nombre
    List<IMapaGrupo> findByNombre(String nombre);

    // Buscar por materia
    List<IMapaGrupo> findByMateria(String materia);

    //  Buscar por semestre
    List<IMapaGrupo> findBySemestre(Integer semestre);

    //  Buscar por nombre y semestre
    List<IMapaGrupo> findByNombreAndSemestre(String nombre, Integer semestre);
}
