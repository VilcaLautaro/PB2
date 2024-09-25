package tpIntegrador.ar.edu.unlam;


import java.util.ArrayList;
import java.util.List;

public abstract class Clase {
    protected String nombre;
    protected Integer anio;
    public List<Alumno> alumnos;
    public List<Docente> docentes;

    public Clase(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
        this.docentes = new ArrayList<>();
    }
    public Clase(Integer anio) {
    	this.anio = anio;
    	this.alumnos = new ArrayList<>();
        this.docentes = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void agregarDocente(Docente docente) {
        docentes.add(docente);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }
}