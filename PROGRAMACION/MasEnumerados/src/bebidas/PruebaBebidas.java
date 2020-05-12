package bebidas;

//Clase para definir un tipo de bebida
class BebidaCerveza {

	// Solo tenemos estas marcas
	private Bebidas vaso;
	private MarcaCerveza marcaCerveza;

	public BebidaCerveza(MarcaCerveza marcaCerveza, Bebidas vaso) {
		this.marcaCerveza = marcaCerveza;
		this.vaso = vaso;
	}

	public void servir() {
		System.out.println("Sirviendo " + vaso.getCentimetrosCubicos() + "cc de cerveza " + marcaCerveza);
	}

}

public class PruebaBebidas {
	public static void main(String args[]) {
		BebidaCerveza cerveza = new BebidaCerveza(MarcaCerveza.AMBAR, Bebidas.JARRA);
		
		cerveza.servir();
	}
}
