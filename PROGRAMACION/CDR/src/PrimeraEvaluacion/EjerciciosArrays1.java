package PrimeraEvaluacion;

import java.util.Scanner;

public class EjerciciosArrays1 {

	public static int[] ejercicio2a(int[] a) {
		System.out.print("Valores del array: ");
		for(int i=0; i<a.length; i++) {
			a[i] = i*3;
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("Posición de memoria: ");
		return a;
	}

	public static int[] ejercicio2b(int[] a) {
		System.out.print("Valores del array: ");
		for(int i=0; i<a.length; i++) {
			a[i] = a.length-1-i;
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("Posición de memoria: ");
		return a;
	}

	public static boolean[] ejercicio2c(boolean[] a) {
		System.out.print("Valores del array: ");
		for(int i=0; i<a.length; i++) {
			if(i%2==0) {
				a[i]=true;
			}
			else {
				a[i]=false;
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("Posición de memoria: ");
		return a;
	}

	//cuentaCeros
	public static int ejercicio3a(int[] arr) {
		int cont=0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i]==0) {
				cont++;
			}
		}
		return cont;
	}

	//sumaPares
	public static int ejercicio3b(int[] arr) {
		int cont=0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i]%2==0) {
				cont = cont + arr[i];
			}
		}
		return cont;
	}

	//cuentaRepeticiones
	public static int ejercicio3c(int[] arr, int x) {
		int cont=0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i]==x) {
				cont++;
			}
		}
		return cont;
	}

	//sustituye
	public static void ejercicio3d(int[] arr, int nViejo, int nNuevo) {
		for(int i=0; i<arr.length; i++) {
			if (arr[i]==nViejo) {
				arr[i]=nNuevo;
			}
			System.out.print(arr[i] + " ");
		}
	}

	//intercambiaValores
	public static void ejercicio3e1(int[] arr, int a, int b) {
		for(int i=0; i<arr.length; i++) {
			if (arr[i]==a) {
				arr[i]=b;
			}
			else if (arr[i]==b) {
				arr[i]=a;
			}
			System.out.print(arr[i] + " ");
		}
	}

	//intercambiaPosiciones
	public static void ejercicio3e2(int[] arr, int a, int b) {
		int aux = arr[a];
		arr[a] = arr[b];
		arr[b]=aux;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	//invierte
	public static void ejercicio3f(int[] arr) {
		int[] arrayCopia = new int[arr.length];
		int k=0;
		for(int j=arrayCopia.length-1; j>=0; j--) {
			arrayCopia[j] = arr[k];
			k++;
		}

		for(int i=0; i<arrayCopia.length; i++) {
			System.out.print(arrayCopia[i] + " ");

		}
	}

	//rotaDerecha
	public static void ejercicio3g(int[] arr) {
		int[] arrayCopia = new int[arr.length];
		int k=0;
		for(int j=0; j<arrayCopia.length; j++) {
			if (j==arrayCopia.length-1) {
				arrayCopia[0] = arr[arr.length-1];
			}
			else {
				arrayCopia[j+1] = arr[k];
				k++;
			}
		}

		for(int i=0; i<arrayCopia.length; i++) {
			System.out.print(arrayCopia[i] + " ");

		}
	}

	//iguales
	public static boolean ejercicio3h(int[] a, int[] b) {
		if (a.length!=b.length) {
			return false;
		}
		else {
			for(int i=0; i<a.length; i++) {
				if (a[i]!=b[i]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		int longi = 10;
		int sumaPos=0;
		int sumaNeg=0;
		int contPos=0;
		int contNeg=0;
		int[] array = new int[longi];
		for (int i=0; i<array.length; i++) {
			System.out.print("Introduce un número: ");
			array[i] = sc.nextInt();
			if (array[i]>0) {
				sumaPos += array[i];
				contPos++;
			}
			else if (array[i]==0) {
				
			}
			else {
				sumaNeg += array[i];
				contNeg++;
			}
		}
		float mediaPos = sumaPos/contPos;
		float mediaNeg = sumaNeg/contNeg;
		
		System.out.println("La media de los números positivos es: " + mediaPos);
		System.out.println("La media de los números negativos es: " + mediaNeg);
		sc.close();		
	}
	
	public static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		int longi = 10;
		int sumaPar=0;
		int contPar=0;
		int[] array = new int[longi];
		for (int i=0; i<array.length; i++) {
			System.out.print("Introduce un número: ");
			array[i] = sc.nextInt();
			if (i%2==0 || i==0) {
				sumaPar += array[i];
				contPar++;
			}
		}
		float mediaPar = sumaPar / contPar;
		System.out.println("La media de las posiciones pares del array es: " + mediaPar);
		sc.close();
	}
	
	public static void ejercicio6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el número de personas: ");
		int personas = sc.nextInt();
		int sumaAlturas = 0;
		float mediaAlturas;
		int contMayor=0;
		int contMenor=0;
		int[] array = new int[personas];
		
		for(int i=0; i<array.length; i++) {
			System.out.print("Introduce la altura la persona " + (i+1) + ": ");
			array[i]= sc.nextInt();
			sumaAlturas += array[i];
			
		}
		mediaAlturas = sumaAlturas / personas;
		for(int j=0; j<array.length; j++) {
			if (array[j]>mediaAlturas) {
				contMayor++;
			}
			else {
				contMenor++;
			}
		}
		System.out.println("La media de las alturas es: " + mediaAlturas);
		System.out.println(contMayor + " personas tienen una estatura por encima de la media.");
		System.out.println(contMenor + " personas tienen una estatura por debajo de la media.");
		sc.close();
	}
	
	public static void ejercicio7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos alumnos?");
		int alumnos = Integer.parseInt(sc.nextLine());
		
		while(alumnos <= 0) {
			System.out.println("Introduce un número de alumnos superior a 0: ");
			alumnos = Integer.parseInt(sc.nextLine());
		}
		
		float[] notas = new float[alumnos];
		String[] nombres = new String[alumnos];
		String[] nombresNotas = new String[alumnos];
		
		for(int i=0; i<notas.length; i++) {
			System.out.println("Introduce el nombre de un alumno: ");
			nombres[i] = sc.nextLine();
			do {
				System.out.println("Introduce la nota del alumno: ");
				notas[i] = Float.parseFloat(sc.nextLine());
			}while (notas[i]<0 || notas[i]>10);
			
			if (notas[i]>=0 && notas[i]<=4.99) {
				nombresNotas[i] = "Suspenso";
			}
			else if (notas[i]>=5 && notas[i]<=6.99) {
				nombresNotas[i] = "Bien";
			}
			else if (notas[i]>=7 && notas[i]<=8.99) {
				nombresNotas[i] = "Notable";
			}
			else {
				nombresNotas[i] = "Sobresaliente";
			}
		}
		escribirArrayS(nombres);
		System.out.println();
		escribirArrayF(notas);
		System.out.println();
		escribirArrayS(nombresNotas);
		sc.close();
	}
	
	static void escribirArrayS(String[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.printf("%-20s", a[i]);
		}
	}
	static void escribirArrayF(float[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.printf("%-20s", a[i]);
		}
	}

	public static void main(String[] args) {

		//int[] arrayInt = new int[5];

		//int[] arrayInt2 = {1, 2, 3, 0, 5, 4};
		//int[] arrayInt3 = {1, 2, 3, 0, 5, 4};

		//boolean[] arrayBool = new boolean[3];

		//System.out.println("**********EJERCICIO 2**********");
		//System.out.println("a)");
		//System.out.println(ejercicio2a(arrayInt));
		//System.out.println();

		//System.out.println("b)");
		//System.out.println(ejercicio2b(arrayInt));
		//System.out.println();

		//System.out.println("c)");
		//System.out.println(ejercicio2c(arrayBool));
		//System.out.println();

		//System.out.println("**********EJERCICIO 3**********");
		//System.out.println("a)");
		//System.out.println("El array introducido tiene " + ejercicio3a(arrayInt2) + " ceros.");
		//System.out.println();

		//System.out.println("b)");
		//System.out.println("La suma de los elementos pares del array es " + ejercicio3b(arrayInt2) + ".");
		//System.out.println();

		//System.out.println("c)");
		//System.out.println("El número introducido aparece " + ejercicio3c(arrayInt2, 5) + " veces en el array.");
		//System.out.println();

		//System.out.println("d)");
		//ejercicio3d(arrayInt2, 5, 20);
		//System.out.println();

		//System.out.println("e1)");
		//ejercicio3e1(arrayInt2, 0, 5);
		//System.out.println();

		//System.out.println("e2)");
		//ejercicio3e2(arrayInt2, 2, 3);
		//System.out.println();

		//System.out.println("f)");
		//ejercicio3f(arrayInt2);
		//System.out.println();

		//System.out.println("g)");
		//ejercicio3g(arrayInt2);
		//System.out.println();

		//System.out.println("h)");
		//System.out.println(ejercicio3h(arrayInt2, arrayInt3));
		//System.out.println();
		
		//System.out.println("**********EJERCICIO 4**********");
		//ejercicio4();
		//System.out.println();
		
		//System.out.println("**********EJERCICIO 5**********");
		//ejercicio5();
		//System.out.println();
		
		//System.out.println("**********EJERCICIO 6**********");
		//ejercicio6();
		//System.out.println();
		
		//System.out.println("**********EJERCICIO 7**********");
		//ejercicio7();
		//System.out.println();
	}
}