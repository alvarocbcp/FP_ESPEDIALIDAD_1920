package ficherosBinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog(null, "Introduce el nombre y primer apellido", "Juan Lopez");
		String sexo;
		do {
			sexo = JOptionPane.showInputDialog("Introduce el sexo", "H-M");
			sexo = sexo.toUpperCase();
		}while(!sexo.equals("H") && !sexo.equals("M"));
		int edad;
		do {
			edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad", "20-60"));
		}while(edad<20 || edad>60);
		int suspensos;
		do {
			suspensos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de suspensos del curso anterior", "0-4"));
		}while(suspensos<0 || suspensos>4);
		String residencia;
		do {
			residencia = JOptionPane.showInputDialog("Introduce si dispone de residencia familiar", "SI-NO");
			residencia = residencia.toUpperCase();
		}while(!residencia.equals("SI") && !residencia.equals("NO"));
		double ingresos = Double.parseDouble(JOptionPane.showInputDialog("Introduce los ingresos anuales familiares", "16545"));
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\alvar\\OneDrive\\Documentos\\FP\\PROGRAMACION\\Ficheros\\datosbeca.bin"));
			DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\alvar\\OneDrive\\Documentos\\FP\\PROGRAMACION\\Ficheros\\datosbeca.bin"));
			
			dos.writeUTF(nombre);
			dos.writeUTF(sexo);
			dos.writeInt(edad);
			dos.writeInt(suspensos);
			dos.writeUTF(residencia);
			dos.writeDouble(ingresos);
			
			
			while(true) {
				JOptionPane.showMessageDialog(null, "Datos del becado: \n" +
													"\tNombre: " + dis.readUTF() + "\n" + 
													"\tSexo: " + dis.readUTF() + "\n" + 
													"\tEdad: " + dis.readInt() + " años\n" + 
													"\tSuspensos en curso anterior: " + dis.readInt() + "\n" +
													"\tResidencia familiar: " + dis.readUTF() + "\n" +
													"\tIngresos anuales: " + dis.readDouble() + "€");
			}
			
		} catch (EOFException e) {
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERROR!");
		}
		

	}

}
