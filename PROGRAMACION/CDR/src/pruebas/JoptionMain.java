package pruebas;

import javax.swing.*;

public class JoptionMain {

	public static void main(String[] args) {
		/*
		//JOptionPane.showConfirmDialog(null, "Hola soy alvaro");
		//JOptionPane.showMessageDialog(null, "Hola soy alvaro", "Saludo", JOptionPane.QUESTION_MESSAGE);
		String option = JOptionPane.showInputDialog(null, "1. Crear una cuenta\n 2. Sacar dinero\n3. Ingresar dinero\n4. Mostrar una cuenta\n5. Mostrar todas las cuentas");
		
		int opcion = Integer.parseInt(option);
		
		switch(opcion) {
		case 1:
			System.out.println("Haciendo el caso 1.");
			break;
		case 2:
			System.out.println("Haciendo el caso 2.");
			break;
		}
		*/
		
		//JOptionPane.showOptionDialog(null, "¿Desea escoger otra opcion?", "Elegir opcion", 0, 0, null, null, null);
		//JOptionPane.showConfirmDialog(null, "sfdafsa");
		//JOptionPane.showMessageDialog(null, "dfasfas");
		
		int dialogButton = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog (null, "Are you sure?","WARNING", dialogButton);
        if(dialogButton == JOptionPane.YES_OPTION) {
            System.exit(0);
        if(dialogButton == JOptionPane.NO_OPTION) {
        System.out.println("adlfhladnvfas");            }
          }
		
	}

}
