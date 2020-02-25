package excepciones1;

import java.util.*;

public class EjConExcepciones1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Introduce una posicion");
			mostrarEntero(args, scanner.nextInt());
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println(" error " + "Introduzca una posicion dentro del rango del array");
		} catch (InputMismatchException error) {
			System.out.println(" error " + "Introduzca una posicion en formato numerico");
		} catch (NumberFormatException error) {
			System.out.println(" error " + "El dato leido no es numerico");
		} catch (Exception error) {
			System.out.println(" error " + error);// Ejecuta el método toString()
		}

		scanner.close();

	}

	public static void mostrarEntero(String args[], int n) {
		System.out.println("Entero " + obtenerEntero(args, n));
	}

	public static int obtenerEntero(String args[], int n) {
		return Integer.parseInt(args[n]);
	}
}
