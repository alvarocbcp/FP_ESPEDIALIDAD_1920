package clases2;

import javax.swing.*;

public class LibroMain {

	public static void main(String[] args) {

		
		Libro l1 = new Libro("Los juegos del hambre", "Suzanne Collins", 5, 0);
		Libro l2 = new Libro("En llamas", "Suzanne Collins", 0, 5);
		Libro l3 = new Libro("Sinsajo", "Suzanne Collins", 3, 1);
		
		l1.devolucion();
		JOptionPane.showMessageDialog(null, l1);
		
		l3.prestamo();
		JOptionPane.showMessageDialog(null, l3);
		
		l2.prestamo();
		JOptionPane.showMessageDialog(null, l2);
		
		
		
	}

}
