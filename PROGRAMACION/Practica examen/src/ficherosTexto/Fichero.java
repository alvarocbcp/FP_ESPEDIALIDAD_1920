package ficherosTexto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Fichero {
	final static String PRUEBA = "Prueba.txt";
	public static void main(String[] args) {
		
		// CREACION DEL FICHERO
		File f = new File(PRUEBA);
		
		// ESCRITURA EN EL FICHERO
		try {
			FileWriter escribir = new FileWriter(f);
			
			String nombre = JOptionPane.showInputDialog("INTRODUCE EL NOMBRE A AÑADIR");
			escribir.write(nombre + "\n");
			nombre = JOptionPane.showInputDialog("INTRODUCE EL NOMBRE A AÑADIR");
			escribir.write(nombre + "\n");
			nombre = JOptionPane.showInputDialog("INTRODUCE EL NOMBRE A AÑADIR");
			escribir.write(nombre + "\n");
			nombre = JOptionPane.showInputDialog("INTRODUCE EL NOMBRE A AÑADIR");
			escribir.write(nombre + "\n");
			nombre = JOptionPane.showInputDialog("INTRODUCE EL NOMBRE A AÑADIR");
			escribir.write(nombre + "\n");
			nombre = JOptionPane.showInputDialog("INTRODUCE EL NOMBRE A AÑADIR");
			escribir.write(nombre + "\n");
			escribir.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// LECTURA DE DATOS
		try {
			FileReader lectura = new FileReader(f);
			
			int cod=0;
			
			while(cod!=-1) {
				cod = lectura.read();
				char Letra = (char) cod;
				if(cod!=-1) {
					System.out.print(Letra);
				}
			}
			lectura.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
