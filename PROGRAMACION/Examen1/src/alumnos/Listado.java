package alumnos;

import java.util.ArrayList;
import java.util.Collections;

public class Listado {

	ArrayList<Alumno> alumnos;

	public Listado() {
		alumnos = new ArrayList<Alumno>();
	}

	public boolean incrementarSiEsta(String nombre) {

		boolean existe = false;
		for(int i=0; i<alumnos.size() && !existe; i++) {
			if(alumnos.get(i).getNombre().equals(nombre)) {
				existe = true;
				alumnos.get(i).setContador(alumnos.get(i).getContador()+1);
			}
		}
		return existe;
	}
	
	public void aniadir (Alumno alumno) {
		alumnos.add(alumno);
	}
	
	public void mostrarLista() {
		for(int i=0; i<alumnos.size(); i++) {
			System.out.println(alumnos.get(i));
		}
	}
	
	public void ordenar() {
		Collections.sort(alumnos);
	}
}