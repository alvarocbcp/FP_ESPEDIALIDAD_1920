package alumnos;

import java.io.*;
import java.sql.*;

public class AccesoDatos {

	public static boolean existeBD(String bd, Connection con) {
		boolean existe = false;
		try {
			ResultSet rs = con.getMetaData().getCatalogs();
			PreparedStatement ps = con.prepareStatement("CREATE DATABASE " + bd);
			while(rs.next()) {
				String bdactual = rs.getString(1);
				if(bd.equalsIgnoreCase(bdactual)) {
					existe = true;
				}
			}
			if (!existe) {
				ps.execute();
				con.setCatalog(bd);
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
		return existe;
	}

	public static void mostrarFichero(String fich) {
		try {
			FileInputStream fis = new FileInputStream(fich);
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
				while(true) {
					try {
						System.out.println((Alumno) ois.readObject());
					}catch (ClassNotFoundException e) {
						System.out.println(e);
					}
				}
			}catch (EOFException e) {};
			ois.close();
			fis.close();
		}catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static void crearAlumnos(String nom_tab, Connection con) {
		try {
			PreparedStatement ps = con.prepareStatement("CREATE TABLE IF NOT EXISTS " + nom_tab +
					" (" + "nombreAl varchar(30) PRIMARY KEY,"
					+ "contador int NOT NULL);");
			ps.execute();
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void insertarAlumnos(String falum, Connection con) {
		try{
			PreparedStatement ps = con.prepareStatement("INSERT INTO " + ConstantesBD.NOMBRE_TABLA + " values (?, ? ) ");
			FileInputStream fis = new FileInputStream(falum);
			ObjectInputStream ois = new ObjectInputStream(fis);
					try {
						while(true) {
							Alumno al = (Alumno) ois.readObject();
							ps.setString(1, al.getNombre());
							ps.setInt(2, al.getContador());
							ps.executeUpdate();
						}
					}catch (EOFException e) {}
					ois.close();
					fis.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void listarAlumnos(Connection con) {
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM " + ConstantesBD.NOMBRE_TABLA + ";");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Alumno: " + rs.getString(1) + "\nContador: " + rs.getInt(2));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void actualizarAlumno(String antiguo, String nuevo, Connection con) {
		try {
			PreparedStatement ps = con.prepareStatement("UPDATE " + ConstantesBD.NOMBRE_TABLA + " SET nombreAl = ? "
					+ " WHERE nombreAl LIKE ?;");
			ps.setString(1, nuevo);
			ps.setString(2, antiguo);
			ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void borrarAlumno(String nombre, Connection con) {
		try {
			PreparedStatement ps = con.prepareStatement("DELETE FROM " + ConstantesBD.NOMBRE_TABLA + " WHERE nombreAl LIKE ?");
			ps.setString(1, nombre);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
