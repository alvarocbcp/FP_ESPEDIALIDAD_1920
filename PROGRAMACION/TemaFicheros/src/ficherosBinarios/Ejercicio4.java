package ficherosBinarios;

import java.io.*;

import javax.swing.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String nombre;
		String sexo;
		int edad;
		int suspensos;
		String residencia;
		int ingresos;
		int beca=1500;
		
		try{
			DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\alvar\\OneDrive\\Documentos\\FP\\PROGRAMACION\\Ficheros\\datosbeca.bin"));
			while(true) {
				
				nombre=dis.readUTF();
				sexo=dis.readUTF();
				edad=dis.readInt();
				suspensos=dis.readInt();
				residencia=dis.readUTF();
				ingresos=dis.readInt();
				
				if(ingresos<=12000) {
					beca+=500;
				}
				if(edad<23) {
					beca=beca+200;
				}
				if(suspensos==0) {
					beca=beca+500;
				}
				if(suspensos==1) {
					beca=beca+200;
				}
				if(residencia.toUpperCase().equals("NO")) {
					beca=beca+1000;
				}
				
				JOptionPane.showMessageDialog(null, "Datos del becado: \n"+
						"\tNombre y apellido: " + nombre + "\n"+
						"\tCuantia total: " + beca);
				beca=1500;
			}
			
		}catch(EOFException e) {
			
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Error");
		}
		

	}

}
