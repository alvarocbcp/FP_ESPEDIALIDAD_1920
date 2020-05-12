package lenguajes;

public class Programador {
	String nombre;
	int edad;
	Lenguajes lProgramacion;
	
	public Programador(String nombre, int edad, Lenguajes lProgramacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.lProgramacion = lProgramacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Lenguajes getExpertoEn() {
		return lProgramacion;
	}

	public void setlProgramacion(Lenguajes lProgramacion) {
		this.lProgramacion = lProgramacion;
	}

	@Override
	public String toString() {
		return "Programador [nombre=" + nombre + ", edad=" + edad + ", lProgramacion=" + lProgramacion + "]";
	}
	
	
}
