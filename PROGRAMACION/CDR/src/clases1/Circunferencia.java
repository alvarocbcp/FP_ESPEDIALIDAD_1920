package clases1;

public class Circunferencia {
	
	private double x, y;
	private double radio;
	
	public Circunferencia() {}
	
	public Circunferencia(double x, double y, double radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}
	
	public double dameX() {		//Creamos getter para poder usar las variables privadas de la clase en otra clase distinta (Principal.java)
		return this.x;
		//return x;	Tambien se puede poner x porqu eno genera confusion.
	}
	
	public double dameY() {
		return this.y;
	}
	
	public double dameRadio() {
		return this.radio;
	}
	
	public void ponX(double x) {
		this.x = x;
	}
	
	public void ponY(double y) {
		this.y = y;
	}
	
	public void ponRadio(double radio) {
		this.radio = radio;
	}
	
	public String toString() {
		String cad = "Origen:" + " (" + x + ", " + y + ")\n" + "Radio: "+ radio;
		return cad;
	}
	
}
