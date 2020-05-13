package ejercicio3;

import java.io.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class AccesoDatos {
	
	public static void serializarProductos(Connection con, File f) {
		f.delete();
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}
		
		try (PreparedStatement ps = con.prepareStatement("SELECT * FROM ARTICULOS");
			 ResultSet rs = ps.executeQuery()){
			Producto p1;
			while(rs.next()) {
				p1 = new Producto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
				Metodos.agregarProducto(p1, f);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void actualizarBase(Connection con, ArrayList<Producto> productos) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}
		
		try(PreparedStatement ps = con.prepareStatement("UPDATE ARTICULOS SET CANTIDAD = ? WHERE CLART = ?")) {
			for(int i=0; i<productos.size(); i++) {
				ps.setInt(1, productos.get(i).getCantidad());
				ps.setInt(2, productos.get(i).getCodigo());
				ps.executeUpdate();
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e, "EXCEPTION", JOptionPane.WARNING_MESSAGE);;
		}
	}
}
