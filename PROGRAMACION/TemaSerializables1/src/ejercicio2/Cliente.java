package ejercicio2;

import java.io.*;

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String NIF;
	private String nombre;
	private String telefono;
	private String direccion;
	private double deuda;
	
	public Cliente(String NIF, String nombre, String telefono, String direccion, double deuda){
		this.NIF = NIF;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.deuda = deuda;
	}
	
	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getDeuda() {
		return deuda;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}
	
	public String toString (){ 
		return "NIF: " + NIF +
			   "\nNombre: " + nombre +
			   "\nTelefono: " + telefono + 
			   "\nDireccion: " + direccion + 
			   "\nDeuda: " + deuda;  
  } 

}
