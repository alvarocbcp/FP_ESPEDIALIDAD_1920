package ficehrosTexto;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Ejercicio3 {

	public static void main(String[] args) {

		crearFichero("C:\\Users\\alvar\\OneDrive\\Escritorio\\f1.txt");
		escribirFichero("C:\\Users\\alvar\\OneDrive\\Escritorio\\f1.txt");

		crearFichero("C:\\Users\\alvar\\OneDrive\\Escritorio\\f2.txt");
		escribirFichero("C:\\Users\\alvar\\OneDrive\\Escritorio\\f2.txt");

		creaFusion("C:\\Users\\alvar\\OneDrive\\Escritorio\\f1.txt", "C:\\Users\\alvar\\OneDrive\\Escritorio\\f2.txt", "C:\\Users\\alvar\\OneDrive\\Escritorio\\f3.txt");



	}


	public static void crearFichero(String archivo) {

		File fichero = new File(archivo);

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

	}

	public static void escribirFichero(String archivo) {

		String cadena = JOptionPane.showInputDialog("Introduce una cadena.");

		ArrayList<Character> cadenaChar = new ArrayList<Character>();

		for(int i=0; i<cadena.length(); i++) {
			if(cadena.charAt(i)!=' ') {
				cadenaChar.add(cadena.charAt(i));
			}
		}
		Collections.sort(cadenaChar);

		try {
			FileWriter escribir = new FileWriter(archivo);
			for(int i=0; i<cadenaChar.size(); i++) {
				escribir.write(cadenaChar.get(i) + "\n");
			}
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void creaFusion(String archivo1, String archivo2, String archivo3) {
		
		ArrayList<Character> letras = new ArrayList<Character>();
		
		try {
			FileReader lector1 = new FileReader(archivo1);
			FileReader lector2 = new FileReader(archivo2);
			crearFichero(archivo3);
			FileWriter escribir = new FileWriter(archivo3);
			int cod1;
			int cod2;
			do {
				cod1=lector1.read();
				char letra = (char) cod1;
				if(cod1!=-1 && cod1!=10) {
					letras.add(letra);
				}
			}while(cod1!=-1);
			do {
				cod2=lector2.read();
				char letra = (char) cod2;
				if(cod2!=-1 && cod2!=10) {
					letras.add(letra);
				}
			}while(cod2!=-1);
			lector1.close();
			lector2.close();
			Collections.sort(letras);
			for(int i=0; i<letras.size();i++) {
				System.out.println(letras.get(i));
			}
			for(int i=0; i<letras.size(); i++) {
				escribir.write(letras.get(i) + "\n");
			}
			escribir.close();
		} catch (IOException ioe) {
			JOptionPane.showMessageDialog(null, "No se han podido encontrar los dos ficheros");
		}
		
	}
}