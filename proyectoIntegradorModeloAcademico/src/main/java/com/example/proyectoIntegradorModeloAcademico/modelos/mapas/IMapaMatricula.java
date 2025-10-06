package com.example.proyectoIntegradorModeloAcademico.modelos.mapas;

import com.example.proyectoIntegradorModeloAcademico.modelos.Matricula;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTOMatricula;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaMatricula {

    IMapaMatricula INSTANCE = Mappers.getMapper(IMapaMatricula.class);

    //Convirtiendo un modelo en DTO

    @Mapping(source = "estudiante.id", target = "estudianteId")
    @Mapping(source = "materia.id", target = "materiaId")
    @Mapping(source = "grupo.id", target = "grupoId")
    DTOMatricula convertirADTO(Matricula matricula);

    List<DTOMatricula> convertirListaADTO(List<Matricula> lista);

}
