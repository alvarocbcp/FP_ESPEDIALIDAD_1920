package PrimeraEvaluacion;

import java.util.Scanner;

public class ArrayChar {

	public static void main(String[] args) {
		int n;
		n=5;
		
		char[] vocales = {'a', 'e', 'i', 'o', 'u'};
		
		System.out.println("\nARRAY CON VOCALES\n");
		System.out.println(vocales);
		
		//Asi se escribe la direccion del array:
		System.out.println("\nARRAY CONVERTIDO EN STRING\n");
		System.out.println("Vocales " + vocales);
		System.out.println("Vocales " + vocales.toString());
		
		char[] array1 = new char[n];
		System.out.println("\nARRAY SIN INICIALIZAR\n");
		System.out.println(array1);
		
		//Observamos como se introducen espacios en blanco
		array1[0] = 'm';
		array1[2] = 'n';
		System.out.println("\nARRAY CON ALGUNOS VALORES\n");
		System.out.println("array " + array1);
		System.out.println(array1);
		
		System.out.println("\nARRAY CON ALGUNOS VALORES ESCRITO USANDO FUNCION\n");
		escribir(array1);
		
		//Creamos un String
		String s = "Ordenador";
		
		System.out.println("\nARRAY DE CHAR A PARTIR DE UNA CADENA\n");
		char[] nuevo = s.toCharArray();
		
		System.out.println("\nCADENA A PARTIR DE UN ARRAY DE CHAR\n");
		//Convierte un array de char en una cadena
		s = new String(vocales);
		
		//Nuevo sigue teniendo sus datos
		System.out.println("*****");
		System.out.println(nuevo);
		System.out.println(s);
		System.out.println("*****");
		
		System.out.println("\nULTIMO CARACTER DE UNA CADENA\n");
		//Imprimo el ultimo caracter
		System.out.println("Ultimo caracter: " + s.charAt(s.length()-1));
		
		
		int i = 0;
	
		System.out.println("\nELIMINAMOS EL ULTIMO CARACTER DE UN ARRAY\n");
		
		//String prueba = "prueba"; System.out.println(prueba.replace('u', 'b'));
		s = s.replace(s.charAt(s.length()-1), '\0');
		
		//s contiene las vocales, pero hemos borrado la última
		//Lo imprimimos caracter a caracter
		while(s.charAt(i)!= '\0') {
			System.out.println(s.charAt(i));
			i++;
		}
		
		System.out.println();
		//nuevo contiene ordenador
		//Hacemos lo mismo, aunque en este caso es un String
		//internamente es un array de char
		nuevo[nuevo.length-1]='\0';
		i=0;
		while (nuevo[i]!='\0') {
			System.out.println(nuevo[i]);
			i++;
		}
		System.out.println();
		
		String linea = "Hola que tal";
		
		char[] lineaChar = linea.toCharArray();
		
		for (int j=0; j<lineaChar.length; j++) {
			System.out.print(lineaChar[j]);
			if (lineaChar[j] == ' ') {
				System.out.println();
			}
			
		}
		
		//rellenar(nuevo, teclado);
		//escribir(nuevo);
		
		
		
	}
	
	static void rellenar(char[] a, Scanner sc) {
		for(int i=0; i<a.length; i++) {
			System.out.print("Introducir valor del array: ");
			a[i] = (sc.next().charAt(0));
		}
	}
	
	static void escribir(char[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

}
