package excepciones1;
import java.util.*;

public class Prueba2 {

	public static void main(String[] args) {
		int a = 0, b = 0;

		boolean ex;

		Scanner sc = new Scanner(System.in);

		do {

		    try {
		        ex = false;
		        System.out.print("Introduce el primer numero a: ");
		        a = sc.nextInt();
		        System.out.print("Introduce el segundo numero b: ");
		        b = sc.nextInt();

		    } catch (InputMismatchException exc) {
		    	sc.next();// Para limpiar el buffer después de leer el numero
		    	System.out.println("Error, lo introducido no es valido: " + exc.getMessage());
		        ex = true;
		    }
		
		} while(ex);
		sc.close();
		System.out.println("a " + a + " b " + b);
		
	}

}
