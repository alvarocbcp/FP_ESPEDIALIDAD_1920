package PrimeraEvaluacion;
import java.util.Scanner;
public class ejerciciosavanzadospseint4 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in); //crear un objeto Scanner
		double minutos, finalm, finalh, finald;
		System.out.println("Introduce el numero de minutos");
		minutos = i.nextDouble(); //leer un double
		finalm= minutos % 1440;
		finald= (int) (minutos/1440);
		finalh= (int) (minutos/60) - finald * 24;
		System.out.println("Te da " + finald + "dias, " + finalh + "horas y " + finalm + "minutos");
	}

}
