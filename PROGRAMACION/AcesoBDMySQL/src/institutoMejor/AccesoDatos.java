package institutoMejor;

import java.sql.*;
import javax.swing.JOptionPane;

public class AccesoDatos {

	public static void borrarNotasFinales(Connection con) {
		if(con == null) {
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}
		
		try (Statement st = con.createStatement()){
			st.execute("drop table if exists NotasFinales");
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}

	public static void crearNotasFinales(Connection con) {
		if(con == null) {
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}

		try (Statement st = con.createStatement()){
			st.execute("CREATE TABLE NotasFinales (MAT VARCHAR(10), COD INT(2), NOTAMEDIA FLOAT(2,1), PRIMARY KEY(MAT, COD))");
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public static void rellenarNotasFinales(Connection con) {
		if(con == null) {
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}

		try (PreparedStatement ps1 = con.prepareStatement("SELECT * FROM NOTAS");
				PreparedStatement ps2 = con.prepareStatement("INSERT INTO NOTASFINALES VALUES(?, ?, ?)");
				ResultSet rs1 = ps1.executeQuery()){
			double nm;
			while(rs1.next()) {
				nm = (rs1.getInt(3) + rs1.getInt(4) + rs1.getInt(5))/3.0;
				ps2.setString(1, rs1.getString(1));
				ps2.setInt(2, rs1.getInt(2));
				ps2.setDouble(3, nm);
				ps2.executeUpdate();
			}

			//rs1.beforeFirst(); // NO FUNCIONA

			System.out.println("Alumno		\tAsignatura\tNota 1\tNota 2\tNota 3\n");
			while(rs1.next()) {
				System.out.println(rs1.getString(1) + "\t " + rs1.getString(2) + "\t\t " + rs1.getString(3) + "\t " + rs1.getString(4) + "\t " + rs1.getString(5));
			}
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}

	public static void imprimirNotasFinales(Connection con) {
		if(con == null) {
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		}

		try(Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT RPAD(APEL_NOM, 25, ' '), RPAD(NOMBRE, 25, ' '),"
						+ "NOTA1, NOTA2, NOTA3, NOTAMEDIA FROM ALUMNOS, ASIGNATURAS, NOTAS, NOTASFINALES "
						+ "WHERE ALUMNOS.MAT=NOTAS.MAT AND ASIGNATURAS.COD=NOTAS.COD AND "
						+ "ALUMNOS.MAT=NOTASFINALES.MAT AND ASIGNATURAS.COD=NOTASFINALES.COD")){
			System.out.println("Nombre Alumno\t\tNombre Asignatura\tNota 1\tNota 2\tNota 3\t NotaMedia \n");
			while(rs.next()) {
				System.out.println(rs.getString(1) + rs.getString(2) + rs.getInt(3) + "\t " + rs.getInt(4) + "\t " + rs.getInt(5) + "\t " + rs.getDouble(6));
			}
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

}
