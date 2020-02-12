package entornos;

public class MainDebug {
	
	public static void main(String[] args) {
		
	
		
		System.out.println("Ejemplo de depuración");
		System.out.println("1) Añadir puntos de ruptura en nuestro código");
		System.out.println("¿Cómo?");
		System.out.println("<- En la parte izquierda de nuestra pantalla");
		System.out.println("<- Tenemos el nº de línea en el que nos encontramos");
		System.out.println("<- En la parte izquierda de nuestra pantalla\n");
		System.out.println("Hacemos click con el botón derecho y añadimos un breackpoint");
		
		int a;
		int b; //no podemos añadir puntos de ruptura en aquellas zonas de declaracion o definicion.
		
		a = 5;
		b = 6;
		if( a < b )
			System.out.println(a + " es mayor que " + b);
		else
			System.out.println(b + " es mayor que " + a);
		int i = 0;
//		do
//		{
//		System.out.println(i);
//		++i;//i++;
//		}while (i >0);
		DepurarMola o1 = new DepurarMola();
		o1.mostrarInf();
	}
	

}