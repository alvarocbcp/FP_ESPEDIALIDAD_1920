package ejercicio1;

import java.io.*;

public class Asignatura implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private double nota;
	
	public Asignatura(String nombre, double nota) {
		
		this.nombre = nombre;
		this.nota = nota;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String toString (){ 
		return "Nombre: " + nombre + "\n Nota: " + nota;  
  } 
	
	

}
