package entornos;

public class Depuracion 
{
	
	public static void main(String[] args) 
	{
		
		System.out.println("Ejemplo de depuración");
		System.out.println("1) Añadir puntos de ruptura en nuestro código");
		System.out.println("¿Cómo?");
		System.out.println("<- En la parte izquierda de nuestra pantalla");
		System.out.println("<- Tenemos el nº de línea en el que nos encontramos");
		System.out.println("<- En la parte izquierda de nuestra pantalla\n");
		System.out.println("Hacemos click con el botón derecho y añadimos un breackpoint");
		System.out.println("Ready to rumble? :)");
		
		int a;
		int b;//No podemos añadir puntos de ruptura en aquellas zonas de declaración o definiciones.
		
		a = 5;
		b = 6;
		
		if (a < b)
			System.out.println(a + " a es mayor que b " + b);
		else
			System.out.println(a + " a es menor que b " + b);
		
		int i = 0;
		
		do
		{
			System.out.println(i);
			++i;//i++;
			
		}while (i <= 0);
		
		
		
	}

}
