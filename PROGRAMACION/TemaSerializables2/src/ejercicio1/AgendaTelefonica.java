package ejercicio1;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class AgendaTelefonica {
	final static String NOM_FICH="personas.dat", NOM_FICH_AUX="auxiliar.dat", NOM_FICH_ELIM="Eliminados.txt";
	public static void main(String[] args) {		
		File f = new File(NOM_FICH);
		File faux = new File(NOM_FICH_AUX);
		File felim = new File(NOM_FICH_ELIM);
		boolean repetir = true;
		int opcion;
		ArrayList<Persona> personas = new ArrayList<Persona>();

		do {
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opcion:"
						+ "\n1. Dar de alta."
						+ "\n2. Buscar persona."
						+ "\n3. Modificar telefono y/o email."
						+ "\n4. Eliminar persona."
						+ "\n5. Ordenar alfabeticamente."
						+ "\n6. Mostrar contenido."
						+ "\n7. Salir del menú."));
			}while(opcion<1 || opcion>7);


			switch(opcion) {
			case 1:
				Metodos.darDeAlta(f);
				break;
			case 2:
				Metodos.buscarPersona(f);
				break;
			case 3:
				Metodos.modificarTelEmail(f, faux);
				break;
			case 4:
				Metodos.eliminarPersona(f, faux, felim);
				break;
			case 5:
				Metodos.ordenarAlfab(f, personas, faux);
				break;
			case 6:
				Metodos.mostrarContenido(f);
				break;
			case 7:
				Metodos.mostrarElim(felim);
				repetir = false;
				JOptionPane.showMessageDialog(null, "Gracias por utilizar este servicio");
				break;
			}
		}while(repetir);



	}

}
