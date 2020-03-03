package excepciones;

import javax.swing.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int n, suma=1;
	
		try {
			n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para calcular su factorial"));
		}
		catch(FactorialNegExc e){
			
		}
		
		for(int i=1;i<n;i++) {
			suma=suma+(suma*i);
		}
		JOptionPane.showMessageDialog(null, n+"! = "+suma);
	}

}
