package ejercicicio;

import java.sql.Connection;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Empresa {

	public static void main(String[] args) {
		
		// a. Realiza la conexion a la base de datos usando el metodo conexion de la clase Conexion que recoge por parametro
		// las constantes de la clase ConstantesBD
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
		
		
		// b. Realiza la insercion de un departamento pasandole los datos por parametro al metodo insertarDepto de la clase
		//AccesoDatos
		AccesoDatos.insertarDepto(conexion, 50, "PROGRAMACION", "MADRID");
		
		// c. Realiza la insercion de un departamento pasandole un Objeto de tipo Departamento por parametro al metodo insertarDepto
		// de la clase AccesoDatos
		Departamento dp1 = new Departamento(60, "VIBRADORES", "VALDEMORO");
		AccesoDatos.insertarDepto(conexion, dp1);
		
		// d. Guarda todos los departamentos existentes de la base de datos en un ArrayList.
		ArrayList<Departamento> departamentos = AccesoDatos.listarDepartamento(conexion);
		for(int i=0; i<departamentos.size(); i++) {
			JOptionPane.showMessageDialog(null, departamentos.get(i).toString());
		}
		
		// e. Borra un departamento de la base de datos dandole el codigo del departamento por parametro utiliazando el metodo borrarDepartamento
		// de la clase AccesoDatos
		AccesoDatos.borrarDepartamento(conexion, 60);
		
		// f. Actualiza la localidad de un departamento pasandole por parametro el numero del departamento y la localidad que se desea poner
		// al metodo actualizarDepartamento de la clase AccesoDatos
		AccesoDatos.actualizarDepartamento(conexion, 50, "VALENCIA");
		
		// g.
		Departamento dp2 = new Departamento(50, "DESARROLLO", "GALICIA");
		AccesoDatos.actualizarDepartamento(conexion, dp2);
		
		// h. 
		Departamento dp3 = AccesoDatos.devolverDepartamento(conexion, 50);
		JOptionPane.showMessageDialog(null, dp3.toString());
		
		// i.
		AccesoDatos.subirSalario(conexion, 500.50, 20);
		
		// j. 
		

	}

}
