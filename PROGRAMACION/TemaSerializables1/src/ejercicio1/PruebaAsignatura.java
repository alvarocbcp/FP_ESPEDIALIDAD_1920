package ejercicio1;

import java.io.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class PruebaAsignatura {

	final static String NOM_FICH="datos.obj";

	public static void main(String[] args) {

		ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();	
		boolean repetir = true;
		int a;
		DecimalFormat formateador = new DecimalFormat("####.##");
		
		do {
			Asignatura as = new Asignatura(introduceNombre(), introduceNota());
			asignaturas.add(as);
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea añadir otra asignatura?", "¿Continuar?", JOptionPane.YES_NO_OPTION);
			if(respuesta == JOptionPane.NO_OPTION) {
				repetir = false;
			}
		}while(repetir);

		JOptionPane.showMessageDialog(null, "Notas almacenadas en la lista");
		JOptionPane.showMessageDialog(null, "Volcando lista al fichero");
		JOptionPane.showMessageDialog(null, "Volcado realizado con éxito");

		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(NOM_FICH));
			for(int i=0; i<asignaturas.size(); i++) {
				oos.writeObject(asignaturas.get(i));
			}
			oos.close();
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(NOM_FICH));
			JOptionPane.showMessageDialog(null, "Leyendo fichero y calculando nota media");
			Asignatura as;
			double sumador=0;
			for(int i=0; i<asignaturas.size(); i++) {
				as = (Asignatura)ois.readObject();
				JOptionPane.showMessageDialog(null, as.toString());
				sumador = sumador + as.getNota();
			}
			ois.close();
			double media = sumador / asignaturas.size();
			
			JOptionPane.showMessageDialog(null, "La nota media de las asignaturas es: " + formateador.format(media));
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, e);
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}

	public static String introduceNombre() {
		String nombre = JOptionPane.showInputDialog("Introduce el nombre de la asignatura");
		return nombre;
	}

	public static double introduceNota() {
		double nota;
		do{
			nota = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de la asignatura"));
		}while(nota<0 || nota>10);
		return nota;
	}

}
