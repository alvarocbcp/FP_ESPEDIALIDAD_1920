package lector;
import java.util.*;

public class Lector{
	public static int leeInt(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return sc.nextInt();
	}
		
	public static String leeCadena(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return sc.next();
	}
	
	public static Float leeFloat(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return sc.nextFloat();
	}
	
	public static Double leeDouble(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return sc.nextDouble();
	}
}