package alumnos;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Listado {
	
	static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

	public static boolean incrementarSiEsta(String alumno) {
        int res;
        String cadena = "";
        try {
            FileReader lector = new FileReader(Main.ALUMNOS);
            do{
                res = lector.read();
                char letra = (char) res;

                if(res!=-1){
                    cadena = cadena + letra;
                }
                Alumno a = new Alumno(cadena, 1);
                alumnos.add(a);
                return true;
            }while(res!=-1);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido encontrar el archivo indicado.");
        }

        for(int i=0; i<alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase((alumnos.get(i+1).getNombre()))){
                alumnos.get(i).setContador(alumnos.get(i).getContador()+1);
            }
        }
        return false;
    }
	
	public static void aniadir(Alumno alumno) {
        for(int i=0; i<alumnos.size(); i++) {
            if (!alumnos.get(i).getNombre().equalsIgnoreCase((alumnos.get(i+1).getNombre()))){
                alumnos.add(alumno);
            }
        }
    }
	
	public static void mostrarLista() {
        for(int i=0; i<alumnos.size(); i++) {
            alumnos.get(i).toString();
        }
    }
	
	public static void ordenar() {
        for(int i=0; i<alumnos.size(); i++) {
        // alumnos.sort(alumnos.get(i).getContador()); NO CONSIGO QUE SE ORDENEN, HE IMPLEMENTADO LA INTERFAZ COMPARABLE
        }
    }

}
