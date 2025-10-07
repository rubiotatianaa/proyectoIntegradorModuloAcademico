package com.example.proyectoIntegradorModeloAcademico.servicios;

import com.example.proyectoIntegradorModeloAcademico.modelos.Estudiante;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTOEstudiante;
import com.example.proyectoIntegradorModeloAcademico.modelos.mapas.IMapaEstudiante;
import com.example.proyectoIntegradorModeloAcademico.repositorios.IEstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicio {

    @Autowired
    IEstudianteRepositorio repositorio;

    @Autowired
    IMapaEstudiante mapa;

    public DTOEstudiante guardarEstudiante(Estudiante datos)throws Exception{
        try{
            return mapa.convertirADTO(repositorio.save(datos));

        }catch(Exception error){
            throw new Exception("Tuvimos un error"+error.getMessage());

        }
    }

    public List<DTOEstudiante> buscarTodosLosEstudiantes()throws Exception{
        try{
            return mapa.convertir_lista_a_dto(repositorio.findAll());

        }catch(Exception error){
            throw new Exception("Tuvimos un error"+error.getMessage());
        }
    }

}

