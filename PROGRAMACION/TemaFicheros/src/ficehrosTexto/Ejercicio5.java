package ficehrosTexto;

import java.io.*;

import javax.swing.JOptionPane;

public class Ejercicio5 {
	final static String NOM_FICH="nombres.txt";

	public static void main(String[] args) {
		
		File archivo = new File(NOM_FICH);
		
		boolean repetir = true;
		
		try {
			if(archivo.createNewFile()) {
				JOptionPane.showMessageDialog(null, "El fichero ha sido creado.");
			}
			else {
				JOptionPane.showMessageDialog(null, "El fichero ya existe.");
			}
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		
		
		try {
			FileWriter escribir = new FileWriter(archivo);
			
			do {
				String cadena = JOptionPane.showInputDialog("Introduce un nombre completo.");
				escribir.write(cadena + "\n");
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea añadir otro nombre?", "¿Continuar?", JOptionPane.YES_NO_OPTION);
				if(respuesta == JOptionPane.NO_OPTION) {
					repetir = false;
				}
			}while(repetir);
			escribir.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error al escribir en el archivo.");
		}

	}

}
