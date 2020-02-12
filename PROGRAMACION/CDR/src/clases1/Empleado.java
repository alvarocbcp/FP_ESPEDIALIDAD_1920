package clases1;

public class Empleado {

	private String dni, nombre;
	
	public Empleado() {}
	
	public Empleado(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public String dameDni() {
		return this.dni;
	}
	
	public String dameNombre() {
		return this.nombre;
	}
	
	public void ponDni(String dni) {
		this.dni = dni;
	}
	
	public void ponNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		String cad = "DNI: " + dni + "\nNombre: "+ nombre;
		return cad;
	}
	
}
