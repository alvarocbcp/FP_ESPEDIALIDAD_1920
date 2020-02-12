package clases3;

import javax.swing.JOptionPane;

public class AlumnoMain {

	public static void main(String[] args) {
		
		Alumno[] arrAlumnos = new Alumno[10];
		Alumno[] arrSuspensos = new Alumno[10];
		Alumno[] arrAprobados = new Alumno[10];
		String nombre;
		String apellido;
		int curso;
		double nota;
		int j=0;
		int k=0;
		
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué opción desea realizar?"));
		
		switch(opcion) {
		case 1:
			for(int i=0; i<arrAlumnos.length; i++) {
				nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno");
				apellido = JOptionPane.showInputDialog("Introduce el apellido del alumno");
				curso = Integer.parseInt(JOptionPane.showInputDialog("Introduce el curso del alumno"));
				nota = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota del alumno"));
				
				arrAlumnos[i] = new Alumno(nombre, apellido, curso, nota);
			}
			break;
		case 2:
			for(int i=0; i<arrAlumnos.length;i++) {
				if(arrAlumnos[i].getNota() < 5) {
					arrSuspensos[j] = arrAlumnos[i];
					j++;
				}
			}
			break;
		case 3:
			for(int i=0; i<arrAlumnos.length;i++) {
				if(arrAlumnos[i].getNota() >= 5) {
					arrAprobados[k] = arrAlumnos[i];
					k++;
				}
			}
		
		}

	}

}
