package enumColores2;

//Programa Java para demostrar el funcionamiento de values(),
//ordinal() y valueOf()
enum Color {
	ROJO, VERDE, AZUL;
}

public class Test {
	public static void main(String[] args) {
		// Llamando a values()
		Color arr[] = Color.values();

		// enum con bucle for each
		for (Color col : arr) {
			// Llamando a ordinal() para encontrar el �ndice
			// de color.
			System.out.println(col + " en el �ndice " + col.ordinal());
		}

		// Usando valueOf(). Devuelve un objeto de
		// Color con la constante dada.
		// La segunda l�nea comentada causa la excepci�n
		// IllegalArgumentException (Implementa el tratamiento de la excepci�n para practicar)
		System.out.println(Color.valueOf("ROJO")); // El system.out.println obliga la conversi�n a String
		// System.out.println(Color.valueOf("BLANCO"));
	}
}
