package com.example.proyectoIntegradorModeloAcademico.modelos.mapas;

import com.example.proyectoIntegradorModeloAcademico.modelos.Materia;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTOMateria;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaMateria {
    IMapaMateria INSTANCE= Mappers.getMapper(IMapaMateria.class);
    @Mapping(source = "nombre_Materia", target = "nombre_Materia")
    @Mapping(source = "codigo_Materia", target = "codigo_Materia")
    DTOMateria convertir_a_dto(Materia materia);

    List<DTOMateria>convertir_a_dto(List<Materia>list);

}
