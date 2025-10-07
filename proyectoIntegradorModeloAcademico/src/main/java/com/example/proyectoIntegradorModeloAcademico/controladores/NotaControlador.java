package com.example.proyectoIntegradorModeloAcademico.controladores;

import com.example.proyectoIntegradorModeloAcademico.modelos.Nota;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTONota;
import com.example.proyectoIntegradorModeloAcademico.servicios.NotaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Este controlador maneja todo lo que tenga que ver con las notas
@RestController
@RequestMapping("/notas")
public class NotaControlador {

    // Conectamos el servicio
    @Autowired
    private NotaServicio servicio;

    // POST → Guardar una nueva nota
    @PostMapping
    public ResponseEntity<?> guardarNota(@RequestBody Nota datosNota) {
        try {
            // Llamamos al servicio para guardar
            DTONota notaGuardada = servicio.guardarNota(datosNota);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(notaGuardada);
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Error al guardar la nota: " + error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> buscarTodasLasNotas() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicio.buscarTodasLasNotas());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Error al listar las notas: " + error.getMessage());
        }
    }
}