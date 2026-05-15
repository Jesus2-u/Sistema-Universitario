public class Alumno {

    private int id;
    private String nombre;

    public Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void mostrarAlumno() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
    }
}