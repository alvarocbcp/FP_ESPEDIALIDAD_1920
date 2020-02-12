package clases1;

public class Circulo {

	private double x, y;
	private double radio;
	
	public Circulo() {
		x=0;
		y=0;
		radio=1;
	}
	
	public Circulo(double radio) {
		x=0;
		y=0;
		this.radio=radio;
	}
	
	public Circulo(double x, double y, double radio	) {
		this.x=x;
		this.y=y;
		this.radio=radio;
	}
	
	public double dameX() {
		return this.x;
	}
	
	public double dameY() {
		return this.y;
	}
	
	public double dameRadio() {
		return this.radio;
	}
	
	public double Longitud(double radio) {
		double longi;
		longi = this.radio * 2 * Math.PI;
		return longi;
	}
	
	public double Area(double radio) {
		double area;
		area = Math.pow(this.radio, 2)	* Math.PI;
		return area;
	}
	
	public void Imprimir() {
		System.out.println("El área del círculo es: " + Area(radio));
		System.out.println("La longitud del círculo es: " + Longitud(radio));
	}
	
	public void ImprimirCoordenadas() {
		System.out.println("Las cordenadas del círculo son: (" + x  + ", " + y + ")");
	}
	
	
}
