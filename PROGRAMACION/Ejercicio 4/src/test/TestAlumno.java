package test;

import clases.Alumno;
import excepciones.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestAlumno {
	
	@Test
	public void establecerNIFCorrecto() {
		Alumno a = new Alumno();
		try {
			a.establecerNIF(1234567890);
		}catch (NIFException ex	) {
			fail();
		}
		assertEquals(1234567890, a.getNIF());
	}
	
	@Test
	public void establecerIdentificacionCorrecto() {
		Alumno a = new Alumno();
		try {
			a.establecerIdentificacion("Alvaro Cabello Benito");
		}catch (IdentificacionException ex) {
			fail();
		}
		assertEquals("Alvaro Cabello Benito", a.getIdentificacion().contains("Alvaro Cabello Benito"));
	}

}
