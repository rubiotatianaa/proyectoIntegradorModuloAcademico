package com.example.proyectoIntegradorModeloAcademico.modelos.mapas;

import com.example.proyectoIntegradorModeloAcademico.modelos.Usuario;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTOUsuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaUsuario {

    IMapaUsuario INSTANCE= Mappers.getMapper(IMapaUsuario.class);

    //Convirtiendo un modelo en DTO

    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "correo", target = "correo")
    @Mapping(source = "rol", target = "rol")
    DTOUsuario convertirADTO(Usuario usuario);

    List<DTOUsuario> convertirListaDTO(List<Usuario> lista);
}
