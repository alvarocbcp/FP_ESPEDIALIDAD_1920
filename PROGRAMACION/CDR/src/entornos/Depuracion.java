package entornos;

public class Depuracion 
{
	
	public static void main(String[] args) 
	{
		
		System.out.println("Ejemplo de depuraci�n");
		System.out.println("1) A�adir puntos de ruptura en nuestro c�digo");
		System.out.println("�C�mo?");
		System.out.println("<- En la parte izquierda de nuestra pantalla");
		System.out.println("<- Tenemos el n� de l�nea en el que nos encontramos");
		System.out.println("<- En la parte izquierda de nuestra pantalla\n");
		System.out.println("Hacemos click con el bot�n derecho y a�adimos un breackpoint");
		System.out.println("Ready to rumble? :)");
		
		int a;
		int b;//No podemos a�adir puntos de ruptura en aquellas zonas de declaraci�n o definiciones.
		
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
