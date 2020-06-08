package ejercicio3;

import java.io.File;
import java.sql.Connection;

public class Main {

	final static String F_ALUMNOS = "ObjetosPorApariciones.obj";

	public static void main(String[] args) {
		Connection conexion = null;

		conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		//if (!AccesoDatos.existeBD(ConstantesBD.BD, conexion)) { //No vale create if not exists
			
			// AccesoDatos.mostrarFichero(F_ALUMNOS);
			// No puntúa, es interna para comprobar y ya se puntuó en el ejercicio anterior.

			/************************************************************************************/

			System.out.println("\nVamos a crear la tabla Alumnos\n");
			AccesoDatos.crearAlumnos(ConstantesBD.NOMBRE_TABLA, conexion); 
			System.out.println("\nSe ha creado la tabla Alumnos\n");

			System.out.println("\nVamos a insertar en la tabla Alumnos los objetos del fichero\n");
			AccesoDatos.insertarAlumnos(F_ALUMNOS, conexion);  															
			System.out.println("\nSe ha insertado en la tabla Alumnos\n");

			System.out.println("\nMostramos los alumnos de la tabla Alumnos\n");
			AccesoDatos.listarAlumnos(conexion); // Muestra los alumnos que tenemos en la base de datos 
			
			System.out.println("\nActualizamos el nombre de un objeto, primer parametro,  con otro dado como segundo parametro.\n");

			AccesoDatos.actualizarAlumno(" ", " ", conexion);
         
			System.out.println("\nMostramos los alumnos de la tabla Alumnos cambiados\n");
			AccesoDatos.listarAlumnos(conexion); // Muestra los alumnos que tenemos en la base de datos 
					
			System.out.println("\nBorramos un alumno"); 
			AccesoDatos.borrarAlumno("", conexion);
	         
			System.out.println("\nMostramos los alumnos de la tabla Alumnos cambiados\n");
			AccesoDatos.listarAlumnos(conexion); // Muestra los alumnos que tenemos en la base de datos 
			
		/*} else
			System.out.println("La base de datos " + ConstantesBD.BD + " ya está creada.");*/
			
		Conexion.desConexion(conexion);
	}

}
