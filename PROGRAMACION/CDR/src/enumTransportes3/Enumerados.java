package enumTransportes3;

//Uso de un constructor, una variable de instancia y un m�todo.
enum Transporte {

	COCHE(60), CAMION(50), AVION(600), TREN(70), BARCO(20);

	private int velocidad; // velocidad t�pica de cada transporte

	// A�adir un constructor
	Transporte(int s) {
		velocidad = s;
	}

	// A�adir un m�todo
	int getVelocidad() {
		return velocidad;
	}
}

class Enumerados {
	public static void main(String[] args) {

		// Mostrar la velocidad de un avi�n
		System.out.println(
				"La velocidad t�pica para un avi�n es: " + Transporte.AVION.getVelocidad() + " millas por hora.\n");

		// Mostrar todas las velocidades y transportes
		System.out.println("Todas las velocidades de transporte: ");

		for (Transporte t : Transporte.values())
			System.out.println(t + ": velocidad t�pica es " + t.getVelocidad() + " millas por hora.");
	}
}
