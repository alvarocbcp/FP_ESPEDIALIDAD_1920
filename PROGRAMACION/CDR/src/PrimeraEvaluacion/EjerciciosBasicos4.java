package PrimeraEvaluacion;

import java.util.Scanner;

public class EjerciciosBasicos4 {

	public static boolean esPrimo(int n) {
		int i=2;
		for (i=2; i<n; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void asteriscos(int n) {

		String asterisco = "*";

		for (int i=1; i<=n; i++) {
			System.out.print(asterisco);
		}
	}


	//****************************************************************************************************************


	static void ejercicio1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número:");
		int num = sc.nextInt();
		int cont=1;

		do {
			System.out.println("Introduce un número:");
			num = sc.nextInt();
			cont++;
		}while (num>=0);

		System.out.println("Has introducido " + cont + " números.");
		sc.close();
	}

	static void ejercicio2() {
		Scanner sc = new Scanner(System.in);

		String respuesta = "si";
		int horasExtra = 0;
		int salarioTotal = 0;

		if(respuesta.equalsIgnoreCase("si")) {

			do {
				System.out.println("Introduzca las horas trabajadas:");
				int horasTrabajadas = Integer.parseInt(sc.nextLine());

				if (horasTrabajadas > 35) {
					horasExtra = horasTrabajadas - 35;
					horasTrabajadas = horasTrabajadas - horasExtra;
				}
				else {
					horasExtra = 0;
				}

				salarioTotal = (horasTrabajadas * 15) + (horasExtra * 22);

				System.out.println("Su salario es de " + salarioTotal + "€.");

				System.out.println("¿Desea calcular otro salario? (Si/No)");
				respuesta = sc.nextLine();

			}while(respuesta.equalsIgnoreCase("si"));

			System.out.println("Hasta la próxima!");
			sc.close();
		}
	}

	static void ejercicio3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int n =  Integer.parseInt(sc.nextLine());
		int acumPrimos = 0;
		String Primos = "";

		for (int i=2; i<n; i++) {
			if (esPrimo(i)) {
				acumPrimos++;
				Primos = Primos + " " + i;
			}			
		}
		System.out.println("Hay " + acumPrimos + " números primos y son:" + Primos);
		sc.close();
	}

	static void ejercicio4() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número:");
		int num = sc.nextInt();
		int numMayor = num;
		int acumMayor = 1;

		do {
			System.out.println("Introduce un número:");
			num = sc.nextInt();
			if (num > numMayor) {
				numMayor = num;
			}
			else if(num == numMayor) {
				acumMayor++;
			}
		}while (num>=0);

		System.out.println("El número mayor es el " + numMayor + " y se repite " + acumMayor + " veces.");
		sc.close();
	}

	static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("Introduce un número entre 0 y 10:");
			num = sc.nextInt();
		}while(num<0 || num>10);

		for (int i=num; i>=0; i--) {
			for (int j=0; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		} sc.close();
	}

	static void ejercicio6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la nota del primer examen: ");
		double E1 = sc.nextDouble();
		System.out.print("Introduce la nota del segundo examen: ");
		double E2 = sc.nextDouble();
		System.out.print("Introduce la nota del laboratorio: ");
		double NL = sc.nextDouble();

		double NF = 6;

		double NC = ((NF - (NL*0.3)) / 0.7);

		double E3 = (3 * NC) - E1 -E2;


		System.out.printf("Tienes que sacar un %.1f", E3);
		System.out.print( " en el tercer examen para aprobar con un 6.");

		sc.close();		
	}
	
	static void ejercicio7a() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el número: ");
		int num = sc.nextInt();

		

		System.out.println("Secuencia de Collatz del número " + num + ": ");

		for(int n=1; n<=num; n++) {
			
			while(num != 1) {
				
				if (num%2 == 0) {
					System.out.print(num + " ");
					num /= 2;
				}
				else {
					System.out.print(num + " ");
					num *= 3;
					num++;
				}
				
			}
			System.out.println("1");
		}
		sc.close();
	}

	static void ejercicio7b() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el número: ");
		int num = sc.nextInt();

		

		System.out.println("Gráficos del número " + num + ": ");

		for(int n=1; n<=num; n++) {
			int aux = n;
			int cont=0;
			
			while(aux != 1) {
				
				if (aux%2 == 0) {
					//System.out.print(aux + " ");
					aux /= 2;
					cont++;
				}
				else {
					//System.out.print(aux + " ");
					aux *= 3;
					aux++;
					cont++;
				}
				
			}
			cont++;
			//System.out.println("1");

			for (int i=0; i<cont; i++) {
				System.out.print("* ");
				if(i==cont-1) {
					System.out.println();
				}
			}
		}
		sc.close();
	}


	public static void main(String[] args) {

		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		//ejercicio5();
		//ejercicio6();
		//ejercicio7a();
		//ejercicio7b();
	}
}
