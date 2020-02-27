package herencia;

public class Centro {
	
	protected String nombre, direccion;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Centro(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String toString() {
		String cad = "";
		cad = "NOMBRE: " + nombre + "\nDIRECCION: " + direccion;
		return cad;
	}
	
	
}
