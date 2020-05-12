package ejercicio2;

import java.io.*;
import javax.swing.*;

public class PruebaCliente {
	final static String NOM_FICH="clientes.dat", NOM_FICH_AUX="auxiliar.dat";
	public static void main(String[] args) {
		File f = new File(NOM_FICH);
		File faux = new File(NOM_FICH_AUX);
		int opcion=0;
		boolean repetir = true;

		do {
			do {
				opcion =Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion:\n"
						+ "1. Añadir cliente.\n"
						+ "2. Listar clientes.\n"
						+ "3. Buscar clientes.\n"
						+ "4. Borrar cliente.\n"
						+ "5. Borrar fichero de clientes.\n"
						+ "6.Salir de la aplicacion."));
			}while(opcion<1 || opcion>6);


			switch(opcion) {
			case 1:
				String NIF = JOptionPane.showInputDialog("Introduce tu NIF", "98563254F");
				String nombre = JOptionPane.showInputDialog("Introduce tu nombre", "Alvaro Cabello");
				String telefono = JOptionPane.showInputDialog("Introduce tu telefono", "654987321");
				String direccion = JOptionPane.showInputDialog("Introduce tu direccion", "C/ Juan de Austria, 22");
				double deuda =Double.parseDouble(JOptionPane.showInputDialog("Introduce tu deuda", "6542.52"));

				Cliente cl1 = new Cliente(NIF, nombre, telefono, direccion, deuda);

				try {
					if(f.exists()) {
						ClaseOutput co = new ClaseOutput(new FileOutputStream(f, true));
						cl1 = new Cliente(NIF, nombre, telefono, direccion, deuda);
						co.writeObject(cl1);
						co.close();
					}
					else {
						ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(NOM_FICH));
						cl1 = new Cliente(NIF, nombre, telefono, direccion, deuda);
						oos.writeObject(cl1);
						oos.close();
					}
				}catch(IOException e) {
					JOptionPane.showMessageDialog(null, e);
				}
				break;
			case 2:
				try {
					ObjectInputStream ois=new ObjectInputStream(new FileInputStream(NOM_FICH));
					try {
						Cliente cl2;
						while(true){
							cl2 = (Cliente)ois.readObject();
							JOptionPane.showMessageDialog(null, cl2.toString(), "Informacion de clientes", JOptionPane.INFORMATION_MESSAGE);
						}
					}catch(ClassNotFoundException e) {
						JOptionPane.showMessageDialog(null, e);
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null, "No hay más clientes");
					}
					ois.close();
				}catch(IOException e) {
					JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo");
				}
				break;
			case 3:
				String NIF3 = JOptionPane.showInputDialog("Introduce el NIF para buscar al cliente.");
				try {
					ObjectInputStream ois=new ObjectInputStream(new FileInputStream(NOM_FICH));
					try {
						Cliente cl3;
						while(true) {
							cl3 = (Cliente)ois.readObject();
							if(cl3.getNIF().equals(NIF3)) {
								JOptionPane.showMessageDialog(null, cl3.toString());
							}
						}
					}catch(IOException e) {
						JOptionPane.showMessageDialog(null, "No se han encontrado más clientes.");
					} catch (ClassNotFoundException e) {
						JOptionPane.showMessageDialog(null, e);
					}
					ois.close();
				}catch(IOException e) {
					JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo");
				}
				break;
			case 4:
				String NIF4 = JOptionPane.showInputDialog("Introduce el NIF para buscar al cliente.");
				try {
					ObjectInputStream ois=new ObjectInputStream(new FileInputStream(NOM_FICH));
					try {
						Cliente cl4;
						while(true) {
							cl4 = (Cliente)ois.readObject();
							if(cl4.getNIF().equals(NIF4)) {
								
							}
							else {
								if(faux.exists()) {
									ClaseOutput co = new ClaseOutput(new FileOutputStream(faux, true));
									cl4 = new Cliente(cl4.getNIF(), cl4.getNombre(), cl4.getTelefono(), cl4.getDireccion(), cl4.getDeuda());
									co.writeObject(cl4);
									co.close();
								}
								else {
									ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(NOM_FICH_AUX));
									cl4 = new Cliente(cl4.getNIF(), cl4.getNombre(), cl4.getTelefono(), cl4.getDireccion(), cl4.getDeuda());
									oos.writeObject(cl4);
									oos.close();
								}
							}
						}
					}catch(IOException e) {
						JOptionPane.showMessageDialog(null, "Cliente eliminado.");
					} catch (ClassNotFoundException e) {
						JOptionPane.showMessageDialog(null, e);
					}
					ois.close();
				}catch(IOException e) {
					JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo");
				}
				f.delete();
				faux.renameTo(f);
				break;
			case 5:
				f.delete();
				JOptionPane.showMessageDialog(null, "Fichero eliminado");
				break;
			case 6:
				repetir = false;
				JOptionPane.showMessageDialog(null, "Gracias por utilizar este servicio");
			}
		}while(repetir);


	}

}