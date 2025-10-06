package com.example.proyectoIntegradorModeloAcademico.modelos.mapas;

import com.example.proyectoIntegradorModeloAcademico.ayudas.EstadoUsuario;
import com.example.proyectoIntegradorModeloAcademico.ayudas.RolesUsuarios;
import com.example.proyectoIntegradorModeloAcademico.modelos.Estudiante;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false, unique = false, length = 50)
    private String nombre;

    @Column(name = "correo", nullable = false, unique = true, length = 80)
    private String correo;

    @Column(name = "contraseña", nullable = false, unique = false, length = 10)
    private String contraseña;

    @Column(name = "estado", nullable = false, unique = false)
    private EstadoUsuario estado;

    @Column(name = "rol", nullable = false, unique = false)
    private RolesUsuarios rol;

    @OneToOne(mappedBy = "usuario")
    @JsonBackReference(value = "relacionentreusuarioyestudiante")
    private Estudiante estudiante;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String correo, String contraseña, EstadoUsuario estado, RolesUsuarios rol) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.estado = estado;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public EstadoUsuario getEstado() {
        return estado;
    }

    public void setEstado(EstadoUsuario estado) {
        this.estado = estado;
    }

    public RolesUsuarios getRol() {
        return rol;
    }

    public void setRol(RolesUsuarios rol) {
        this.rol = rol;
    }
}
