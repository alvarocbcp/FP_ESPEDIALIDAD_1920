package america;

import java.sql.Connection;

public class America {

	public static void main(String[] args) {
		
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		
		AccesoBD.borrarPersonasPaises(conexion);
		
		AccesoBD.crearPersonasPaises(conexion);
		
		System.out.println("TABLA PERSONAS PAISES ANTES DE ACTUALIZAR\n");
		
		AccesoBD.imprimirPersonasPaises(conexion);
		
		AccesoBD.actualizarPersonasPaises(conexion);
		
		System.out.println("TABLA PERSONAS PAISES ANTES DE ACTUALIZAR\n");
		
		AccesoBD.imprimirPersonasPaises(conexion);
		
		Conexion.desConexion(conexion);

	}

}
