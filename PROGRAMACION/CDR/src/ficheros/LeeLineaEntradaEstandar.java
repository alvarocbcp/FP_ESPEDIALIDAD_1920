// Salto de línea en MAC y LINUX \n
// Salto de línea en WINDOWS \r\n
//
package ficheros;

import java.io.IOException;

//Ejemplo de lectura de líneas entrada estándar carácter a carácter
//hasta completar una línea.  
class LeeLineaEntradaEstandar {
public static void main( String args[] ) {
	int c;
	int contador = 0;
	try {
		//Se lee de la entrada estándar hasta encontrar el carácter de fin de línea
		// En ese momento termina el programa
		/*while( (c = System.in.read() ) != '\n' )
		{
			contador++;
			System.out.print( (char) c );
		}
		*/
		// Así leemos hasta introducir el caracter de fin de fichero (se detecta cuando 
		// el usuario hace Ctrl+Z)
		while( (c = System.in.read() ) != -1 )
		{
			contador++;
			System.out.print( contador + " " );
			System.out.print( (char) c );
		}
		
		System.out.println(); // Se escribe el fin de linea
		System.err.println( "Contados "+ contador +" bytes en total." );
	}
	catch (IOException e){
		System.out.println(e);
	}
	
	}	
}