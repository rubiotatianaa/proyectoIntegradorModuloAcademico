package com.example.proyectoIntegradorModeloAcademico.ayudas;

public enum MensajeError {
    // Mensajes generales
        ERROR_GENERAL("Ups, fallamos al procesar el API"),
        ERROR_NO_ENCONTRADO("El registro que buscas no está en la BD"),
        ERROR_YA_EXISTE("El registro ya existe en la BD"),


        // Mensajes para USUARIO
        ERROR_USUARIO_NO_ENCONTRADO("El usuario que buscas no está en la BD"),
        ERROR_USUARIO_YA_EXISTE("El usuario ya existe en la BD"),

        // Mensajes para MATERIA
        ERROR_MATERIA_NO_ENCONTRADA("La materia que buscas no está en la BD"),
        ERROR_MATERIA_YA_EXISTE("La materia ya existe en la BD"),
        ERROR_CODIGO_MATERIA_DUPLICADO("El código de materia ya está en uso"),
        ERROR_NOMBRE_MATERIA_DUPLICADO("El nombre de materia ya existe"),


        // Mensajes para ESTUDIANTE
        ERROR_ESTUDIANTE_NO_ENCONTRADO("El estudiante que buscas no está en la BD"),
        ERROR_ESTUDIANTE_YA_EXISTE("El estudiante ya existe en la BD"),
        ERROR_MATRICULA_ESTUDIANTE_DUPLICADA("La matrícula del estudiante ya está en uso"),
        ERROR_ESTUDIANTE_CON_MATRICULAS("No se puede eliminar el estudiante porque tiene matrículas activas"),

        // Mensajes para NOTA
        ERROR_NOTA_NO_ENCONTRADA("La nota que buscas no está en la BD"),
        ERROR_NOTA_YA_EXISTE("La nota ya existe en la BD"),
        ERROR_NOTA_FUERA_RANGO("La nota debe estar entre 0 y 5"),
        ERROR_NOTA_ESTUDIANTE_DUPLICADA("Ya existe una nota para este estudiante en esta evaluación"),

        // Mensajes para MATRICULA
        ERROR_MATRICULA_NO_ENCONTRADA("La matrícula que buscas no está en la BD"),
        ERROR_MATRICULA_YA_EXISTE("La matrícula ya existe en la BD"),
        ERROR_MATRICULA_ESTADO_INVALIDO("Estado de matrícula inválido"),
        ERROR_MATRICULA_DUPLICADA("El estudiante ya está matriculado en este grupo"),


        // Mensajes para GRUPO
        ERROR_GRUPO_NO_ENCONTRADO("El grupo que buscas no está en la BD"),
        ERROR_GRUPO_YA_EXISTE("El grupo ya existe en la BD"),
        ERROR_CODIGO_GRUPO_DUPLICADO("El código de grupo ya está en uso"),
        ERROR_GRUPO_CON_MATRICULAS("No se puede eliminar el grupo porque tiene estudiantes matriculados");


        private final String descripcion;

        MensajeError(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }


