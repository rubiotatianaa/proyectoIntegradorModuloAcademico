package com.example.proyectoIntegradorModeloAcademico.controladores;

import com.example.proyectoIntegradorModeloAcademico.modelos.Matricula;
import com.example.proyectoIntegradorModeloAcademico.servicios.MatriculaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matriculas")
public class ControladorMatricula {

    // Llamar al servicio
    @Autowired
    MatriculaServicio servicio;

    // ACTIVAMOS LAS RESPUESTAS AL CLIENTE (POSTMAN O FRONT)

    //  Guardar una matrícula
    @PostMapping
    public ResponseEntity<?> operacionGuardado(@RequestBody Matricula datos) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.guardarMatricula(datos));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    //  Listar todas las matrículas
    @GetMapping
    public ResponseEntity<?> operacionBuscarTodas() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.buscarTodasLasMatriculas());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
