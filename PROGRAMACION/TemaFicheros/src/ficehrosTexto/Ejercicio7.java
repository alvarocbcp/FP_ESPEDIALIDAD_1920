package ficehrosTexto;

import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {

		ArrayList<String> nombresApellidos = new ArrayList<String>();

		try {
			FileReader entrada = new FileReader("C:\\Users\\alvar\\OneDrive\\Escritorio\\nombres.txt");

			String cadena = "";
			int cod;


			do {
				do{
					cod = entrada.read();
					char letra = (char) cod;
					if(cod!=10){
						cadena = cadena + letra;
					}
				}while(cod!=10 && cod!=-1);
				if(cod!=-1) {
					nombresApellidos.add(cadena);
					cadena = "";
				}
			}while(cod!=-1);
			entrada.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo.");
		}

		String[] nombres = new String[nombresApellidos.size()];
		String[] apellidos = new String[nombresApellidos.size()];
		String[] nombreApellido = new String[2];

		for(int i=0; i<nombresApellidos.size(); i++) {
			nombreApellido = nombresApellidos.get(i).split(" ");
			nombres[i] = nombreApellido[0];
			apellidos[i] = nombreApellido[1];
		}
		
		DecimalFormat formateador = new DecimalFormat("####.##");
		
		double contNombres = 0;

		for(int i=0; i<nombres.length; i++) {
			contNombres = contNombres + nombres[i].length();
		}
		
		double mediaNombres = contNombres / nombres.length;

		double contApellidos = 0;

		for(int i=0; i<apellidos.length; i++) {
			contApellidos = contApellidos + apellidos[i].length();
		}

		double mediaApellidos = contApellidos / apellidos.length;
		
		System.out.println("--------NOMBRES---------MEDIA");
		
		for(int i=0; i<nombres.length; i++) {
			System.out.print(nombres[i] + "\t");
		}
		System.out.println(formateador.format(mediaNombres));
		
		System.out.println("-------APELLIDOS--------MEDIA");
		
		for(int i=0; i<apellidos.length; i++) {
			System.out.print(apellidos[i] + "\t");
		}
		System.out.println(formateador.format(mediaApellidos));

	}

}
