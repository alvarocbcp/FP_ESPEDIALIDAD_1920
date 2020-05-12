package ficehrosTexto;

import java.io.*;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		String cadena="";
		
		try {
			FileReader entrada = new FileReader("C:\\Users\\alvar\\OneDrive\\Escritorio\\parrafo.txt");

			int cod;
			
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para codificar el archivo."));
			
			do{
				cod = entrada.read() + num;
				
				char letra = (char) cod;
			
				cod = cod - num;
				if(cod!=-1){
					cadena = cadena + letra;
				}
			}while(cod!=-1);
			JOptionPane.showMessageDialog(null, cadena);
			entrada.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo.");
		}
		
		File archivo = new File("C:\\Users\\alvar\\OneDrive\\Escritorio\\codificado.txt");
		
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
			
			escribir.write(cadena);
			escribir.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error al escribir en el archivo.");
		}
	}

}
