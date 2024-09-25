package tpIntegrador.ar.edu.unlam;

public class Evaluacion {
	
	  private String materia;
	    private double nota;
	    private Alumno alumno;

	    public Evaluacion(String materia, double nota, Alumno alumno) {
	        this.materia = materia;
	        this.nota = nota;
	        this.alumno = alumno;
	    }

	    public String getMateria() {
	        return materia;
	    }

	    public double getNota() {
	        return nota;
	    }

	    public Alumno getAlumno() {
	        return alumno;
	    }

}
