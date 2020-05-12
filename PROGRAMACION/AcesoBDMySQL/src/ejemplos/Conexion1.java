package ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion1 {
	public static void main(String args[]){
		try {
			//Cargamos la clase como driver
			//Se carga manualmente la clase como driver antes del jdk 7
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			//Class.forName("com.mysql.jdbc.Driver");

			Connection conexion=null;

			//conexion=DriverManager.getConnection ("jdbc:mysql://localhost/Prueba","root","");
			conexion=DriverManager.getConnection ("jdbc:mysql://localhost/Prueba?useUnicode=true&use"+
					"JDBCCompliantTimezoneShift&useLegacyDatetimeCode=false&ServerTimezone=UTC","root","");


			if (conexion != null) {
				System.out.println("Conexión realizada");
			}

			conexion.close();

		} /*catch(ClassNotFoundException e) {
    System.out.println(e);
 }*/catch(SQLException e) {
	 System.out.println(e);
 } catch(Exception e) {
	 System.out.println(e);
 }
	}
}
