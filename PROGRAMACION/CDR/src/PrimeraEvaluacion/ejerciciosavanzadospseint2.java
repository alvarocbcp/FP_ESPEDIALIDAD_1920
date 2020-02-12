package PrimeraEvaluacion;
import java.util.Scanner;
public class ejerciciosavanzadospseint2 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in); //crear un objeto Scanner
		double sueldob, sueldon;
		System.out.print("Introduzca tu sueldo bruto ");
		sueldob = i.nextDouble(); //leer un double
		if (sueldob<=1000 ) {
			sueldon= sueldob*0.9;
			System.out.print("Tu sueldo neto es " + sueldon);
		}
		else if (sueldob>1000 && sueldob<=2000) {
			sueldon= sueldob*0.85;
			System.out.print("Tu sueldo neto es " + sueldon);
		}
		else if (sueldob>2000) {
			sueldon = sueldob*0.82;
			System.out.print("Tu sueldo neto es " + sueldon);
		}
	}
}