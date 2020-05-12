package ficherosBinarios;

import java.io.*;
import javax.swing.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int nums = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de aleatorios"));
		
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\Users\\alvar\\OneDrive\\Documentos\\FP\\PROGRAMACION\\Ficheros\\aleatorios.dat", true))) {
			DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\alvar\\OneDrive\\Documentos\\FP\\PROGRAMACION\\Ficheros\\aleatorios.dat"));
			
			for(int i=0; i<nums; i++) {
				int aux = (int)Math.floor(Math.random()*101);
				dos.writeInt(aux);
			}
			
			while(true) {
				System.out.println(dis.readInt());
			}
		} catch (EOFException e) {
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error!");
		}
		
	}

}
