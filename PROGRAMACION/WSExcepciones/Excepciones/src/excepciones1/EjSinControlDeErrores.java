package excepciones1;
import java.util.*;

public class EjSinControlDeErrores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Introduce una posicion");   	
	    mostrarEntero (args, scanner.nextInt());
	     	     
	    scanner.close();
	}
	
	public static void mostrarEntero (String args[], int n)
	{
	   System.out.println( "Entero: "+ obtenerEntero(args,n) );
	}
	
	public static int obtenerEntero (String args[], int n)
	{
	   return Integer.parseInt(args[n]);
	}
}