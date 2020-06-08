package america;

import java.sql.*;
import javax.swing.JOptionPane;

public class AccesoBD {

	public static void borrarPersonasPaises(Connection con) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}

		try (Statement st = con.createStatement()){
			st.execute("drop table if exists PersonasPaises");
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}

	public static void crearPersonasPaises(Connection con) {
		if(con == null) {
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}

		try (Statement st = con.createStatement()){
			st.execute("CREATE TABLE " + " PersonasPaises(ID INT PRIMARY KEY, NOMBRE varchar(15), APELLIDO varchar(15),"
					+ " EDAD INT, NOMBREPAIS varchar(15), TAMANIO varchar(15)) "
					+ "SELECT PERSONAS.ID, PERSONAS.NOMBRE NOMBRE, PERSONAS.APELLIDO, EDAD, PAISES.NOMBRE "
					+ "NOMBREPAIS, TAMANIO FROM PERSONAS, PAISES WHERE PAISES.ID=PERSONAS.PAIS");
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public static void actualizarPersonasPaises(Connection con) {
		if(con == null) {
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}

		try (PreparedStatement ps1 = con.prepareStatement("UPDATE PERSONASPAISES SET EDAD = (EDAD + 1) WHERE NOMBREPAIS = ?")){
			ps1.setString(1, "Costa Rica");
			ps1.executeUpdate();

		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public static void imprimirPersonasPaises(Connection con) {
		if(con == null) {
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}

		try(Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT RPAD(ID, 15, ' '), RPAD(NOMBRE, 15, ' '), RPAD(APELLIDO, 15, ' '), "
						+ "RPAD(EDAD, 15, ' '), RPAD(NOMBREPAIS, 15, ' '), RPAD(TAMANIO, 15, ' ') FROM PERSONASPAISES ")){
			System.out.println("ID\t       NOMBRE\t      APELLIDO\t     EDAD\t    NOMBRE PAIS\t   TAMAÑO\n");
			while(rs.next()) {
				System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getString(5) + rs.getString(6));
			}
			rs.close();
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

}