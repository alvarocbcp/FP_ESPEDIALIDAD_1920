package PrimeraEvaluacion;
import java.util.Scanner;
public class ejerciciosavanzadospseint1 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in); //crear un objeto Scanner
		double finalh, finalm, diferencia, hora1, minuto1, minuto2, hora2, totalmnt1, totalmnt2;
		System.out.print("Introduzca el numero de horas del primer usuario ");
		hora1 = i.nextDouble(); //leer un double
		System.out.print("Introduzca el numero de minutos del primer usuario ");
		minuto1 = i.nextDouble(); //leer un double
		System.out.print("Introduzca el numero de horas del segundo usuario ");
		hora2 = i.nextDouble(); //leer un double
		System.out.print("Introduzca el numero de minutos del segundo usuario ");
		minuto2 = i.nextDouble(); //leer un double
		totalmnt1= hora1*60 + minuto1;
		totalmnt2= hora2*60 + minuto2;
		if (totalmnt1>totalmnt2) {
			diferencia= totalmnt1-totalmnt2;
		}
		else  {
			diferencia= totalmnt2-totalmnt1;
		}
		finalm= diferencia % 60;
		finalh= (diferencia-finalm)/60;
		System.out.print ("Te da " + finalh + "horas y " + finalm + "minutos");
}
}