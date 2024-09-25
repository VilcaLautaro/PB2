package tpIntegrador.ar.edu.unlam;

import java.util.ArrayList;
import java.util.List;

public  class Primaria extends Clase {
    public List<Evaluacion> evaluaciones;

    public Primaria(String nombre) {
        super(nombre);
        this.evaluaciones = new ArrayList<>();
    }

    public Primaria(Integer anio) {
    	super(anio);
    	this.evaluaciones = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	public void registrarEvaluacion(Evaluacion evaluacion) {
        evaluaciones.add(evaluacion);
    }

    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }
}
