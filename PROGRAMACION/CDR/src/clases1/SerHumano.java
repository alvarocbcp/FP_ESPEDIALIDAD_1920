package clases1;

public class SerHumano {
	
	String nombre;
	String colorOjos;
	int edad;
	static String planeta="Tierra";
	
	void mostrarCaracteristicas(){
		System.out.println(nombre + " tiene " + edad + " a�os.");
		System.out.println("Sus ojos son " + colorOjos);
		System.out.println("Su planeta es " + planeta);
	}
	
	void esMayorEdad() {
		if(edad>=18) {
			System.out.println(nombre + " es mayor de edad.");
			System.out.println("Tiene " + edad + " a�os.");
		}
		else {
			System.out.println(nombre + " es menor de edad.");
			System.out.println("Tiene " + edad + " a�os.");
		}
	}
	
}
