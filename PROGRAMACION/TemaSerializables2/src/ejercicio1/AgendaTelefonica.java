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
				String nombre = JOptionPane.showInputDialog("Introduce el nombre").toUpperCase();
				String apellidos = JOptionPane.showInputDialog("Introduce los apellidos").toUpperCase();
				String telefono = JOptionPane.showInputDialog("Introduce el telefono");
				String email = JOptionPane.showInputDialog("Introduce el email");

				Persona p1 = new Persona(nombre, apellidos, telefono, email);

				try {
					if(f.exists()) {
						ClaseOutput co = new ClaseOutput(new FileOutputStream(f, true));
						p1 = new Persona(nombre, apellidos, telefono, email);
						co.writeObject(p1);
						co.close();
					}
					else {
						ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(NOM_FICH));
						p1 = new Persona(nombre, apellidos, telefono, email);
						oos.writeObject(p1);
						oos.close();
					}

				}catch(IOException e) {
					JOptionPane.showMessageDialog(null, e);
				}

				break;
			case 2:
				String nombre2 = JOptionPane.showInputDialog("Introduce el nombre a buscar").toUpperCase();
				String apellidos2 = JOptionPane.showInputDialog("Introduce los apellidos a buscar").toUpperCase();
				String mensaje2 = "";

				try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(NOM_FICH));) {
					Persona p2;
					try {
						while(true) {
							p2 = (Persona)ois.readObject();
							if(p2.getNombre().equals(nombre2) && p2.getApellidos().equals(apellidos2)){
								mensaje2 = p2.toString();
								JOptionPane.showMessageDialog(null, mensaje2);
							}
						}
					}catch (Exception e) {
					}

					if(mensaje2.equals("")) {
						JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias");
					}

				} catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog(null, "No hay ningun contacto en la agenda");
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "FIN DE AGENDA");
				}
				break;
			case 3:
				String nombre3 = JOptionPane.showInputDialog("Introduce el nombre a buscar").toUpperCase();
				String apellidos3 = JOptionPane.showInputDialog("Introduce los apellidos a buscar").toUpperCase();

				try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(NOM_FICH));) {
					Persona p3;
					while(true) {
						p3 = (Persona)ois.readObject();
						if(p3.getNombre().equals(nombre3) && p3.getApellidos().equals(apellidos3)){
							if(JOptionPane.showConfirmDialog(null, "¿Desea modificar el telefono?", "WARNING", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION) {
								String telefonoNew = JOptionPane.showInputDialog("Introduce el nuevo telefono");
								p3.setTelefono(telefonoNew);
								JOptionPane.showMessageDialog(null, "Telefono actualizado");
							}
							else{
								JOptionPane.showMessageDialog(null, "Telefono no actualizado");
							}

							if(JOptionPane.showConfirmDialog(null, "¿Desea modificar el email?", "WARNING", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION) {
								String emailNew = JOptionPane.showInputDialog("Introduce el nuevo email");
								p3.setEmail(emailNew);
								JOptionPane.showMessageDialog(null, "Email acutalizado");
							}
							else{
								JOptionPane.showMessageDialog(null, "Email no actualizado");
							}

							if(faux.exists()) {
								ClaseOutput co = new ClaseOutput(new FileOutputStream(faux, true));
								p3 = new Persona(p3.getNombre(), p3.getApellidos(), p3.getTelefono(), p3.getEmail());
								co.writeObject(p3);
								co.close();
							}
							else {
								ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(NOM_FICH_AUX));
								p3 = new Persona(p3.getNombre(), p3.getApellidos(), p3.getTelefono(), p3.getEmail());
								oos.writeObject(p3);
								oos.close();
							}
						}
						else {
							if(faux.exists()) {
								ClaseOutput co = new ClaseOutput(new FileOutputStream(faux, true));
								p3 = new Persona(p3.getNombre(), p3.getApellidos(), p3.getTelefono(), p3.getEmail());
								co.writeObject(p3);
								co.close();
							}
							else {
								ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(NOM_FICH_AUX));
								p3 = new Persona(p3.getNombre(), p3.getApellidos(), p3.getTelefono(), p3.getEmail());
								oos.writeObject(p3);
								oos.close();
							}
						}
					}

				} catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog(null, "No hay ningun contacto en la agenda");
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "FIN DE AGENDA");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				f.delete();
				faux.renameTo(f);

				break;
			case 4:
				String nombre4 = JOptionPane.showInputDialog("Introduce el nombre a eliminar").toUpperCase();
				String apellidos4 = JOptionPane.showInputDialog("Introduce los apellidos a eliminar").toUpperCase();

				try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(NOM_FICH))){
					Persona p4;
					String mensaje4="";
					while(true) {
						p4 = (Persona)ois.readObject();
						if(p4.getNombre().equals(nombre4) && p4.getApellidos().equals(apellidos4)){
							try {
								mensaje4 = "ELIMINADO DE LA AGENDA";
								JOptionPane.showMessageDialog(null, mensaje4);
								FileWriter escribir = new FileWriter(felim, true);
								escribir.write(p4.getNombre() + " " + p4.getApellidos() + "\n");
								escribir.close();
							}catch (Exception e) {
								JOptionPane.showMessageDialog(null, "Error al escribir en el archivo");
							}
						}
						else {
							if(faux.exists()) {
								ClaseOutput co = new ClaseOutput(new FileOutputStream(faux, true));
								p4 = new Persona(p4.getNombre(), p4.getApellidos(), p4.getTelefono(), p4.getEmail());
								co.writeObject(p4);
								co.close();
							}
							else {
								ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(NOM_FICH_AUX));
								p4 = new Persona(p4.getNombre(), p4.getApellidos(), p4.getTelefono(), p4.getEmail());
								oos.writeObject(p4);
								oos.close();
							}
						}
						if(mensaje4.equals("")) {
							JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias");
						}
					}
				} catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog(null, "No hay ningun contacto en la agenda");
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "FIN DE AGENDA");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				f.delete();
				faux.renameTo(f);
				break;
			case 5:
				ArrayList<Persona> personas = new ArrayList<Persona>();

				try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(NOM_FICH))){
					Persona p5;
					try{
						while(true) {
							p5 = (Persona)ois.readObject();
							personas.add(p5);
						}
					}catch (IOException e) {
					}
					
					JOptionPane.showMessageDialog(null, "CONTACTOS ORDENADOS ALFABETICAMENTE");
					Collections.sort(personas);
					
					for(int i=0; i<personas.size(); i++) {
						p5 = (Persona)personas.get(i);
						if(faux.exists()) {
							ClaseOutput co = new ClaseOutput(new FileOutputStream(faux, true));
							p5 = new Persona(p5.getNombre(), p5.getApellidos(), p5.getTelefono(), p5.getEmail());
							co.writeObject(p5);
							co.close();
						}
						else {
							ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(NOM_FICH_AUX));
							p5 = new Persona(p5.getNombre(), p5.getApellidos(), p5.getTelefono(), p5.getEmail());
							oos.writeObject(p5);
							oos.close();
						}
					}
				} catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog(null, "No hay ningun contacto en la agenda");
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "FIN DE AGENDA");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				f.delete();
				faux.renameTo(f);
				break;
			case 6:
				try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(NOM_FICH))){
					Persona p6;
					while(true) {
						p6 = (Persona)ois.readObject();
						JOptionPane.showMessageDialog(null, p6.toString());
					}
				} catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog(null, "No hay ningun contacto en la agenda");
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "FIN DE AGENDA");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}

				break;
			case 7:
				try {
					FileReader entrada = new FileReader(NOM_FICH_ELIM);
					String cadena = "";
					int cod;
					do {
						do{
							cod = entrada.read();
							char letra = (char) cod;
							if(cod!=10){
								cadena = cadena + letra;
							}
							if(cod==-1) {
								cadena = "FIN ELIMINADOS";
							}
						}while(cod!=10 && cod!=-1);
						JOptionPane.showMessageDialog(null, cadena);
						if(cod!=-1) {
							cadena = "";
						}
					}while(cod!=-1);
					entrada.close();

				}catch(IOException e){
					JOptionPane.showMessageDialog(null, "No hay ningun contacto eliminado");
				}
				repetir = false;
				JOptionPane.showMessageDialog(null, "Gracias por utilizar este servicio");
				break;
			}
		}while(repetir);



	}

}
