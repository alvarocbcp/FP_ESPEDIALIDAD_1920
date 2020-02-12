package PrimeraEvaluacion;

import java.util.Scanner;

public class ArraysEjemplos {
	
	static void Ejemplo() {
		Scanner sc= new Scanner(System.in); 
		int numAlum, i; 
		double suma = 0, media; 
		
		do {
			System.out.println("Numero de alumnos de la clase: ");
			numAlum = sc.nextInt();
		}while(numAlum <= 0);
		
		double[] notas = new double[numAlum];
		
		for(i=0; i<notas.length; i++) {
			System.out.println("Alumno " + (i+1) + " Nota final:");
			notas[i] = sc.nextDouble();
		}
		sc.close();
		
		for(i=0; i<notas.length;i++) {
			suma = suma + notas[i];
		}
		
		media = suma / notas.length;
		
		System.out.printf("Nota media del curso: %2f %n", media);
		System.out.println("Listado de notas superiores a la media: ");
		for(i=0; i<notas.length; i++) {
			if(notas[i] > media) {
				System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);
			}
		}
	}
	
	static void escribirArray(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static int[] duplicarArray(int[] a) {
		int[] array2 = new int[a.length];
		
		for (int i=0; i<array2.length; i++) {
			array2[i] = a[i] * 2;
		}
		return array2;
	}

	public static void main(String[] args) {
		
		int[] array = {9, 4};
		System.out.println("Valores del array antes: ");
		escribirArray(array);
		System.out.println();
		System.out.println("Valores del array después: ");
		escribirArray(duplicarArray(array));
		
		

	}

}
