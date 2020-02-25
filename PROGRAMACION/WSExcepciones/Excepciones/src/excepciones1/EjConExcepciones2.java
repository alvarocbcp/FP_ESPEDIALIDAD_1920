package excepciones1;
import java.util.*;

public class EjConExcepciones2 {
	public static void main(String args[]) {
	     Scanner scanner = new Scanner(System.in);
	     boolean ex;
	    
	     // Añadimos un bucle para que siga pidiendo la posición hasta que el dato leído se corresponda 
	     // con un dato entero y en el argumento en la posición adecuada tenga un valor numérico.
	     do {
		     ex = false;
	    	 try {
		     	System.out.println("Introduce una posicion");   	
		     	//mostrarEntero (args, scanner.nextInt()); 
		     	// nextInt devuelve excepción y no llega a vaciar el buffer
		     	// por lo que no vuelve a pedir posición
		     	mostrarEntero(args, Integer.parseInt(scanner.next()));
		     }
		     catch(ArrayIndexOutOfBoundsException error){
		     	System.out.println(" error " + "Introduzca una posicion dentro del rango del array");
		     	 ex = true;
		     }
		     catch(InputMismatchException error){
		     	System.out.println(" error " + "Introduzca una posicion en formato numerico");
		     	 ex = true;
		     }
	    	 catch (NumberFormatException error) {
				System.out.println(" error " + "El dato leido no es numerico");
				ex = true;
	    	 }
		     catch(Exception error){
		     	System.out.println(" error " + error);// Ejecuta el método toString()
		     	ex = true;
		     }
	     }while (ex);
	     
	     scanner.close();
	 
	   }
	  
	   public static void mostrarEntero(String args[], int n) {
	      System.out.println("Entero " + obtenerEntero(args, n));	
	   }
	   
	   public static int obtenerEntero(String args[], int n) {
	      return Integer.parseInt(args[n]);	
	   }
}
