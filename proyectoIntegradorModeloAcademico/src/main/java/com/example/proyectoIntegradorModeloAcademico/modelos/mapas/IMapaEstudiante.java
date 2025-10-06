package com.example.proyectoIntegradorModeloAcademico.modelos.mapas;

import com.example.proyectoIntegradorModeloAcademico.modelos.Estudiante;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTOEstudiante;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaEstudiante {

    IMapaEstudiante INSTANCE= Mappers.getMapper(IMapaEstudiante.class);

    @Mapping(source="usuario.nombre", target="nombre")
    @Mapping(source="usuario.contraseña", target="contraseña")
    @Mapping(source="usuario.rol", target="rol")
    @Mapping(source="promedio", target="promedio")
    @Mapping(source="fechaNacimiento", target="fechaNacimiento")
    DTOEstudiante convertirADTO(Estudiante estudiante);

    List<DTOEstudiante> convertir_lista_a_dto(List<Estudiante>lista);
}
