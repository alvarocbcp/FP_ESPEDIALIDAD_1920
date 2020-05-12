package enumPrecio2;

//Aqui el enum ya tiene asignados dos atributos: los valores minimo y maximo

public enum Precio {
	
	// El constructor debe ser obligatoriamente privado, si no, da error al
	// compilar. Esto quiere decir que no podremos hacer directamente un new de este
	// enum y debemos usar siempre las etiquetas CARO, BARATO y MEDIO definidas.
	// Las etiquetas llevan detrás, entre paréntesis, los parámetros que pasamos al
	// constructor para cada una de ellas. De esta forma, quedan fijados los precios
	// mínimo y máximo para cada una de ellas.
	
	CARO(100, 1000), MEDIO(10, 100), BARATO(0, 10);

	private int precioMinimo;
	private int precioMaximo;

	private Precio(int minimo, int maximo) {
		precioMinimo = minimo;
		precioMaximo = maximo;
	}

	public int getPrecioMaximo() {
		return precioMaximo;
	}

	public int getPrecioMinimo() {
		return precioMinimo;
	}
}
