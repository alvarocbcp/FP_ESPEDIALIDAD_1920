package ejercicio3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoDatos {
	
	public static void crearAlumnos(String NOM_TAB, Connection con) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		}
		try (PreparedStatement ps = con.prepareStatement("CREATE TABLE ALUMNOS ("
				+ "NOMBRE VARCHAR(20) PRIMARY KEY,"
				+ "CONTADOR INT)")) {
			//ME DA ERROR AL HACERLO CON ps.setString(1, NOM_TAB);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//Me da error al añadirlos y no veo el fallo, el error me dice que no encuentra el fichero y no se por que(fichero corrupto?)
	public static void insertarAlumnos(String F_ALUMNOS, Connection con) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		}
		try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(F_ALUMNOS))){
			Alumno al;
			PreparedStatement ps = con.prepareStatement("INSERT INTO ALUMNOS VALUES(?, ?)");
			while(true) {
				al = (Alumno)ois.readObject();
				ps.setString(1, al.getNombre());
				ps.setInt(2, al.getContador());
				ps.executeUpdate();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//Al no rellenar la tabla no se imprime nada pero creo que esta correcto
	public static void listarAlumnos(Connection con) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		}
		try (PreparedStatement ps = con.prepareStatement("SELECT * FROM ALUMNOS");
				ResultSet rs = ps.executeQuery()){
			while(rs.next()) {
				System.out.println("Nombre: " + rs.getString(1) + "\nContador: " + rs.getInt(2) + " \n");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Al no tener la tabla rellena no puedo actualizarla pero el metodo seria asi
	public static void actualizarAlumno(String antiguo, String nuevo, Connection con) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		}
		try (PreparedStatement ps = con.prepareStatement("UPDATE ALUMNOS SET NOMBRE = ? WHERE NOMBRE LIKE ?")){
			ps.setString(1, nuevo);
			ps.setString(2, antiguo);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// No se puede eliminar nada porque no hay nada pero el metodo seria asi
	public static void borrarAlumno(String nombre, Connection con) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		}
		try (PreparedStatement ps = con.prepareStatement("DELETE ALUMNOS WHERE NOMBRE = ?")){
			ps.setString(1, nombre);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
