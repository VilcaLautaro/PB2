package tpIntegrador.ar.edu.unlam;

public class Docente extends Persona {
    private String especialidad;

    public Docente(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Docente docente = (Docente) obj;
        return especialidad.equals(docente.especialidad);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + especialidad.hashCode();
    }
}