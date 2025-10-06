package com.example.proyectoIntegradorModeloAcademico.servicios;

import com.example.proyectoIntegradorModeloAcademico.modelos.Matricula;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTOMatricula;
import com.example.proyectoIntegradorModeloAcademico.modelos.mapas.IMapaMatricula;
import com.example.proyectoIntegradorModeloAcademico.repositorios.IMatriculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServicio {

    @Autowired
    IMatriculaRepositorio repositorio;

    @Autowired
    IMapaMatricula mapa;

    // Guardar una matrícula
    public DTOMatricula guardarMatricula(Matricula datosMatricula) throws Exception {
        try {
            return mapa.convertirADTO(repositorio.save(datosMatricula));
        } catch (Exception error) {
            throw new Exception(" Error al guardar la matrícula: " + error.getMessage());
        }
    }

    // Buscar todas las matrículas
    public List<DTOMatricula> buscarTodasLasMatriculas() throws Exception {
        try {
            return mapa.convertirListaADTO(repositorio.findAll());
        } catch (Exception error) {
            throw new Exception(" Error al listar las matrículas: " + error.getMessage());
        }
    }

    // Buscar matrícula por ID
    public DTOMatricula buscarMatriculaPorId(Integer id) throws Exception {
        try {
            Optional<Matricula> matriculaBuscada = repositorio.findById(id);
            if (matriculaBuscada.isPresent()) {
                return mapa.convertirADTO(matriculaBuscada.get());
            } else {
                throw new Exception("Matrícula con ID " + id + " no encontrada.");
            }
        } catch (Exception error) {
            throw new Exception(" Error al buscar matrícula: " + error.getMessage());
        }
    }

    // Buscar matrículas por periodo
    public List<DTOMatricula> buscarMatriculasPorPeriodo(String periodo) throws Exception {
        try {
            return mapa.convertirListaADTO(repositorio.findByPeriodo(periodo));
        } catch (Exception error) {
            throw new Exception(" Error al buscar matrículas por periodo: " + error.getMessage());
        }
    }

    // Buscar matrículas por estudiante
    public List<DTOMatricula> buscarMatriculasPorEstudiante(Integer estudianteId) throws Exception {
        try {
            return mapa.convertirListaADTO(repositorio.findByEstudianteId(estudianteId));
        } catch (Exception error) {
            throw new Exception("Error al buscar matrículas del estudiante: " + error.getMessage());
        }
    }



}
