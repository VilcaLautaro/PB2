package tpIntegrador.ar.edu.unlam;

public class Alumno extends Persona {
    private int edad;

    public Alumno(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Alumno alumno = (Alumno) obj;
        return edad == alumno.edad;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + edad;
    }
}
