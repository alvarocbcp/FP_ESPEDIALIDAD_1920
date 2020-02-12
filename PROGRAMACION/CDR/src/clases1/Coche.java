package clases1;

public class Coche {

	private String color, marca, matricula;
	private int numPuertas;
	
	public Coche() {
		color="rojo";
		marca="opel";
		matricula="8493HRM";
		numPuertas=5;
	}
	
	public Coche(String color, String marca, String matricula, int numPuertas) {
		this.color=color;
		this.marca=marca;
		this.matricula=matricula;
		this.numPuertas=numPuertas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	public void imprimir() {
		System.out.println("Color: " + color);
		System.out.println("Marca: " + marca);
		System.out.println("Matricula: " + matricula);
		System.out.println("Numero de puertas: " + numPuertas);
	}
	
}
