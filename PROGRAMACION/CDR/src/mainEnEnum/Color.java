package mainEnEnum;

//Un programa Java para demostrar que podemos tener
//main() dentro de enum
enum Color {
	ROJO, VERDE, AZUL;

	// Método
	public static void main(String[] args) {
		//Color c1 = Color.ROJO;
		// Al estar en la enumeración, se puede omitir el nombre de la enum: Color
		Color c1 = ROJO;
		System.out.println(c1);

		Color c2 = VERDE; // Estamos en la misma clase
		System.out.println(c2);

	}
}
