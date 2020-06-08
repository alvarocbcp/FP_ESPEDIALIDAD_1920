package alumnos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	final static String ALUMNOS = "Alumnos.txt";

	public static void main(String[] args) {

		try (Scanner fichero = new Scanner(new File(ALUMNOS))) {

			Listado lista = new Listado();
			String nombre;

			while (fichero.hasNext()) {
				nombre = fichero.nextLine();
				nombre = limpiaLinea(nombre);

				// Si el nombre ya existe, incrementamos su contador en 1
				if (!lista.incrementarSiEsta(nombre))
					// Si no existe se incluye el nuevo nombre con contador a 1
					lista.aniadir(new Alumno(nombre, 1));
			}

			System.out.println("\nMostramos la lista sin ordenar\n");
			lista.mostrarLista();
			lista.ordenar();  
			System.out.println("\nMostramos la lista ordenada por numero de apariciones descendente\n");
			lista.mostrarLista();
		} catch (IOException e) {
			System.out.println("Problemas con el fichero. " + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static String limpiaLinea(String linea) {
		return linea.replace(".", "").replace(",", "").replace(":", "");

	}

	

}
