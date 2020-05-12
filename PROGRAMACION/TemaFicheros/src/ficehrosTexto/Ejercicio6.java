package ficehrosTexto;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Ejercicio6 {

	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<String>();
		
		try {
			FileReader entrada = new FileReader("C:\\Users\\alvar\\OneDrive\\Escritorio\\nombres.txt");

			String cadena = "";
			int cod;
			
			
			do {
				do{
					cod = entrada.read();
					char letra = (char) cod;
					if(cod!=10){
						cadena = cadena + letra;
					}
				}while(cod!=10 && cod!=-1);
				if(cod!=-1) {
					nombres.add(cadena);
					cadena = "";
				}
			}while(cod!=-1);
			entrada.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo.");
		}
		
		int[] longitud = new int[nombres.size()];
		
		for(int i=0; i<longitud.length; i++) {
			longitud[i] = nombres.get(i).length();
		}
		
		int sumador=0;
		
		for(int i=0; i<longitud.length; i++) {
			sumador = sumador + longitud[i];
		}
		
		int media = sumador / longitud.length;

		for(int i=0; i<longitud.length; i++) {
			System.out.print(nombres.get(i) + "	" + longitud[i] + "	" + media + "\n");
		}

	}
}


