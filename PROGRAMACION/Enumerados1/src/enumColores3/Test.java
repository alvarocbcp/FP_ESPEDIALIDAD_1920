package enumColores3;

//Programa Java para demostrar que los enum pueden tener 
//Constructores y métodos concretos.

//Una enumeración (Note la palabra enum en lugar de class)
enum Color {
	ROJO, VERDE, AZUL;

	// enum constructor llamado por separado para cada constante cuando se crea 
	// una variable de tipo enum Color. Observad la ejecución
	private Color() {
		System.out.println("Constructor llamado para : " + this);
	}

	// Solo métodos concretos (no abstractos) permitidos
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
		
		System.out.println("Ahora le asignamos el objeto rojo de la enumeración");
		c1 = Color.ROJO; // Aquí le asignamos el objeto rojo de la enumeración
		 
		System.out.println();
		
		System.out.println(c1);
		
		System.out.println();
		
		c1.colorInfo(); // Ejecuta el metodo concreto
	}
}
