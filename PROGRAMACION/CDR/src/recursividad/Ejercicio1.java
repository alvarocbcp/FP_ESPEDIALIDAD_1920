package recursividad;

import javax.swing.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero para calcular su factorial"));

		JOptionPane.showMessageDialog(null, n + "! = " + factorial(n));
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del numero"));
		int exp = Integer.parseInt(JOptionPane.showInputDialog("Introduce el exponente de la potencia"));

		JOptionPane.showMessageDialog(null, base + " ^ " + exp + " = " + potencia(base, exp));
		
	}
	
	public static int factorial (int n) {
		int resultado;
		
		if(n==0) {
			resultado = 1;
		}
		else {
			resultado = n*factorial(n-1);
		}
		return resultado;
	}
	
	static int potencia (int base, int exp) {
		if(exp==0) {
			return 1;
		}
		else {
			return (base * potencia(base, exp-1));
		}
	}
	

}
