package ficherosBinarios;

import java.io.*;
import javax.swing.*;

public class Ejercicio2 {

	public static void main(String[] args) {

		String matricula = JOptionPane.showInputDialog(null, "Introduce la matricula del coche", "MATRICULA");
		String marca = JOptionPane.showInputDialog("Introduce la marca del coche", "MARCA");
		double tamanio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tamaño del deposito del coche", "TAMAÑO DEPOSITO"));
		String modelo = JOptionPane.showInputDialog("Introduce el modelo del coche", "MODELO");
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\alvar\\OneDrive\\Documentos\\FP\\PROGRAMACION\\Ficheros\\coches.dat"));
			DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\alvar\\OneDrive\\Documentos\\FP\\PROGRAMACION\\Ficheros\\coches.dat"));
			
			dos.writeUTF(matricula);
			dos.writeUTF(marca);
			dos.writeDouble(tamanio);
			dos.writeUTF(modelo);
			
			while(true) {
				JOptionPane.showMessageDialog(null, "Datos del coche: \n" +
													"\tMatricula: " + dis.readUTF() + "\n" + 
													"\tMarca: " + dis.readUTF() + "\n" + 
													"\tTamaño del deposito: " + dis.readDouble() + " litros\n" + 
													"\tModelo: " + dis.readUTF());
			}
			
		} catch (EOFException e) {
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERROR!");
		}
		

	}

}
