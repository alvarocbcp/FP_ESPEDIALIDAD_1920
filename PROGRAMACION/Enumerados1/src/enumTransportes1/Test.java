package enumTransportes1;

public class Test {
	// El m�todo
	public static void main(String[] args) {
		Transporte tp = Transporte.AVION;

		// Uso de enum para controlar una sentencia switch

		// se utiliza CAMION, no Transporte.CAMION. Esto se debe a que el tipo de
		// enumeraci�n en la expresi�n de switch ya ha especificado impl�citamente el
		// tipo de enumeraci�n de las constantes de case.
		switch (tp) {
			// case Transporte.COCHE: da error
			case COCHE:
				//
			case CAMION:
				//
			case TREN:
				//
			case BARCO:
				//
			case AVION:
				System.out.println("Es un avion");
			}

	}
}