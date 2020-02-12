package PrimeraEvaluacion;

public class CocheMain {

	public static void main(String[] args) {

		//Creo un coche.
		Coche coche1 = new Coche();

		coche1.marca = "Opel";
		coche1.modelo = "Astra";
		coche1.color = "Rojo";
		coche1.numeroDePuertas = 5;
		coche1.cuentaKilometros = 150000;
		coche1.velocidad = 120;
		coche1.arrancado = false;
		coche1.arrancar();
		coche1.arrancado = true;
		coche1.acelerar();
		coche1.pitar();

		//Creo otro coche.
		Coche coche2 = new Coche();

		coche2.marca = "Mitsubishi";
		coche2.modelo = "Grandis";
		coche2.color = "Negro";
		coche2.numeroDePuertas = 5;
		coche2.cuentaKilometros = 200000;
		coche2.velocidad = 90;
		coche2.arrancado = false;
		coche2.arrancar();
		coche2.arrancado = true;
		coche2.acelerar();
		coche2.pitar();


	}

}
