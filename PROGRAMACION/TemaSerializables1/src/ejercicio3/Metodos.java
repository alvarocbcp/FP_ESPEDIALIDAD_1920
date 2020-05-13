package ejercicio3;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Metodos {

	public static void agregarProducto(Producto p, File f) {
		try {
			if(f.exists()) {
				ClaseOutput co = new ClaseOutput(new FileOutputStream(f, true));
				co.writeObject(p);
				co.close();
			}
			else {
				ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(p);
				oos.close();
			}

		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public static void productosArrayList(File f, ArrayList<Producto> productos) {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));) {
			Producto p;
			while(true) {
				p = (Producto)ois.readObject();
				productos.add(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "HAS LLEGADO AL FIN DEL FICHERO", "EXCEPTION", JOptionPane.WARNING_MESSAGE);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void comprarProducto(ArrayList<Producto> productos, File fvend) {
		int cantidad;
		int codigo;
		JOptionPane.showMessageDialog(null, "LISTA DE PRODUCTOS", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
		for(int i = 0; i<productos.size(); i++) {
			if(productos.get(i).getCantidad()>0){
				JOptionPane.showMessageDialog(null, productos.get(i).toString(), "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el codigo del producto a comprar", "COMPRA", JOptionPane.QUESTION_MESSAGE));
		for(int i = 0; i<productos.size(); i++) {
			if(codigo == productos.get(i).getCodigo()) {
				cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que cantidad del producto desea comprar?", "COMPRA", JOptionPane.QUESTION_MESSAGE));
				if(cantidad>productos.get(i).getCantidad()) {
					do{
						cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "No disponemos de esa cantidad en stock.\nIntroduce una cantidad inferior a " + (productos.get(i).getCantidad() + 1) + " del producto", "COMPRA", JOptionPane.WARNING_MESSAGE));
					}while(cantidad>productos.get(i).getCantidad());
				}
				productos.get(i).setCantidad(productos.get(i).getCantidad() - cantidad);
				JOptionPane.showMessageDialog(null, "Compra realizada con exito", "COMPRA", JOptionPane.INFORMATION_MESSAGE);
				try {
					FileWriter escribir = new FileWriter(fvend, true);
					escribir.write("CODIGO: " + productos.get(i).getCodigo() + ".\n");
					escribir.write("NOMBRE: " + productos.get(i).getNombre() + ".\n");
					escribir.write("CANTIDAD: " + productos.get(i).getCantidad() + ".\n");
					escribir.write("PRECIO: " + productos.get(i).getPrecio() + "€.\n");
					escribir.write("-----------------------------------------------------\n");
					escribir.close();
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "ERROR AL ESCRIBIR", "EXCEPTION", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
	}
	
	public static void añadirCantidad(ArrayList<Producto> productos) {
		int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el codigo del articulo.", "AÑADIR PRODUCTO", JOptionPane.QUESTION_MESSAGE));
		int cantidad;
		for(int i=0; i<productos.size(); i++) {
			if(productos.get(i).getCodigo() == codigo) {
				cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad que desea añadir.", "AÑADIR CANTIDAD", JOptionPane.QUESTION_MESSAGE));
				productos.get(i).setCantidad(cantidad + productos.get(i).getCantidad());
				JOptionPane.showMessageDialog(null, "Cantidad actualizada del producto.", "CANTIDAD AÑADIDA", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	public static void mostrarProducto(ArrayList<Producto> productos) {
		int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el codigo del articulo.", "AÑADIR PRODUCTO", JOptionPane.QUESTION_MESSAGE));
		for(int i=0; i<productos.size(); i++) {
			if(codigo == productos.get(i).getCodigo()) {
				JOptionPane.showMessageDialog(null, productos.get(i).toString(), "INFORMACION DEL PRODUCTO", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}
