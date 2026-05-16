package com.asistencia.backend.service;

import com.asistencia.backend.entity.Alumno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService {

    private List<Alumno> listaAlumnos = new ArrayList<>();

    // LISTAR
    public List<Alumno> obtenerAlumnos() {
        return listaAlumnos;
    }

    // GUARDAR
    public Alumno guardarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
        return alumno;
    }

    // EDITAR
    public Alumno editarAlumno(int codigo, Alumno alumnoActualizado) {

        for (Alumno alumno : listaAlumnos) {

            if (alumno.getCodigo() == codigo) {

                alumno.setNombres(alumnoActualizado.getNombres());
                alumno.setApellidos(alumnoActualizado.getApellidos());
                alumno.setCurso(alumnoActualizado.getCurso());
                alumno.setEstado(alumnoActualizado.getEstado());

                return alumno;
            }
        }

        return null;
    }

    // ELIMINAR
    public String eliminarAlumno(int codigo) {

        for (Alumno alumno : listaAlumnos) {

            if (alumno.getCodigo() == codigo) {

                listaAlumnos.remove(alumno);

                return "Alumno eliminado";
            }
        }

        return "Alumno no encontrado";
    }
}