package institutoMejor;

import java.sql.*;

public class Instituto {

	public static void main(String[] args) {
		
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		
		AccesoDatos.borrarNotasFinales(conexion);
		
		AccesoDatos.crearNotasFinales(conexion);
		
		AccesoDatos.rellenarNotasFinales(conexion);
		
		System.out.println("\n");
		
		AccesoDatos.imprimirNotasFinales(conexion);
		
		System.out.println("\n");
		
		Conexion.desConexion(conexion);

	}

}
