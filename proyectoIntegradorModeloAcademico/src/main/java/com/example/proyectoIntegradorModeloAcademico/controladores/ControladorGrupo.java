package com.example.proyectoIntegradorModeloAcademico.controladores;

import com.example.proyectoIntegradorModeloAcademico.modelos.Grupo;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTOGrupo;
import com.example.proyectoIntegradorModeloAcademico.servicios.GrupoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupo")
public class GrupoControlador {

    @Autowired
    private GrupoServicio servicio;

    // ✅ Listar todos los grupos
    @GetMapping
    public List<DTOGrupo> listar() throws Exception {
        return servicio.listarGrupos();
    }

    // ✅ Buscar grupo por ID
    @GetMapping("/{id}")
    public DTOGrupo buscarPorId(@PathVariable Long id) throws Exception {
        return servicio.buscarGrupoPorId(id);
    }

    // ✅ Crear nuevo grupo
    @PostMapping
    public DTOGrupo crear(@RequestBody Grupo grupo) throws Exception {
        return servicio.guardarGrupo(grupo);
    }

    // ✅ Actualizar grupo existente
    @PutMapping("/{id}")
    public DTOGrupo actualizar(@PathVariable Long id, @RequestBody Grupo grupo) throws Exception {
        return servicio.actualizarGrupo(id, grupo);
    }

    // ✅ Eliminar grupo
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) throws Exception {
        servicio.eliminarGrupo(id);
    }
}
