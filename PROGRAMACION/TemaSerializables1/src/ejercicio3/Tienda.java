package ejercicio3;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.*;

public class Tienda {
	final static String NOM_FICH="productos.dat", NOM_FICH_VEND="vendidos.txt";
	public static void main(String[] args) {
		File f = new File(NOM_FICH);
		File fvend = new File(NOM_FICH_VEND);
		int opcion;
		boolean repetir = true;
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		
		AccesoDatos.serializarProductos(conexion, f);
		JOptionPane.showMessageDialog(null, "Productos serializados correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
		Metodos.productosArrayList(f, productos);
		JOptionPane.showMessageDialog(null, "Productos añadidos al ArrayList", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
		
		do {
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce una opcion:"
						+ "\n1. Compra de producto."
						+ "\n2. Añadir mas cantidad de un producto."
						+ "\n3. Ver informacion de un producto."
						+ "\n4. Salir del programa.", "OPCION", JOptionPane.QUESTION_MESSAGE));
			}while(opcion<1 || opcion>7);
			
			switch(opcion) {
			case 1:
					Metodos.comprarProducto(productos, fvend);
					AccesoDatos.actualizarBase(conexion, productos);
				break;
			case 2:
					Metodos.añadirCantidad(productos);
					AccesoDatos.actualizarBase(conexion, productos);
				break;
			case 3:
				Metodos.mostrarProducto(productos);
				break;
			case 4:
				repetir = false;
				break;
			}
		}while(repetir);
		
		Conexion.desConexion(conexion);

	}

}
