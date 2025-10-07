package com.example.proyectoIntegradorModeloAcademico.controladores;

import com.example.proyectoIntegradorModeloAcademico.modelos.Estudiante;
import com.example.proyectoIntegradorModeloAcademico.servicios.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {

    @Autowired
    EstudianteServicio servicio;

    @PostMapping
    public ResponseEntity<?> operacionGuardado(@RequestBody Estudiante datos){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.guardarEstudiante(datos));
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }

    @GetMapping
    public ResponseEntity<?> operacionBuscarTodos(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.buscarTodosLosEstudiantes());
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
