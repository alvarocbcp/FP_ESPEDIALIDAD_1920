package PrimeraEvaluacion;

import java.util.Scanner;

public class EjerciciosBasicos3 {

	
	static void ejercicio1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Cu�ntos intentos desea tener?");
		int intentos = sc.nextInt();
		int intentosRealizados=0;

		int numAleatorio = (int) (Math.random()*200+1);
		int numUsuario = 0;

		do {
			System.out.println("Introduce un n�mero:");
			numUsuario = sc.nextInt();
			intentosRealizados++;

			if (numUsuario < numAleatorio && intentosRealizados < intentos) {
				System.out.println("El n�mero es m�s grande");
			}
			else if (numUsuario > numAleatorio && intentosRealizados < intentos){
				System.out.println("El n�mero es m�s peque�o");
			}

		}while (intentosRealizados < intentos && numAleatorio != numUsuario);

		if (intentosRealizados == intentos) {
			System.out.println("Has agotado los intentos :(");
		}
		else {
			System.out.println("��ACERTASTE usando " + intentosRealizados + "/" + intentos + " intentos!!");
		}
		sc.close();
	}

	static void ejercicio2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el primer n�mero:");
		int num1 = sc.nextInt();

		System.out.println("Introduce el segundo n�mero:");
		int num2 = sc.nextInt();
		int acum1 = 0;
		int acum2 = 0;

		for (int i=1; i<num1; i++) {
			if (num1%i == 0) {
				acum1 += i;
			}
			if (num2%i == 0) {
				acum2 += i;
			}
		}

		if (acum2 == num1 && acum1 == num2) {
			System.out.println("Los n�meros " + num1 + " y " + num2 + " son amigos");
		}
		else {
			System.out.println("Los n�meros " + num1 + " y " + num2 + " no son amigos");
		}
		sc.close();
	}

	static void ejercicio3() {
		int random1 = (int) (Math.random()*10+0);
		int random2 = (int) (Math.random()*10+0);
		int random3 = (int) (Math.random()*10+0);
		String num1="", num2="", num3="";
		if (random1 == 3) {
			num1 = "E";
		}
		else if (random1 != 3){
			num1 = Integer.toString(random1);
		}
		if (random2 == 3) {
			num2 = "E";
		}
		else if (random2 != 3){
			num2 = Integer.toString(random2);
		}
		if (random3 == 3) {
			num3 = "E";
		}
		else if (random3 != 3){
			num3 = Integer.toString(random3);
		}

		System.out.println(num1 + "-" + num2 + "-" + num3);
	}


	static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		
		// variables
		int dias , mes , a�o;
		int tarot;

		//Pedimos los datos
		System.out.print("Introduce el d�a: ");
		dias = sc.nextInt();

		System.out.print("Introduce el mes: ");
		mes = sc.nextInt();

		System.out.print("Introduce el a�o: ");
		a�o = sc.nextInt();

		int suma= 0;
		int resto = 0;


		//Sumamos las fechas
		tarot = dias + mes + a�o;

		while(tarot > 0){

			//Obtengo el �ltimo numero
			resto = tarot % 10;

			//Le quito el �ltimo digito
			tarot = tarot / 10;

			//Lo sumo
			suma += resto;	
		}
		//Obtengo el �ltimo n�mero
		resto = suma % 10;
		suma = suma / 10;

		tarot = resto + suma;

		System.out.println("el numero del tarot es " + tarot);
		sc.close();
	}

	public static void main(String[] args) {

		//ejercicio1();
		//ejercicio2();
		ejercicio3();
		//ejercicio4();

	}

}
