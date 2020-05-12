package enumColores3;

//Programa Java para demostrar que los enum pueden tener 
//Constructores y m�todos concretos.

//Una enumeraci�n (Note la palabra enum en lugar de class)
enum Color {
	ROJO, VERDE, AZUL;

	// enum constructor llamado por separado para cada constante cuando se crea 
	// una variable de tipo enum Color. Observad la ejecuci�n
	private Color() {
		System.out.println("Constructor llamado para : " + this);
	}

	// Solo m�todos concretos (no abstractos) permitidos
	public void colorInfo() {
		System.out.println(this + " desde colorInfo()");
	}
}

// Probamos el enumerado creado
public class Test {
	// Metodo
	public static void main(String[] args) {
		Color c1; // Hace que se ejecute el constructor
		
//		Constructor llamado para : ROJO
//		Constructor llamado para : VERDE
//		Constructor llamado para : AZUL
		
		System.out.println("Ahora le asignamos el objeto rojo de la enumeraci�n");
		c1 = Color.ROJO; // Aqu� le asignamos el objeto rojo de la enumeraci�n
		 
		System.out.println();
		
		System.out.println(c1);
		
		System.out.println();
		
		c1.colorInfo(); // Ejecuta el metodo concreto
	}
}
