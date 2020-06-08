package gourmet;

public class Main {
	
	final static String FICH_PROD = "productos.dat", FICH_BORR="borrados.txt";
	public static void main(String[] args) {
		
		AccesoBD.volcarEnFichero(FICH_PROD);
		
		try {
			AccesoBD.crearHistoricoConBorrados(1, FICH_BORR);
		} catch (NoEnTablaException e) {
			e.printStackTrace();
		}

	}

}
