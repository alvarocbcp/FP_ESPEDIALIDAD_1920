package PrimeraEvaluacion;

public class Coche {

	String marca;
	String modelo;
	String color;
	int numeroDePuertas;
	int cuentaKilometros;
	int velocidad;
	boolean arrancado;
	
	void arrancar () {
		arrancado = true;
	}
	
	void parar () {
		arrancado = false;
	}
	
	void acelerar() {
		velocidad = velocidad + 1;
	}
	
	void frenar() {
		velocidad = velocidad - 1;
	}
	
	void pitar() {
		System.out.println("Piiiiiiiiiiiiiiiiiiiiiiiii");
	}
	
	int consultarCuentaKilometros() {
		return cuentaKilometros;
	}

}
