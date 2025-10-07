package com.example.proyectoIntegradorModeloAcademico.servicios;

import com.example.proyectoIntegradorModeloAcademico.modelos.Nota;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTONota;
import com.example.proyectoIntegradorModeloAcademico.modelos.mapas.IMapaNota;
import com.example.proyectoIntegradorModeloAcademico.modelos.mapas.IMapaUsuario;
import com.example.proyectoIntegradorModeloAcademico.repositorios.INotaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaServicio {

    @Autowired
    INotaRepositorio repositorio;

    @Autowired
    IMapaNota mapa;

    //Funcion guardar
    public DTONota guardarNota(Nota notasEstudiante)throws Exception{
        try {

          return mapa.convertirADTO(repositorio.save(notasEstudiante));
        }catch(Exception error){
            throw new Exception("Tuvimos un error"+error.getMessage());
        }
    }

    public List<DTONota> buscarTodasLasNotas() throws Exception {
        try {
            // Llama al repositorio para traer todas las notas de la base de datos
            return mapa.convertirAListaDto(repositorio.findAll());
        } catch (Exception error) {
            throw new Exception("Error al buscar las notas: " + error.getMessage());
        }
    }
}
