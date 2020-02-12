package PrimeraEvaluacion;

import java.util.Scanner;
import java.lang.StringBuilder;

public class EjerciciosCadenas {

	//*******************FUNCIONES***************************

	public static int cuentaVocales(String palabra) {
		int longitud = palabra.length();
		int cont = 0;
		for (int j=0; j<longitud; j++) {
			palabra = palabra.toLowerCase();
			char letra = palabra.charAt(j);
			switch (letra) {
			case 'a':
			case 'á':
			case 'e':
			case 'é':
			case 'i':
			case 'í':
			case 'o':
			case 'ó':
			case 'u':
			case 'ú':
			case 'ü':
				cont++;
				break;
			}
		}
		return cont;
	}

	public static boolean esCapicua(long numero) {
		boolean esCapicua = true;
		String numeroS = String.valueOf(numero);
		String numeroReverse = "";

		int longitud = numeroS.length();
		int i=0;

		do {
			char letra = numeroS.charAt(i);
			i++;
			numeroReverse = letra  + numeroReverse;
		}while(i<longitud);

		if (numeroS.equalsIgnoreCase(numeroReverse)) {
			return esCapicua;
		}
		else {
			return esCapicua = false;
		}
	}

	public static boolean esCapicua2(long numero) { //Haciéndolo de otro modo, comparamos cada digito de la izquierda con su espejo en la derecha
		String strNumero = Long.toString(numero);
		boolean esCapicua = true;
		int longitud = strNumero.length();

		for(int i=0; i<longitud/2 && esCapicua; i++) {
			if(strNumero.charAt(i) != strNumero.charAt(longitud-1-i)) {
				esCapicua = false;
			}
		}
		return esCapicua;
	}
	
	public static int cuentaVeces(String cadena, String cadena2) {
		int cont=0;
		
		while (cadena.indexOf(cadena2) > -1) {
			cadena = cadena.substring(cadena.indexOf(cadena2)+cadena2.length(), cadena.length());
			cont++;
		}
		return cont;
	}
	
	public static String reemplazar(String cadena) {
		cadena = cadena.toUpperCase();
		return cadena;
	}


	//*******************EJERCICIOS***************************

	static void ejercicio1() {
		Scanner sc = new Scanner(System.in);
		String palabra;
		String palabraMayor = "";
		int i=0;

		do {
			System.out.print("Introduce una palabra: ");
			palabra = sc.nextLine();


			if (cuentaVocales(palabra) > cuentaVocales(palabraMayor)) {
				palabraMayor = palabra;
			}
			i++;
		}while(i<11);

		if (cuentaVocales(palabraMayor)<1) {
			System.out.println("Ninguna de las palabras introducidas tiene vocales.");
		}
		else {
			System.out.println("La palabra con más vocales es " + palabraMayor + " y tiene " + cuentaVocales(palabraMayor) + " vocales.");
		}
		sc.close();
	}

	static void ejercicio2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número para ver si es capicúa: ");
		long numero = sc.nextLong();

		if(esCapicua2(numero)) {
			System.out.println("El número es capicúa.");
		}
		else {
			System.out.println("El número no es capicúa.");
		}
		sc.close();
	}

	static void ejercicio3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce una cadena de caracteres: ");
		String cadena = sc.nextLine();
		String cadenaReverse = "";

		int longitud = cadena.length();
		int i=0;

		do {
			char letra = cadena.charAt(i);
			i++;
			cadenaReverse = letra  + cadenaReverse;
		}while(i<longitud);

		System.out.println("La cadena introducida al revés es: \"" + cadenaReverse + "\"");
		sc.close();
	}
	
	public static void ejercicio3StringBuilder() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una palabra: ");
		String cadena = sc.nextLine();
		
		StringBuilder str = new StringBuilder(cadena);
		
		System.out.println("La palabra \"" +cadena + "\" al revés es \"" + str.reverse() + "\"");
		sc.close();
	}

	static void ejercicio4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce una cadena de caracteres: ");
		String palabra = sc.nextLine();
		String palabraReverse = "";

		int longitud = palabra.length();
		int i=0;

		do {
			char letra = palabra.charAt(i);
			i++;
			palabraReverse = letra  + palabraReverse;
		}while(i<(longitud - 1));
		String palabraFinal = palabra + palabraReverse;

		System.out.println("Inversión en modo espejo: \"" + palabraFinal + "\"");
		sc.close();
	}

	static void ejercicio5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la cadenas sobre la que desea buscar: ");
		String cadena = sc.nextLine();

		System.out.print("Introduce la cadena que desea buscar: ");
		String cadena2 = sc.nextLine();
		
		System.out.println("La segunda cadena está contenida " + cuentaVeces(cadena, cadena2) + " veces en la primera.");
		
		sc.close();
	}

	static void ejercicio6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la cadenas sobre la que desea buscar: ");
		String cadena = sc.nextLine();
		String cadenaAux = cadena;

		System.out.print("Introduce la cadena que desea buscar: ");
		String cadena2 = sc.nextLine();
		
		while (cadena.indexOf(cadena2) > -1) {
			cadena = cadena.substring(cadena.indexOf(cadena2)+cadena2.length(), cadena.length());
			cadena = cadenaAux.replaceAll(cadena2, reemplazar(cadena2));
		}
		
		System.out.println(cadena);
		sc.close();
	}


	public static void main(String[] args) {

		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio3StringBuilder();
		//ejercicio4();
		//ejercicio5();
		ejercicio6();


	}

}
