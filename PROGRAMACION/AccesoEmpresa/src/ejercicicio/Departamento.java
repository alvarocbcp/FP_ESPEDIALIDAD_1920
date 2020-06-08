package ejercicicio;

public class Departamento {
	
	private int cod;
	private String nombre;
	private String loc;
	
	public Departamento(int cod, String nombre, String loc) {
		this.cod = cod;
		this.nombre = nombre;
		this.loc = loc;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public String toString() {
		return "Codigo: " + cod
				+"\nNombre: " + nombre
				+"\nLocalizacion: " + loc;
	}
	
	

}
