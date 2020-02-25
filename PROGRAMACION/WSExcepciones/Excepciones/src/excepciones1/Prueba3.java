package excepciones1;
import java.util.*;

public class Prueba3 {

	public static void main(String[] args) {
		int a = 0, b = 0;

		boolean ex;

		Scanner sc = new Scanner(System.in);

		// Esta es la forma correcta
		do {

		    try {
		        ex = false;
		        System.out.print("Introduce el primer numero a: ");
		        a = Integer.parseInt(sc.next());
		        System.out.print("Introduce el segundo numero b: ");
		        b = Integer.parseInt(sc.next());

		    /*} catch (InputMismatchException  | NumberFormatException exc) {// A partir de la v 8 se puede hacer así
		        System.out.println("Error, lo introducido no es valido: " + exc.getMessage());
		        ex = true;
		    */
		    } catch (InputMismatchException exc) { // saldria si se hiciera nextInt
		        System.out.println("Error, lo introducido no es valido: " + exc.getMessage());
		        ex = true;
		    } catch (NumberFormatException exc) {// Siempre va a salir por aqui, por la lectura de escaner con next
		        System.out.println("Error, lo introducido no es un numero: " + exc.getMessage());
		        ex = true;
		    }
		
		    
		} while(ex);
		sc.close();
		System.out.println("a " + a + " b " + b);
	}

}
