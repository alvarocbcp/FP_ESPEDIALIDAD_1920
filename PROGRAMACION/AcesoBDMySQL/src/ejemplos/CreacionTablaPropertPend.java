package ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreacionTablaPropertPend {
	public static void main(String args[]) {
		//Connection conexion=null;
		//Statement st = null;
		String url = "jdbc:mysql://localhost/Prueba";

		try (Connection conexion = DriverManager.getConnection(url, "root", "");
				Statement st = conexion.createStatement();) {

			// if (conexion != null) System.out.println("Conectados"); Ya no hace falta if
			// null
			System.out.println("Conectados");
			// Tiene que estar creada ya la conexión para crear sentencia

			// Si quiero iniciar todo desde el principio:

			st.execute("drop database prueba");// Habría que hacer varios try..catch si queremos distinguir mensajes
			st.execute("create database prueba");
			st.execute("use prueba");
			st.execute("drop table if exists datos");
			st.execute("create table datos(descripcion varchar(100), primary key(descripcion))");

		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}