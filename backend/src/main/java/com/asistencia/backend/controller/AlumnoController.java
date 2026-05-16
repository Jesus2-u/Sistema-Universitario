package com.asistencia.backend.controller;

import com.asistencia.backend.entity.Alumno;
import com.asistencia.backend.service.AlumnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
@CrossOrigin("*")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    // GET
    @GetMapping
    public List<Alumno> listarAlumnos() {
        return alumnoService.obtenerAlumnos();
    }

    // POST
    @PostMapping
    public Alumno guardarAlumno(@RequestBody Alumno alumno) {
        return alumnoService.guardarAlumno(alumno);
    }

    // PUT
    @PutMapping("/{codigo}")
    public Alumno editarAlumno(
            @PathVariable int codigo,
            @RequestBody Alumno alumno) {

        return alumnoService.editarAlumno(codigo, alumno);
    }

    // DELETE
    @DeleteMapping("/{codigo}")
    public String eliminarAlumno(@PathVariable int codigo) {

        return alumnoService.eliminarAlumno(codigo);
    }
}