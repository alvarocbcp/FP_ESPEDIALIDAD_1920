package enumTransportes1;

public class Test {
	// El método
	public static void main(String[] args) {
		Transporte tp = Transporte.AVION;

		// Uso de enum para controlar una sentencia switch

		// se utiliza CAMION, no Transporte.CAMION. Esto se debe a que el tipo de
		// enumeración en la expresión de switch ya ha especificado implícitamente el
		// tipo de enumeración de las constantes de case.
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