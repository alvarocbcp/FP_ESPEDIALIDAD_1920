package excepciones1;
import java.util.*;

import javax.swing.JOptionPane;

public class Prueba4 {

	public static void main(String[] args) {
		int a = 0, b = 0;

		boolean ex;

		Scanner sc = new Scanner(System.in);

		// COn JOptionPanel
		do {

		    try {
		        ex = false;
		        //System.out.print("Introduce el primer numero a: ");
		        //a = Integer.parseInt(sc.next());
		        a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero a: "));
		        //System.out.print("Introduce el segundo numero b: ");
		        //b = Integer.parseInt(sc.next());
		        b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero b: "));

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
