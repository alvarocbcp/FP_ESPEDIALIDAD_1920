package ejercicio1;

import java.io.*;

public class Persona implements Serializable, Comparable<Persona> {
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	
	public Persona(String nombre, String apellidos, String telefono, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Nombre: " + nombre
				+"\nApellidos: " + apellidos
				+"\nTelefono: " + telefono
				+"\nEmail: " + email;
	}

	@Override
	public int compareTo(Persona p) {
		
		if(nombre.equals(p.getNombre())) {
			return apellidos.compareTo(p.getApellidos());
			
		}
		
		return nombre.compareTo(p.getNombre());
	}
	
	

}
