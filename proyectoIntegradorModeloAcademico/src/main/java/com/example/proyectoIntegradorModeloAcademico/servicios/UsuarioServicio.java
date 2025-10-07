package com.example.proyectoIntegradorModeloAcademico.servicios;

import com.example.proyectoIntegradorModeloAcademico.modelos.Usuario;
import com.example.proyectoIntegradorModeloAcademico.modelos.dtos.DTOUsuario;
import com.example.proyectoIntegradorModeloAcademico.modelos.mapas.IMapaUsuario;
import com.example.proyectoIntegradorModeloAcademico.repositorios.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio {

    @Autowired
    IUsuarioRepositorio repositorio;

    @Autowired
    IMapaUsuario mapa;


    //Funcion o servicio para guardar un usuario en BD
    public DTOUsuario guardarUsuario(Usuario datosUsuario)throws Exception{
        try{

            return mapa.convertirADTO(repositorio.save(datosUsuario));

        }catch(Exception error){
            throw new Exception("Tuvimos un error" +error.getMessage());

        }
    }

    public List<DTOUsuario> buscarTodosLosUsuarios()throws Exception{
        try{
            return mapa.convertirListaDTO(repositorio.findAll());

        }catch(Exception error){
            throw new Exception("Tuvimos un error"+error.getMessage());
        }
    }

    //servicio para buscar un usuario por ID
    public DTOUsuario buscarUsuarioPorId(Integer id)throws Exception{
        try{
            Optional<Usuario> usuarioQueEstoyBuscando=this.repositorio.findById(id);
            if(usuarioQueEstoyBuscando.isPresent()){ //SI SI ESTA
                return mapa.convertirADTO(usuarioQueEstoyBuscando.get());
            }else{ //SI NO ESTA
                throw new Exception(MensajeError.ERROR_USUARIO_NO_ENCONTRADO.getDescripcion());
            }
        }catch(Exception error){
            throw new Exception("Tuvimos un error"+ error.getMessage());
        }
    }

    //Servicio para buscar por correo
    public DTOUsuario buscarUsuarioPorCorreo(String correo)throws Exception{
        try{
            Optional<Usuario> usuarioBuscado =this.repositorio.findByCorreo(correo);
            if(usuarioBuscado.isPresent()){
                return mapa.convertirADTO(usuarioBuscado.get());
            }else{
                throw new Exception(MensajeError.ERROR_USUARIO_NO_ENCONTRADO.getDescripcion());
            }
        }catch(Exception error){
            throw new Exception("Tuvimos un error"+error.getMessage());
        }
    }

    //servicio para buscar por nombre
    public List<DTOUsuario> buscarUsuariosConNombre(String nombre)throws Exception{
        try{
            return mapa.convertirListaDTO(repositorio.findByNombreContaining(nombre));
        }catch(Exception error){
            throw new Exception("Tuvimos un error"+error.getMessage());
        }
    }
}

