package com.example.proyectoIntegradorModeloAcademico.modelos.mapas;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTOGrupo;
import com.example.proyectoIntegradorModeloAcademico.modelos.Grupo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaGrupo {

    // Convierte una entidad en DTO
    DTOGrupo convertir_a_dto(Grupo entidad);

    // Convierte un DTO en entidad
    Grupo convertir_a_entidad(DTOGrupo dto);

    // Convierte una lista de entidades en una lista de DTOs
    List<DTOGrupo> convertir_a_lista(List<Grupo> lista);
}

