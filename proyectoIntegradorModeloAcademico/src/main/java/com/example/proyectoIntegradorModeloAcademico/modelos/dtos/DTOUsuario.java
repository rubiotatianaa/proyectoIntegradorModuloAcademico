package com.example.proyectoIntegradorModeloAcademico.modelos.dtos;

import com.example.proyectoIntegradorModeloAcademico.ayudas.RolesUsuarios;

public class DTOUsuario {

    private String nombre;
    private String correo;
    private RolesUsuarios rol;

    public DTOUsuario() {
    }

    public DTOUsuario(String nombre, String correo, RolesUsuarios rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public RolesUsuarios getRol() {
        return rol;
    }

    public void setRol(RolesUsuarios rol) {
        this.rol = rol;
    }
}
