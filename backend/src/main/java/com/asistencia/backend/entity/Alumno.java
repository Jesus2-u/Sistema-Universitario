package com.asistencia.backend.entity;

public class Alumno {

    private int codigo;
    private String nombres;
    private String apellidos;
    private String curso;
    private String estado;

    public Alumno() {
    }

    public Alumno(int codigo, String nombres,
                  String apellidos,
                  String curso,
                  String estado) {

        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.curso = curso;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}