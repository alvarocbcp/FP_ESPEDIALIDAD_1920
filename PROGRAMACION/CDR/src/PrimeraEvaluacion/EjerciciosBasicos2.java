package PrimeraEvaluacion;

import java.util.Scanner;

public class EjerciciosBasicos2 {

	//******************************MÉTODOS************************

		public static boolean esPrimo() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce el número:");
			int n = sc.nextInt();
			int i=2;
			for (i=2; i<n; i++) {
				if (n%i == 0) {
					return false;
				}
				sc.close();
			}
			return true;
		}

	//***************************EJERCICIOS**************************

	static void ejercicio1() {
		int a1 = 2;
		int s = 2;

		do {
			System.out.println(a1);
			a1 = a1 + 3;
			s = s + a1;
			System.out.println(a1);
			a1 = a1 + 2;
			s = s + a1;
		}while (a1<=1800);
		System.out.println("La suma de todos los términos es " + s );

	}

	static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el capital inicial:");
		float Ci = sc.nextFloat();
		int n = 0;
		float i = 0.05F;
		float Cf = 0;
		do {
			n++;
			Cf = (float) ((float) Ci * (Math.pow(1+i, n)));
		}while (Cf < 2*Ci);

		System.out.println("Tardarás " + n + " meses en duplicar el Capital Inicial de " + Ci + "€ a un interés del 5% mensual.");
		sc.close();
	}

	static void ejercicio3() {
		int añoI = 1980;
		int añoF;
		float poblacionA = 3500000;
		float poblacionB = 5000000;
		float crecimientoA = 1.07F;
		float crecimientoB = 1.05F;

		do {
			poblacionA = poblacionA * crecimientoA;
			poblacionB = poblacionB * crecimientoB;
			añoF = añoI++;
		}while (poblacionA <= poblacionB);

		System.out.println("La población de A superará a la población de B en " + añoF);
	}

	static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el capital inicial:");
		float Ci = sc.nextFloat();
		int n = 0;
		float i = 0.06F;
		float Cf = 0;
		do {
			n++;
			Cf = (float) ((float) Ci * (Math.pow(1+i, n)));
		}while (Cf < 3*Ci);

		System.out.println("Tardarás " + n + " meses en triplicar el Capital Inicial de " + Ci + "€ a un interés del 6% mensual.");
		sc.close();
	}

	static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		double N = sc.nextDouble();
		double D=1;
		double S=0;
		do {
			S = S + (1/D);
			D++;
		}while (N>=D);
		System.out.println("La suma de la sucesión es " + S);
		sc.close();
	}

	static void ejercicio6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		double N = sc.nextDouble();
		double D=1;
		double S=0;
		do {
			S = S + (1/D);
			D++;
			S = S - (1/D);
			D++;
		}while (N>=D);
		System.out.println("La suma de la sucesión es " + S);
		sc.close();
	}

	static void ejercicio7() {
		int sum=0, num=10;
		for (num = 10; num<=50; num++) {
			sum = sum + num;
			num = num + 2;
		}
		System.out.println("La suma de los números pares del 10 al 50 es " + sum);
	}

	static void ejercicio8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número:");
		int num = sc.nextInt();
		int i = 1;
		do {
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
			i++;
		}while (i<=num);
		sc.close();
	}

	static void ejercicio9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		int n1 = sc.nextInt();
		System.out.println("Introduce el segundo número:");
		int n2 = sc.nextInt();
		int aux1 = n1, aux2 = n2;
		
		System.out.print(aux1);
		for(int j=1; j<aux2; j++) {
			System.out.print("+" + aux1);
		}
		
		for(int i=1; i<aux2; i++) {
			n1 += aux1;
		}
		System.out.println("=" + n1);
		
		System.out.print(aux2);
		for(int j=1; j<aux1; j++) {
			System.out.print("+" + aux2);
		}
		
		for(int i=1; i<aux1; i++) {
			n2 += aux2;
		}
		System.out.println("=" + n2);
		sc.close();
	}

	static void ejercicio10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número que desea dividir:");
		int dividendo = sc.nextInt();
		System.out.println("Introduce el divisor:");
		int divisor = sc.nextInt();
		int cociente=0, resto;
		
		if(divisor>dividendo) {
			int aux = dividendo;
			dividendo = divisor;
			divisor = aux;
		}

		do {
			dividendo = dividendo - divisor;
			cociente ++;
		}while (dividendo>=divisor);
		resto = dividendo;
		System.out.println("El resultado tiene como cociente " + cociente + " y resto " + resto);
		sc.close();
	}

	static void ejercicio11() {
		Scanner sc = new Scanner(System.in);
		int numero, invertido=0, resto;

		System.out.println("Introduce el número a invertir:");
		numero = sc.nextInt();

		while (numero > 0) {
			resto = numero % 10;
			invertido = invertido * 10 + resto;
			numero /= 10;
		}
		System.out.println("Número invertido: " + invertido);
		sc.close();
	}

	static void ejercicio12() {
		if (esPrimo()==true) {
			System.out.println("El número es primo");
		}
		else {
			System.out.println("El número no es primo");
		}
	}
	
	static void ejercicio13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
	
	static void ejercicio14() {
		Scanner sc = new Scanner(System.in);
		int A, B, i;
		System.out.println("Introduce un número:");
		A = sc.nextInt();
		int resultado=1;
		do {
			System.out.println("Introduce un exponente nulo o positivo");
			B=sc.nextInt();
		}while (B<0);
		
		for(i=0; i<B; i++) {
			resultado = A*resultado;
		}
		System.out.println(resultado);
		sc.close();
	}


	public static void main(String[] args) {
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		//ejercicio5();
		//ejercicio6();
		//ejercicio7();
		ejercicio8();
		//ejercicio9();
		//ejercicio10();
		//ejercicio11();
		//ejercicio12();
		//ejercicio13();
		//ejercicio14();
		
	}

}
