package PrimeraEvaluacion;

import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int [][] m = new int [5][4];
		
		rellenaMatriz(m, sc);
		muestraMatriz(m);
		calculaMayor(m);
		calculaMenor(m);

	}

	public static int[][] rellenaMatriz(int[][] m, Scanner sc) {
		for(int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				System.out.println(i + "x" + j + ":");
				m[i][j] = sc.nextInt();
			}
		}
		return m;
	}

	public static void muestraMatriz(int[][] m) {
		System.out.println("La matriz es: ");

		for(int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				System.out.printf("%-5s", m[i][j]);
			}
			System.out.println();
		}
	}

	public static void calculaMayor(int[][] m) {
		int mayor = m[0][0];
		int posMayori = m[0][0];
		int posMayorj = m[0][0];

		for(int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				if (m[i][j] > mayor) {
					mayor = m[i][j];
					posMayori = i;
					posMayorj = j;
				}
			}
		}
		System.out.println("Mayor número de la matriz: " + mayor + " Posición: " + (posMayori+1) + "x" + (posMayorj+1));
	}

	public static void calculaMenor(int[][] m) {
		int menor = m[0][0];
		int posMenori = m[0][0];
		int posMenorj = m[0][0];
		
		for(int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				if (m[i][j] < menor) {
					menor = m[i][j];
					posMenori = i;
					posMenorj = j;
				}
			}
		}
		System.out.println("Menor número de la matriz: " + menor + " Posición: " + (posMenori+1) + "x" + (posMenorj+1));
	}

}
