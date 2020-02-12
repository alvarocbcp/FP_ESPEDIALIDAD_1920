package PrimeraEvaluacion;
import java.util.Scanner;
public class ejerciciosavanzadospseint3 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in); //crear un objeto Scanner
		double sueldob, sueldon, trabajadores, count;
		System.out.println("Cuantos trabajadores hay?");
		trabajadores = i.nextDouble(); //leer un double
		for (count=1; count<trabajadores; count++) {
			System.out.println("Introduzca el sueldo bruto ");
			sueldob = i.nextDouble(); //leer un double
			if (sueldob<=1000 ) {
				sueldon= sueldob*0.9;
				System.out.println("el sueldo neto es " + sueldon);
			}
			else if (sueldob>1000 && sueldob<=2000) {
				sueldon= sueldob*0.85;
				System.out.println("El sueldo neto es " + sueldon);
			}
			else if (sueldob>2000) {
				sueldon = sueldob*0.82;
				System.out.println("El sueldo neto es " + sueldon);
		}
		}
}
}