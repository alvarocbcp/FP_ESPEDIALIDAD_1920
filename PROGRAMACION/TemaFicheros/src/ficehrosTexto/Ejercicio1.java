package ficehrosTexto;

import java.io.*;
import javax.swing.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		File fichero = new File("C:\\Users\\alvar\\OneDrive\\Escritorio\\parrafo.txt");
		
		String cadena;
		
		try {
			if(fichero.createNewFile()) {
				JOptionPane.showMessageDialog(null, "El fichero ha sido creado.");
			}
			else {
				JOptionPane.showMessageDialog(null, "El fichero ya existe.");
			}
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		 try {
	            FileWriter escribir = new FileWriter(fichero);

	            do {
	                cadena=JOptionPane.showInputDialog("Introduzca una cadena para introducir: ");
	                escribir.write(cadena+"\n");
	            }while(!cadena.equals("FIN"));

	            escribir.close();
	        }catch(Exception e){
	            System.out.println("Error al escribir"); 
	        }

	}

}
