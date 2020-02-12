package PrimeraEvaluacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosFunciones {

	public static int suma() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		int a = sc.nextInt();
		System.out.println("Introduce el segundo número:");
		int b = sc.nextInt();
		return a + b;
	}

	public static int resta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		int a = sc.nextInt();
		System.out.println("Introduce el segundo número:");
		int b = sc.nextInt();
		return a - b;
	}

	public static int producto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		int a = sc.nextInt();
		System.out.println("Introduce el segundo número:");
		int b = sc.nextInt();
		return a * b;
	}

	public static int division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		int a = sc.nextInt();
		System.out.println("Introduce el segundo número:");
		int b = sc.nextInt();
		return a / b;
	}

	public static float sumaReales() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		float a = sc.nextFloat();
		System.out.println("Introduce el segundo número:");
		float b = sc.nextFloat();
		return a + b;
	}

	public static double areaCirculo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio:");
		double r = sc.nextDouble();
		return 2 * Math.PI * r;
	}

	public static double areaTriangulo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base:");
		double b = sc.nextDouble();
		System.out.println("Introduce la altura:");
		double h = sc.nextDouble();
		return ((b * h) / 2);
	}

	public static double areaCuadrado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el lado:");
		double l = sc.nextDouble();
		return Math.pow(l, 2);
	}
	
	public static String decimalBinario() {
		Scanner sc = new Scanner(System.in);
		int decimal, resto;
		String binario = "";
		System.out.println("Introduce el número decimal:");
		decimal = sc.nextInt();
		
		while (decimal > 0) {
			resto = (decimal%2);
			binario =  resto + binario;
			decimal = decimal/2;
		}
		return binario;
	}
	
	public static int cifrasEntero(int num) {
		int nCifras = 0;
		do {
			num = num / 10;
			nCifras ++;
		}while(num != 0);
		
		return nCifras;
	}
	
	public static float eurosDolares() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los euros a cambiar:");
		double euros = sc.nextDouble();
		double eurosDolares = 1.28611;
		
		double dolares = euros * eurosDolares;
		
		return (float) dolares;
	}
	
	public static float eurosLibras() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los euros a cambiar:");
		double euros = sc.nextDouble();
		double eurosLibras = 0.86;
		
		double libras = euros * eurosLibras;
		
		return (float) libras;
	}
	
	public static float eurosYenes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los euros a cambiar:");
		double euros = sc.nextDouble();
		double eurosYenes = 0129.852;
		
		double yenes = euros * eurosYenes;
		
		return (float) yenes;
	}
	
	//************************************************************************************************************************************************************************
	
	static void tabla(int x) {
		int resultado;
		for (int i=1; i<=10; i++) {
			resultado = i * x;
			System.out.println(i + " x " + x + " = " + resultado);
		}
	}
	
	static void Ejercicio1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		int N = sc.nextInt();
		for (int i=0; i<N; i++) {
			System.out.println("ejecutando el programa "+ N +" veces");
		}
		sc.close();
	}

	static void Ejercicio2() {			
		System.out.println("La suma es: " + suma());
		System.out.println("La resta es: " + resta());
		System.out.println("El producto es: " + producto());
		System.out.println("La division es: " + division());
	}

	static void Ejercicio3() {			
		System.out.println("La suma es:" + sumaReales());
	}

	static void Ejercicio4() {
		Scanner sc = new Scanner(System.in);
		int N;

		System.out.println("Introduce un número");
		N = sc.nextInt();

		int acum=N, x=N;

		for(int i=1; i<N; i++) {
			x = x - 1;
			acum = acum * x;
		}
		System.out.println(N + "! = " + acum);
		sc.close();
	}

	static void Ejercicio5() {
		Scanner sc = new Scanner(System.in);
		String operacion;

		System.out.println("¿Qué operación desea realizar?");

		do {

			operacion = sc.nextLine();
			operacion = operacion.toLowerCase();

			if ((operacion.equalsIgnoreCase("suma") || (operacion.equalsIgnoreCase("resta")) || (operacion.equalsIgnoreCase("multiplicacion")) || (operacion.equalsIgnoreCase("division")))) {
				switch (operacion) {
				case "suma":
					System.out.println("La suma es: " + suma());
					break;
				case "resta":
					System.out.println("La resta es: " + resta());
					break;
				case "multiplicacion":
					System.out.println("El producto es: " + producto());
					break;
				case "division":
					System.out.println("La división es: " + division());
					break;
				default:
					System.out.println("EXIT");
					break;
				}				
			}
			else {
				System.out.println("ERROR!");
				System.out.println("Introduzca una operación válida:");
			}			
		}while (!(operacion.equalsIgnoreCase("suma") || (operacion.equalsIgnoreCase("resta")) || (operacion.equalsIgnoreCase("multiplicacion")) || (operacion.equalsIgnoreCase("division"))));

		System.out.println("EXIT");
		sc.close();
	}

	static void Ejercicio6(){
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int opcion; //Guardamos la opcion del usuario.

		while (!salir) {

			System.out.println("\n¿Qué opción desea realizar?");
			System.out.println("1. Calcula el área de un círculo.");
			System.out.println("2. Calcula el área de un triángulo.");
			System.out.println("3. Calcula el área de un cuadrado.");
			System.out.println("4. Salir del programa.");

			try {

				opcion = sc.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("El área del círculo es " + areaCirculo());
					break;
				case 2:
					System.out.println("El área del triángulo es " + areaTriangulo());
					break;
				case 3:
					System.out.println("El área del cuadrado es " + areaCuadrado());
					break;
				case 4:
					System.out.println("¡Hasta luego!");
					salir = true;
					break;
				default:
					System.out.println("Introduce solo números entre 1 y 4");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número entre 1 y 4");
				sc.next();
			}
		}
		sc.close();
	}
	
	static void Ejercicio7() {
		System.out.println("El numero en binario es " + decimalBinario());
	}
	
	static void Ejercicio8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número.");
		int num = sc.nextInt();
		System.out.println("El número introducido tiene " + cifrasEntero(num) + " cifras.");
		sc.close();
	}
	
	static void Ejercicio9() {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int opcion; //Guardamos la opcion del usuario.

		while (!salir) {

			System.out.println("\n¿Qué opción desea realizar?");
			System.out.println("1. Convertir euros a Dólares.");
			System.out.println("2. Convertir euros a Libras.");
			System.out.println("3. Convertir euros a Yenes.");
			System.out.println("4. Salir del programa.");

			try {

				opcion = sc.nextInt();

				switch (opcion) {
				case 1:
					System.out.printf("Los euros introducidos son %.2f $.", eurosDolares());
					break;
				case 2:
					System.out.printf("Los euros introducidos son  %.2f £.", eurosLibras());
					break;
				case 3:
					System.out.printf("Los euros introducidos son %.2f ¥.", eurosYenes());
					break;
				case 4:
					System.out.println("¡Hasta luego!");
					salir = true;
					break;
				default:
					System.out.println("Introduce solo números entre 1 y 4");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sc.next();
			}
		}
		sc.close();
	}
	
	static void tablaMultiplicar() {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Introduzca un número:");
		x = sc.nextInt();
		tabla(x);
		sc.close();
	}
	

	public static void main(String[] args) {
		
		//Ejercicio1();
		//Ejercicio2();
		//Ejercicio3();
		//Ejercicio4();
		//Ejercicio5();
		//Ejercicio6();
		//Ejercicio7();
		//Ejercicio8();
		Ejercicio9();
		//tablaMultiplicar();
	}
}