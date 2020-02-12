package PrimeraEvaluacion;

import java.util.Scanner;

public class EjerciciosArrays2 {
	
	public static void ejercicio1() {
		int[] array = new int[100];
		
		for (int i=0; i<100; i++) {
			array[i] = i+1;
		}
		
		for (int j=99; j>=0; j--) {
			System.out.print(array[j] + " ");
		}
		
	}
	
	public static void ejercicio2(Scanner sc) {
		int[] random = new int[10];
		
		for (int i=0; i<10; i++) {
			random[i] = (int) Math.floor(Math.random()*99)+1;
		}
		
		System.out.print("Introduce una posición: ");
		int posicion = sc.nextInt();
		posicion = posicion - 1;
		
		System.out.println("El número en la posición " + (posicion+1) + " es el " + random[posicion]);
		
	}
	
	public static void ejercicio3(Scanner sc) {
		System.out.println("Introduce la longitud del array: ");
		int longitud = sc.nextInt();
		
		int[] array = new int[longitud];
		
		for(int i=0; i<array.length; i++) {
			array[i] = (int) Math.floor(Math.random()*299)+1;
		}
		
		System.out.println("Introduce el número de finalización: ");
		int last = sc.nextInt();
		int cont=0;
		
		for (int j=0; j<array.length; j++	) {
			if (array[j]%10 == last) {
				cont++;
			}
		}
		
		int[] array2 = new int[cont];
		int pos = 0;
		
		for(int k=0; k<array.length; k++) {
			if(array[k]%10 == last) {
				array2[pos] = array[k];
				pos++;
			}
		}
		
		System.out.println("ARRAY DE ALEATORIOS:");
		escribirArray(array);
		System.out.println("\nARRAY DE LOS NÚMEROS QUE ACABEN EN " + last + ": ");
		escribirArray(array2);
		
		
	}
	
	public static void ejercicio4(Scanner sc) {
		System.out.print("Introduce tu número de DNI: ");
		int dni = sc.nextInt();
		
		int mod = dni%23;
		
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		System.out.println("DNI con letra: " + dni + letras[mod]);
		
	}
	
	public static void ejercicio5(Scanner sc) {
		System.out.print("Introduce el número: ");
		int num = sc.nextInt();
		
		int longitud = cifrasEntero(num);
		
		int[] array = new int[longitud];
		
		
		
		for (int i=0; i<array.length; i++) {
			int colocar = (int) (Math.pow(10, cifrasEntero(num)-1));
			array[i] = (int) (num/colocar);
			num = num-(array[i]*(colocar));
		}
		
		int j=0;
		boolean capicua = true;
		
		while((j < array.length/2) && capicua) {
			if (array[j] != array[array.length - j-1]) {
				capicua = false;
			}
			else {
				capicua=true;
			}
			j++;
		}
		
		if (capicua==true) {
			System.out.println("El número es capicúa.");
		}
		else {
			System.out.println("El número no es capicúa.");
		}
	}
	
	public static void ejercicio6() {
		int[] array = new int[100];
		int cont0=0, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0, cont8=0, cont9=0, cont10=0;
		
		for (int i=0; i<array.length; i++) {
			array[i]= (int) Math.floor(Math.random()*11);
		}
		
		for (int j=0; j<array.length; j++) {
			switch(array[j]) {
			case 0:
				cont0++;
				break;
			case 1:
				cont1++;
				break;
			case 2:
				cont2++;
				break;
			case 3:
				cont3++;
				break;
			case 4:
				cont4++;
				break;
			case 5:
				cont5++;
				break;
			case 6:
				cont6++;
				break;
			case 7:
				cont7++;
				break;
			case 8:
				cont8++;
				break;
			case 9:
				cont9++;
				break;
			case 10:
				cont10++;
				break;
			}
		}
		
		System.out.println("0: " + asteriscos(cont0));
		System.out.println("1: " + asteriscos(cont1));
		System.out.println("2: " + asteriscos(cont2));
		System.out.println("3: " + asteriscos(cont3));
		System.out.println("4: " + asteriscos(cont4));
		System.out.println("5: " + asteriscos(cont5));
		System.out.println("6: " + asteriscos(cont6));
		System.out.println("7: " + asteriscos(cont7));
		System.out.println("8: " + asteriscos(cont8));
		System.out.println("9: " + asteriscos(cont9));
		System.out.println("10: " + asteriscos(cont10));
		
	}
	
	public static void escribirArray(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static int cifrasEntero(int num) {
		int nCifras = 0;
		do {
			num = num / 10;
			nCifras ++;
		}while(num != 0);
		
		return nCifras;
	}
	
	public static String asteriscos(int n) {
		String asteriscos = "";
		
		for (int i=0; i<n; i++) {
			asteriscos = asteriscos + "*";
		}
		return asteriscos;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//ejercicio1();
		//ejercicio2(sc);
		//ejercicio3(sc);
		//ejercicio4(sc);
		//ejercicio5(sc);
		//ejercicio6();
	}

}
