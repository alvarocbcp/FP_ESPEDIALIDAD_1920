package enumPrecio1;

// Aqui el enum funciona como un listado de constantes
public enum Precio {
	BARATO, MEDIO, CARO;

	public String toString() {
		return "soy un poco " + super.toString();
	}
}
