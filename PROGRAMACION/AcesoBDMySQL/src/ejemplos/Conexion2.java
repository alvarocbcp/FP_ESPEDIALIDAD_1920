package ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion2 {
	public static void main(String args[]){
		try {
			//Se carga automáticamente la clase como driver a partir del jdk 7

			Connection conexion=null;
			conexion=DriverManager.getConnection ("jdbc:mysql://localhost/Prueba","root","");
			
			if (conexion != null) {
				System.out.println("Conexión realizada");
			}
			
			conexion.close();

		} catch(SQLException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
