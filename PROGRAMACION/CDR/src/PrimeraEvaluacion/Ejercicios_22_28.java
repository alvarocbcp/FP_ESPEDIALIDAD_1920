package PrimeraEvaluacion;

import java.util.Scanner;

public class Ejercicios_22_28 {
	
	static void ejercicio22() {
		Scanner sc = new Scanner(System.in);
		Boolean bachiller = true, prueba = true;

		System.out.println("¿Tienes el título de bachillerato?");
		bachiller = sc.nextBoolean();

		if (bachiller == true) {
			System.out.println("Puedes acceder al Grado Superior.");
		}

		else {
			System.out.println("¿Has superado una prueba de acceso?");
			prueba = sc.nextBoolean();
			if (prueba == true) {
				System.out.println("Puedes acceder al Grado Superior.");
			}
			else {
				System.out.println("No puedes acceder al Grado Superior.");
			}
		}
		sc.close();
	}

	static void ejercicio23() {
		Scanner sc = new Scanner(System.in);
		float num;

		do {
			System.out.println("Introduce el número:");
			num = sc.nextFloat();
		} while (num < 1);

		if (num == 0) {
			System.out.println("El número no es ni par ni impar.");
		}
		else if (num%2 == 0){
			System.out.println("El número es par.");
		}
		else {
			System.out.println("El número es impar.");
		}
		sc.close();
	}
	
	static void ejercicio24() {
		int n;

		for (n=1; n<10; n++) {
			System.out.println(Math.pow(n, 2));
			n = n++;
		}
	}
	
	static void ejercicio25() {
		Scanner sc = new Scanner(System.in);
		int n, contador, resultado;

		System.out.println("Introduce el número hasta el que desea sumar:");
		n = sc.nextInt();

		contador = 1;
		resultado = 0;

		while (contador <= n) {
			resultado = resultado + contador;
			contador = contador + 1;
		}
		System.out.println("La suma es " + resultado);
		sc.close();
	}
	
	static void ejercicio26() {
		Scanner sc = new Scanner(System.in);
		int n, contador, resultado;

		System.out.println("Introduce el número:");
		n = sc.nextInt();

		contador = 0;
		resultado = 0;

		while (contador <= n*2) {
			resultado = resultado + contador;
			contador = contador + 2;
		}
		
		System.out.println("La suma es " + resultado);
		sc.close();
	}
	
	static void ejercicio27() {
		Scanner sc = new Scanner(System.in);
		float salario_hora, n, horas, total_horas, trabajadores;

		System.out.println("Introduce el salario por hora:");
		salario_hora = sc.nextFloat();

		System.out.println("Introduce el número de trabajadores:");
		n = sc.nextFloat();

		total_horas = 0;
		trabajadores = 1;
		do {
			System.out.println("Introduce el número de horas de un trabajador:");
			horas = sc.nextFloat();
			total_horas = total_horas + horas;
			trabajadores = trabajadores + 1;
		}while (trabajadores < (n+1));

		System.out.println("El salario total de los " + n + " trabajadores es: " + total_horas * salario_hora + "€.");
		sc.close();
	}
	
	static void ejercicio28() {
		Scanner sc = new Scanner(System.in);
		float salario_hora, numero_trabajadores, horas, total_horas, trabajadores, horas_extra, total_horas_extra;

		System.out.println("Introduce el salario por hora:");
		salario_hora = sc.nextFloat();

		System.out.println("Introduce el número de trabajadores:");
		numero_trabajadores = sc.nextFloat();

		total_horas = 0;
		horas = 0;
		trabajadores = 0;
		total_horas_extra = 0;
		horas_extra = 0;

		do {
			total_horas = total_horas + horas;
			total_horas_extra = total_horas_extra + horas_extra;
			System.out.println("Introduce el número de horas de un trabajador:");
			horas = sc.nextFloat();
			if (horas > 40) {
				horas_extra = horas - 40;
			}
			else {
				horas_extra = 0;
			}
			trabajadores = trabajadores + 1;
		}while (trabajadores < numero_trabajadores);

		System.out.println("El salario total de los " + numero_trabajadores + " trabajadores es: " + (total_horas * salario_hora + (total_horas_extra * ((salario_hora * 50) / 100))) + "€.");
		sc.close();
	}

	public static void main(String[] args) {
		
		//ejercicio22();
		//ejercicio23();
		//ejercicio24();
		//ejercicio25();
		//ejercicio26();
		//ejercicio27();
		//ejercicio28();
		
		
	}


}
