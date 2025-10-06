package com.example.proyectoIntegradorModeloAcademico.servicios;

import com.example.proyectoIntegradorModeloAcademico.ayudas.MensajeError;
import com.example.proyectoIntegradorModeloAcademico.modelos.Materia;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTOMateria;
import com.example.proyectoIntegradorModeloAcademico.modelos.mapas.IMapaMateria;
import com.example.proyectoIntegradorModeloAcademico.repositorios.IMateriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MateriaServicio {
    @Autowired
    IMateriaRepositorio repositorio;

    @Autowired
    IMapaMateria mapa;

    //guardar materia

    public DTOMateria guardarmateria(Materia DatosMateria)  throws Exception{
        try{
            return mapa.convertir_a_dto(repositorio.save(DatosMateria));

        }catch (Exception error) {

            throw new Exception(MensajeError.ERROR_NO_ENCONTRADO.getDescripcion() + error.getMessage());

        }
    }

    //BUSCAR POR CODIGO
    public DTOMateria buscarmateriaporcodigo(String codigo )throws Exception {
        try {

            Optional<Materia> codigoMateria = this.repositorio.findyByCodigo(codigo);
            if (codigoMateria.isPresent()) {
                return  mapa.convertir_a_dto((codigoMateria.get()));
            } else {
                throw new Exception(MensajeError.ERROR_MATERIA_NO_ENCONTRADA.getDescripcion());
            }
        } catch (Exception error) {
            throw new Exception(MensajeError.ERROR_NO_ENCONTRADO.getDescripcion() + error.getMessage());
        }

    }

}
