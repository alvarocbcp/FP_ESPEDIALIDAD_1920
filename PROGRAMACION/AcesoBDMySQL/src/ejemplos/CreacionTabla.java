package ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreacionTabla {
	public static void main(String args[]) {
		try {
			String url = "jdbc:mysql://localhost/Prueba";
			// Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = null;

			conexion = DriverManager.getConnection(url, "root", "");

			if (conexion != null)
				System.out.println("Conexión realizada");

			// Tiene que estar creada ya la conexión para crear sentencia

			Statement st = conexion.createStatement();

			st.execute("create table datos(descripcion varchar(100), primary key(descripcion))");

			if (conexion != null)
				conexion.close();

		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}