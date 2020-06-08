package ejercicicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

	public static Connection conexion(String url, String user, String pass) {
		try {
			Connection conexion = DriverManager.getConnection(url, user, "");
			JOptionPane.showMessageDialog(null, "Conexion realizada");
			return conexion;
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return null;
	}

	public static void desConexion(Connection con)
	{
		try {
			if(con != null)
			{
				JOptionPane.showMessageDialog(null, "DESCONECTANDO...", "Estado Conexion", JOptionPane.INFORMATION_MESSAGE);
				con.close();
			}

		}catch(SQLException e) {

			JOptionPane.showMessageDialog(null, e);

		}catch(Exception e) {

			JOptionPane.showMessageDialog(null, e);

		}
	}
}
