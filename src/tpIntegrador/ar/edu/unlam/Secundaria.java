package tpIntegrador.ar.edu.unlam;

import java.util.ArrayList;
import java.util.List;

public class Secundaria extends Clase {
    public List<Asistencia> asistencias;

    public Secundaria(String nombre) {
        super(nombre);
        this.asistencias = new ArrayList<>();
    }

    public Secundaria(Integer anio) {
    	super(anio);
    	this.asistencias = new ArrayList<Asistencia>();
		// TODO Auto-generated constructor stub
	}

	public void registrarAsistencia(Asistencia asistencia) {
        asistencias.add(asistencia);
    }

    public List<Asistencia> getAsistencias() {
        return asistencias;
    }
}