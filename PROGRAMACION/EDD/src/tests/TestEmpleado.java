package tests;

import static org.junit.Assert.*;


import org.junit.Test;

import syspagos.Empleado;
import excepciones.*;

public class TestEmpleado 
{
	@Test 
	public void establecerNumeroDeEmpleadoCorrecto() {
		Empleado e = new Empleado();
		try {
			e.establecerNumeroEmpleado("4");
		} catch (NumeroEmpleadoException ex) {
			fail();
		}
		assertEquals(4,e.getNumeroEmpleado());
	}
	
	
	@Test
	public void establecerNombreEmpleadoCorrecto() {
		Empleado e = new Empleado();
		try {
			e.estableceNombreEmpleado("AlvaroCabello27");
		}catch (NombreEmpleadoException ex) {
			fail();
		}
		assertEquals("AlvaroCabello27", e.getNombreEmpleado());
	}
	
	@Test
	public void establecerMesesTrabajoCorrecto() {
		Empleado e = new Empleado();
		try {
			e.estableceMesesTrabajo("4");
		}catch (MesesTrabajoException ex) {
			fail();
		}
		assertEquals(4, e.getMesesTrabajo());
	}
	
	@Test
	public void establecerSerDirectivoCorrecto() {
		Empleado e = new Empleado();
		try {
			e.establecerSerDirectivo("+");
		}catch (CargoException ex) {
			fail();
		}
		assertEquals(true, e.getDirectivo());
	}
	
	@Test
	public void calcularPrimaCorrecto() throws NombreEmpleadoException, MesesTrabajoException, CargoException {
		Empleado e = new Empleado();
		try {
			e.calcularPrima("8", "AlvaroCabello27", "4", "+");
		}catch (NombreEmpleadoException ex1) {
			fail();
		}catch (MesesTrabajoException ex2) {
			fail();
		}catch (CargoException ex3) {
			fail();
		}catch (NumeroEmpleadoException ex4) {
			fail();
		}
		assertEquals(4, e.getMesesTrabajo());
		assertEquals("AlvaroCabello27", e.getNombreEmpleado());
		assertEquals(true, e.getDirectivo());
		assertEquals(8, e.getNumeroEmpleado());
	}

}
