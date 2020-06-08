package gourmet;

import java.io.*;
import java.sql.*;



public class AccesoBD {

	public static void volcarEnFichero(String FICH_PROD) {
		// 1. CREO EL FICHERO BINARIO
		File fprod = new File(FICH_PROD);

		try {
			if(fprod.createNewFile()) {
				System.out.println("El fichero ha sido creado.");
			}
			else {
				System.out.println("El fichero ya existe.");
			}
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}

		// 2. ME CONECTO A LA BASE DE DATOS
		Connection con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		// 3. SERIALIZAMOS LOS PRODUCTOS DE LA BSE DE DATOS
		try (PreparedStatement ps = con.prepareStatement("SELECT * FROM PRODUCTOS");
				ResultSet rs = ps.executeQuery()){
			Producto p1;
			int comp=-7;
			while(rs.next()) {
				p1 = new Producto(rs.getInt(1), rs.getString(2), rs.getInt(3));

				try {
					ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fprod));
					try {
						Producto p2;
						while(true){
							p2 = (Producto)ois.readObject();
							String num1 = Integer.toString(p1.getNumProducto());
							String num2 = Integer.toString(p2.getNumProducto());
							comp = num1.compareTo(num2);
						}
					}catch(ClassNotFoundException e) {
						e.printStackTrace();
					}
					ois.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
				// No se porque no me coge el valor de la variable comp generada en el bucle de lectura de fichero
				if(comp!=0) {
					if(fprod.exists()) {
						ClaseOutput co = new ClaseOutput(new FileOutputStream(fprod, true));
						co.writeObject(p1);
						co.close();
					}
					else {
						ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fprod));
						oos.writeObject(p1);
						oos.close();
					}
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 4. ME DESCONECTO DE LA BASE DE DATOS

		Conexion.desConexion(con);


	}


	public static void crearHistoricoConBorrados(int numProd, String FICH_BORR) throws NoEnTablaException{

		// 1. CREO EL FICHERO BORRADOS:TXT
		File fborr = new File(FICH_BORR);

		try {
			if(fborr.createNewFile()) {
				System.out.println("El fichero ha sido creado.");
			}
			else {
				System.out.println("El fichero ya existe.");
			}
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}

		// 2. ME CONECTO A LA BASE DE DATOS
		Connection con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		// 3. BORRADO DE LA TABLA E INSERCION EN TXT
		//No se que me da fallo pero no me ejecuta nada, eclipse me dice el driver pero esta bien instalado
		try (PreparedStatement ps1 = con.prepareStatement("DELETE FROM " + ConstantesBD.NOMBRE_TABLA + " WHERE numProducto = ?");
				PreparedStatement ps2 = con.prepareStatement("SELECT * FORM " + ConstantesBD.NOMBRE_TABLA + " WHERE numProducto = ?");
				PreparedStatement ps3 = con.prepareStatement("SELECT * FROM " + ConstantesBD.NOMBRE_TABLA);
				ResultSet rs2 = ps2.executeQuery();
				ResultSet rs3 = ps3.executeQuery()){
			String numStr = Integer.toString(numProd);
			String nombre="hola";
			int comp=0;
			while(rs3.next()) {
				comp = numStr.compareTo(Integer.toString(rs3.getInt(1)));
			}
			rs3.close();
			ps2.setInt(1, numProd);
			nombre = rs2.getString(2);
			rs2.close();
			ps1.setInt(1, numProd);
			ps1.executeUpdate();
			if(comp==0) {
				FileWriter escribir = new FileWriter(fborr, true);

				escribir.write(nombre + "\n");

				escribir.close();
			}

			else {
				throw new NoEnTablaException("No existe el producto en la tabla");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 4. DESCONEXION DE LA BASE DE DATOS
		Conexion.desConexion(con);

	}

}
