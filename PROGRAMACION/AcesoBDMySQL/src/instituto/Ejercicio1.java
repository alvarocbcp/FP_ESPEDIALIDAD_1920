package instituto;

import java.sql.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		ResultSet rs = null;
		String conn = "jdbc:mysql://localhost/Instituto";
		String usuario = "root";
		
		try {
			Connection conexion=null;
			
			
			conexion=DriverManager.getConnection (conn, usuario, "");
			if (conexion != null) System.out.println("Conexión realizada");
			System.out.println();
			
			Statement st1 = conexion.createStatement();
			Statement st2 = conexion.createStatement();
			
			st1.execute("drop table if exists NotasFinales");
			st1.execute("create table NotasFinales(Mat varchar(100), Cod int(2), NotaMedia float(2,1), primary key(Mat,Cod))");
			
			rs = st1.executeQuery("select * from notas");
			
			double nm;
			while(rs.next()) {
				nm = (rs.getInt(3) + rs.getInt(4) + rs.getInt(5))/3.0;	//Calculo de la media.
				st2.executeUpdate("insert into notasfinales values('" + rs.getString(1) + "'," + rs.getInt(2) + "," + nm + ")");
			}
			
			//rs.beforeFirst(); //Volvemos al principio del listado de notas
			rs.close();
			rs = st1.executeQuery("select * from notas");
			//Imprimimos el listado de Notas:
			System.out.println("Alumno\t\tAsignaturas\tNota1\tNota2\tNota3");
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t\t " + rs.getString(2) + "\t " + rs.getString(3) + "\t " + rs.getString(4) + "\t" + rs.getString(5));
			}
			
			System.out.println();
			
			rs.close();
			
			rs = st1.executeQuery("select rpad(apel_nom, 25, ' '), rpad(nombre, 25, ' '), nota1, nota2, nota3, notamedia from alumnos, asignaturas, notas, notasfinales "
					+ "where alumnos.mat=notas.mat and asignaturas.cod=notas.cod and "
					+ "alumnos.mat=notasFinales.mat and asignaturas.cod=notasFinales.cod");
			
			System.out.println("Nombre Alumno \t\tNombre Asignatura \tNota1 \tNota2 \tNota3 \tNota Media ");
			while(rs.next()) {
				System.out.println(rs.getString(1) + rs.getString(2) + rs.getInt(3) + "\t " + rs.getInt(4) + "\t " + rs.getInt(5) + "\t " + rs.getDouble(6));
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if(rs!= null) {
					rs.close();
				}
			}catch(Exception e){
				System.out.println(e);
			}
		}

	}

}
