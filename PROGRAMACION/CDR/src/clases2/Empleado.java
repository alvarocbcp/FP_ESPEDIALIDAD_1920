package clases2;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;
	
	public Empleado() {}
	
	public Empleado(String nombre, String apellido, int edad, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		String cad = "Nombre: " + nombre + ".\nApellido: " + apellido + ".\n Edad: " + edad + ".\nSalario: " + salario + "�.";
		return cad;
	}
	
	

}
