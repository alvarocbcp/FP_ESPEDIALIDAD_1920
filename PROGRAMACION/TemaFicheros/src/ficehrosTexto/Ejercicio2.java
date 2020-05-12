package ficehrosTexto;

import java.io.*;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {

		LeerFichero acceder = new LeerFichero();

		acceder.ficheroSinVocales();

	}

}

class LeerFichero{

	public void ficheroSinVocales() {
		String cadena="";
		
		try {
			FileReader entrada = new FileReader("C:\\Users\\alvar\\OneDrive\\Escritorio\\parrafo.txt");

			int cod;
			

			do{

				cod = entrada.read();

				char letra = (char) cod;
			
				if(cod!=-1){
					cadena = cadena + letra;
				}
			}while(cod!=-1);
			JOptionPane.showMessageDialog(null, cadena);
			entrada.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo.");
		}
		
		String cadenaFinal="";
		
		for(int i=0; i<cadena.length(); i++) {
			cadena = cadena.toLowerCase();
			switch(cadena.charAt(i)) {
			case 'a':
				break;
			case 'á':
				break;
			case 'e':
				break;
			case 'é':
				break;
			case 'i':
				break;
			case 'í':
				break;
			case 'o':
				break;
			case 'ó':
				break;
			case 'u':
				break;
			case 'ú':
				break;
			case 'ü':
				break;
				default:
					cadenaFinal = cadenaFinal + cadena.charAt(i);
					break;
			}
		}
		
		JOptionPane.showMessageDialog(null, cadenaFinal);
		
		File fichero = new File("C:\\Users\\alvar\\OneDrive\\Escritorio\\parrafo2.txt");
		
		
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
			
			escribir.write(cadenaFinal);
			escribir.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error al escribir.");
		}
	}
	
	
}