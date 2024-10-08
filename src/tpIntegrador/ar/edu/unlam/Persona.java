package tpIntegrador.ar.edu.unlam;

public abstract class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Persona persona = (Persona) obj;
        return nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}

