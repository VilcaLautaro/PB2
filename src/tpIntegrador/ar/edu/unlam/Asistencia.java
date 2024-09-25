package tpIntegrador.ar.edu.unlam;


public class Asistencia {
    private Alumno alumno;
    private String fecha; 

    
    public Asistencia(String fecha, Alumno alumno) {
        this.alumno = alumno;
        this.fecha = fecha; 
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public String getFecha() {
        return fecha; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Asistencia asistencia = (Asistencia) obj;
        return alumno.equals(asistencia.alumno) && fecha.equals(asistencia.fecha);
    }

    @Override
    public int hashCode() {
        return alumno.hashCode() + fecha.hashCode();
    }
}
