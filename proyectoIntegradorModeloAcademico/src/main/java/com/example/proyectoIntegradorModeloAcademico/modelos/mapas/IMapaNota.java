package com.example.proyectoIntegradorModeloAcademico.modelos.mapas;

import com.example.proyectoIntegradorModeloAcademico.modelos.Nota;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTONota;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaNota {

    IMapaNota INSTANCE= Mappers.getMapper(IMapaNota.class);

    @Mapping(source = "valor", target = "valor")
    @Mapping(source = "tipoEvaluacion", target = "tipoEvaluacion")
    @Mapping(source = "fecha", target = "fecha")
    @Mapping(source = "estudiante.id", target = "estudianteId")
    @Mapping(source = "materia.id", target = "materiaId")
    DTONota convertirADTO(Nota nota);

    //Mapeando una lista
    List<DTONota> convertirAListaDto(List<Nota> lista);
}
