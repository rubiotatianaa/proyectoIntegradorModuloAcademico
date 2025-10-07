package com.example.proyectoIntegradorModeloAcademico.controladores;

import com.example.proyectoIntegradorModeloAcademico.modelos.Usuario;
import com.example.proyectoIntegradorModeloAcademico.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Esta clase es el intermediario entre el FRONT (los que piden cosas)
// y el SERVICIO (el que realmente hace el trabajo)
@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {


    // Inyectamos el servicio porque sin él, esto no hace nada.
    @Autowired
    UsuarioServicio servicio;

    //POST → Crear nuevo usuario
    // (aquí llegan los datos desde el frontend en formato JSON)
    @PostMapping
    public ResponseEntity<?> operacionGuardado(@RequestBody Usuario datos){
        try{
            //Sitodo sale bien devolvemos el usuario guardado
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(servicio.guardarUsuario(datos));
        }catch(Exception error){

            // Si algo explota, que no explote el servidor
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }
    // 🧩 GET → Consultar todos los usuarios
    @GetMapping
    public ResponseEntity<?> operacionBuscarTodos(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK) // 200todo bien
                    .body(servicio.buscarTodosLosUsuarios());
        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)// 500: el servidor lloró
                    .body(error.getMessage());
        }
    }
}
