package tpIntegradorTest;
import tpIntegrador.ar.edu.unlam.*;
import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedList;


public class TPTest {
	
	 @Test
	    public void testAgregarAlumnoAJardin() {
	        Jardin jardin = new Jardin("Verde");
	        Alumno alumno = new Alumno("Juan", 5);
	        jardin.alumnos = new ArrayList<>();
	        
	        jardin.agregarAlumno(alumno);

	        assertTrue(jardin.alumnos.contains(alumno));
	    }

	    @Test
	    public void testAgregarAlumnoAPrimaria() {
	        Primaria primaria = new Primaria(3);
	        Alumno alumno = new Alumno("Maria", 8);
	        primaria.alumnos = new LinkedList<>();
	        
	        primaria.agregarAlumno(alumno);

	        assertEquals(1, primaria.alumnos.size());
	        assertTrue(primaria.alumnos.contains(alumno));
	    }

	    @Test
	    public void testAgregarDocenteASecundaria() {
	        Secundaria secundaria = new Secundaria(4);
	        Docente docente = new Docente("Profesor Perez", "Matematica");
	        secundaria.docentes = new ArrayList<>();
	        
	        secundaria.agregarDocente(docente);

	        assertEquals(1, secundaria.docentes.size());
	        assertTrue(secundaria.docentes.contains(docente));
	    }

	    @Test
	    public void testRegistrarEvaluacionPrimaria() {
	        Primaria primaria = new Primaria(6);
	        Alumno alumno = new Alumno("Lucas", 11);
	        primaria.alumnos = new ArrayList<>();
	        primaria.agregarAlumno(alumno);

	        Evaluacion evaluacion = new Evaluacion(null, 9.0, alumno);
	        primaria.evaluaciones = new ArrayList<>();
	        primaria.evaluaciones.add(evaluacion);

	        assertTrue(primaria.evaluaciones.contains(evaluacion));
	        assertEquals(9.0, primaria.evaluaciones.get(0).getNota(), 0.01);
	    }

	    @Test
	    public void testRegistrarAsistenciaSecundaria() {
	        Secundaria secundaria = new Secundaria(2);
	        Alumno alumno = new Alumno("Carlos", 14);
	        secundaria.alumnos = new LinkedList<>();
	        secundaria.agregarAlumno(alumno);

	        Asistencia asistencia = new Asistencia( "25/09/2024", alumno);
	        secundaria.asistencias = new ArrayList<>();
	        secundaria.asistencias.add(asistencia);

	        assertTrue(secundaria.asistencias.contains(asistencia));
	    }

	

}
