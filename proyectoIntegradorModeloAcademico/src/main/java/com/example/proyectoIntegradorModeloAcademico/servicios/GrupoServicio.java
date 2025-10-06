package com.example.proyectoIntegradorModeloAcademico.servicios;

import com.example.proyectoIntegradorModeloAcademico.ayudas.MensajeError;
import com.example.proyectoIntegradorModeloAcademico.modelos.Grupo;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTOGrupo;
import com.example.proyectoIntegradorModeloAcademico.modelos.mapas.IMapaGrupo;
import com.example.proyectoIntegradorModeloAcademico.repositorios.IGrupoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoServicio {

    @Autowired
    IGrupoRepositorio repositorio;

    @Autowired
    IMapaGrupo mapa;

    // ✅ Crear grupo
    public DTOGrupo guardarGrupo(Grupo datosGrupo) throws Exception {
        try {
            return mapa.convertir_a_dto(repositorio.save(datosGrupo));
        } catch (Exception error) {
            throw new Exception(MensajeError.ERROR_NO_ENCONTRADO.getDescripcion() + error.getMessage());
        }
    }

    // ✅ Buscar por ID
    public DTOGrupo buscarGrupoPorId(Long id) throws Exception {
        try {
            Optional<Grupo> grupo = repositorio.findById(id);
            if (grupo.isPresent()) {
                return mapa.convertir_a_dto(grupo.get());
            } else {
                throw new Exception(MensajeError.ERROR_GRUPO_NO_ENCONTRADO.getDescripcion());
            }
        } catch (Exception error) {
            throw new Exception(MensajeError.ERROR_NO_ENCONTRADO.getDescripcion() + error.getMessage());
        }
    }

    // ✅ Listar todos los grupos
    public List<DTOGrupo> listarGrupos() throws Exception {
        try {
            return mapa.convertir_a_lista(repositorio.findAll());
        } catch (Exception error) {
            throw new Exception(MensajeError.ERROR_NO_ENCONTRADO.getDescripcion() + error.getMessage());
        }
    }

    // ✅ Eliminar grupo
    public void eliminarGrupo(Long id) throws Exception {
        try {
            Optional<Grupo> grupo = repositorio.findById(id);
            if (grupo.isPresent()) {
                repositorio.deleteById(id);
            } else {
                throw new Exception(MensajeError.ERROR_GRUPO_NO_ENCONTRADO.getDescripcion());
            }
        } catch (Exception error) {
            throw new Exception(MensajeError.ERROR_NO_ENCONTRADO.getDescripcion() + error.getMessage());
        }
    }

    // ✅ Actualizar grupo
    public DTOGrupo actualizarGrupo(Long id, Grupo datosActualizados) throws Exception {
        try {
            Optional<Grupo> grupoExistente = repositorio.findById(id);
            if (grupoExistente.isPresent()) {
                Grupo grupo = grupoExistente.get();

                // Actualizar los campos necesarios
                grupo.setNombre(datosActualizados.getNombre());
                grupo.setMateria(datosActualizados.getMateria());
                grupo.setSemestre(datosActualizados.getSemestre());

                // Guardar cambios y devolver como DTO
                return mapa.convertir_a_dto(repositorio.save(grupo));
            } else {
                throw new Exception(MensajeError.ERROR_GRUPO_NO_ENCONTRADO.getDescripcion());
            }
        } catch (Exception error) {
            throw new Exception(MensajeError.ERROR_NO_ENCONTRADO.getDescripcion() + error.getMessage());
        }
    }
}
