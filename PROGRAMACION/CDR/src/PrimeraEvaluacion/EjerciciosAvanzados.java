package PrimeraEvaluacion;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class EjerciciosAvanzados {
	
	static void ejercicio1() {
		Scanner sc = new Scanner(System.in);
		float hora1, hora2, minuto1, minuto2,total_minutos1, total_minutos2, diferencia1, diferencia2, horafinal1, minutofinal1, horafinal2, minutofinal2;

		System.out.println("Introduzca la primera hora, luego pulsa intro e introduce los minutos:");
		hora1 = sc.nextFloat();
		minuto1 = sc.nextFloat();

		System.out.println("Introduzca la segunda hora, luego pulsa intro e introduce los minutos:");
		hora2 = sc.nextFloat();
		minuto2 = sc.nextFloat();

		total_minutos1 = (hora1 * 60) + minuto1;
		total_minutos2 = (hora2 * 60) + minuto2;

		if (minuto1 > 60 || minuto2 > 60 || hora1 > 23 || hora2 > 23) {
			System.out.println("Error! Esa hora no existe.");
		}
		else {
			if (total_minutos1 > total_minutos2) {
				diferencia1 = total_minutos1 - total_minutos2;
				horafinal1 = (int) (diferencia1 / 60);
				minutofinal1 = diferencia1 % 60;
				System.out.println("La diferencia es de " + horafinal1 + " horas y " + minutofinal1 + " minutos.");
			}
			else if (total_minutos1 < total_minutos2) {
				diferencia2 = total_minutos2 - total_minutos1;
				horafinal2 = (int) (diferencia2 / 60);
				minutofinal2 = diferencia2 % 60;
				System.out.println("La diferencia es de " + horafinal2 + " horas y " + minutofinal2 + " minutos.");
			}
			else {
				System.out.println("Las dos horas son iguales, no hay diferencia horaria.");
			}
		}
		sc.close();
	}
	
	static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		float sueldo_inicial, sueldo_neto1, sueldo_neto2, sueldo_neto3;

		System.out.println("Introduce tu sueldo:");
		sueldo_inicial = sc.nextFloat();

		if (sueldo_inicial <= 1000) {
			sueldo_neto1 = sueldo_inicial - ((sueldo_inicial * 10) / 100);
			System.out.println("Su sueldo neto es de: " + sueldo_neto1 + "€.");
		}
		else if (1000 < sueldo_inicial && sueldo_inicial <= 2000){
			sueldo_neto2 = sueldo_inicial - ((sueldo_inicial * 15) / 100);
			System.out.println("Su sueldo neto es de: " + sueldo_neto2 + "€.");
		}
		else {
			sueldo_neto3 = sueldo_inicial - ((sueldo_inicial * 18) / 100);
			System.out.println("Su sueldo neto es de: " + sueldo_neto3 + "€.");
		}
		sc.close();
	}
	
	static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		float sueldo_inicial, sueldo_neto1, sueldo_neto2, sueldo_neto3, acum, total_trabajadores;

		System.out.println("Introduce el número total de trabajadores:");
		total_trabajadores = sc.nextFloat();

		for (acum=0; acum<total_trabajadores; acum++) {
			System.out.println("Introduce tu sueldo:");
			sueldo_inicial = sc.nextFloat();

			if (sueldo_inicial <= 1000) {
				sueldo_neto1 = sueldo_inicial - ((sueldo_inicial * 10) / 100);
				System.out.println("Su sueldo neto es de: " + sueldo_neto1 + "€.");
			}
			else if (1000 < sueldo_inicial && sueldo_inicial <= 2000){
				sueldo_neto2 = sueldo_inicial - ((sueldo_inicial * 15) / 100);
				System.out.println("Su sueldo neto es de: " + sueldo_neto2 + "€.");
			}
			else {
				sueldo_neto3 = sueldo_inicial - ((sueldo_inicial * 18) / 100);
				System.out.println("Su sueldo neto es de: " + sueldo_neto3 + "€.");
			}
		}
		sc.close();
	}
	
	static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		float tiempo, minutos, horas, dias, x;

		System.out.println("Introduce el tiempo en minutos");
		tiempo = sc.nextFloat();

		dias = (int) (tiempo / 1440);
		x = tiempo % 1440;
		horas = (int) (x / 60);
		minutos = x % 60;

		System.out.println("Te da " + dias + " dias, " + horas + " horas, " + minutos + " minutos.");
		sc.close();
	}
	
	static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		float precio_producto, numero_productos, precio_final, precio_final_descuento;

		System.out.println("Introduce el precio del producto:");
		precio_producto = sc.nextFloat();

		System.out.println("Introduce el número de productos que desea comprar:");
		numero_productos = sc.nextFloat();

		final float IVA = 0.15F;
		precio_final = precio_producto + (precio_producto * IVA);

		if (precio_final > 50) {
			precio_final_descuento = precio_final - ((precio_final * 5) / 100);
			System.out.println("El precio total es de: " + (precio_final_descuento * numero_productos) + " €.");
		}
		else {
			System.out.println("El precio total es de: " + (precio_final * numero_productos) + " €.");
		}
		sc.close();
	}
	
	static void ejercicio6() {
		Scanner sc = new Scanner(System.in);
		double n;

		System.out.println("Introduzca el número:");
		n = sc.nextFloat();

		DecimalFormat df = new DecimalFormat("#");
		df.setRoundingMode(RoundingMode.DOWN);
		df.format(n);
		int n1 = (int) n;

		if (n == n1) {
			System.out.println("El número no tiene parte fraccionaria.");
		}
		else {
			System.out.println("El número si tiene parte fraccionaria.");
		}
		sc.close();
	}
	
	static void ejercicio7() {
		Scanner sc = new Scanner(System.in);
		float l1, l2, l3;

		System.out.println("Introduce el lado 1");
		l1 = sc.nextFloat();

		System.out.println("Introduce el lado 2");
		l2 = sc.nextFloat();

		System.out.println("Introduce el lado 3");
		l3 = sc.nextFloat();

		if (l1 > (l2 + l3) || l2 > (l1 + l3) || l3 > (l1 + l2)) {
			System.out.println("Los tres lados no forman ningún triángulo.");
		}
		else if (l1 == l2 && l2 == l3) {
			System.out.println("El triángulo es equilátero.");
		}
		else if ((l1 == l2 && l2 != l3) || (l2 == l3 && l3 != l1) || (l1 == l3 && l3 != l2)) {
			System.out.println("El triángulo es isósceles.");
		}
		else {
			System.out.println("El triángulo es escaleno.");
		}
		sc.close();
	}
	
	static void ejercicio8() {
		Scanner sc = new Scanner(System.in);
		float num1, num2, num3;

		System.out.println("Introduce los 3 números pulsando intro despues de cada uno:");
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		num3 = sc.nextFloat();

		if (num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println("De mayor a menor: " + num1 + " > " + num2 + " > " + num3 + ".");
			System.out.println("De menor a mayor: " + num3 + " < " + num2 + " < " + num1 + ".");
		}
		else if (num1 > num2 && num1 > num3 && num3 > num2) {
			System.out.println("De mayor a menor: " + num1 + " > " + num3 + " > " + num2 + ".");
			System.out.println("De menor a mayor: " + num2 + " < " + num3 + " < " + num1 + ".");
		}
		else if (num2 > num1 && num2 > num3 && num1 > num3) {
			System.out.println("De mayor a menor: " + num2 + " > " + num1 + " > " + num3 + ".");
			System.out.println("De menor a mayor: " + num3 + " < " + num1 + " < " + num2 + ".");
		}
		else if (num2 > num1 && num2 > num3 && num3 > num1) {
			System.out.println("De mayor a menor: " + num2 + " > " + num3 + " > " + num1 + ".");
			System.out.println("De menor a mayor: " + num1 + " < " + num3 + " < " + num2 + ".");
		}
		else if (num3 > num1 && num3 > num2 && num1 > num2) {
			System.out.println("De mayor a menor: " + num3 + " > " + num1 + " > " + num1 + ".");
			System.out.println("De menor a mayor: " + num2 + " < " + num1 + " < " + num3 + ".");
		}
		else {
			System.out.println("De mayor a menor: " + num3 + " > " + num2 + " > " + num1 + ".");
			System.out.println("De menor a mayor: " + num1 + " < " + num2 + " < " + num3 + ".");
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
		//ejercicio7();
		//ejercicio8();
		

	}
}
