public class Asistencia {

    private int idAlumno;
    private String fecha;

    public Asistencia(int idAlumno, String fecha) {
        this.idAlumno = idAlumno;
        this.fecha = fecha;
    }

    public void mostrarAsistencia() {
        System.out.println("Alumno ID: " + idAlumno);
        System.out.println("Fecha: " + fecha);
    }
}