package PrimeraEvaluacion;

public class EjerciciosFunciones2 {


	public static long voltea(long numero) {		
		long invertido=0, resto;

		while (numero > 0) {
			resto = numero % 10;
			invertido = invertido * 10 + resto;
			numero /= 10;
		}

		return invertido;
	}

	public static boolean esCapicua(long num) {
		if (voltea(num) == num) {
			return true;
		}
		return false;
	}

	public static long digitos(long num) {
		long nCifras = 0;
		do {
			num = num / 10;
			nCifras ++;
		}while(num != 0);

		return nCifras;
	}

	public static long digitoN(long num, int n) {
		long resto=0;
		num=voltea(num);
		for(int i=1;i<=n;i++) {
			resto=num%10;
			num=num/10;
		}
		return resto;
	}
	
	public static long posicionDeDigito(long num, int n) {
		long resto=0;
		num=voltea(num);
		long cont = 1;
		for(int i=1;i<=digitos(num);i++) {
			resto=num%10;
			if(resto==n) {
				return cont;
			}
			else {
				num=num/10;
				cont++;
			}
		}
		return cont;
	}
	
	public static long quitaPorDetras(long num, int cifrasAQuitar) {		
		long cifrasQuitadas = 0;
		do {
			num = num / 10;
			cifrasQuitadas ++;
		}while(cifrasQuitadas < cifrasAQuitar);
		
		return num;
	}
	
	public static long quitaPorDelante(long num, int cifrasAQuitar) {
		long volteo1 = voltea(num);		
		long cifrasQuitadas = 0;
		
		do {
			volteo1 = volteo1 / 10;
			cifrasQuitadas ++;
		}while(cifrasQuitadas < cifrasAQuitar);
		
		long volteo2 = voltea(volteo1);
		
		return volteo2;

	}
	
	public static long pegaPorDetras(long num, int num2) {
		long numFinal = (num * 10) + num2;
		return numFinal;
	}
	
	public static long pegaPorDelante(long num, int num2) {
		long volteo1 = voltea(num);
		
		long numFinal = (volteo1 * 10) + num2;
		
		long volteo2 = voltea(numFinal);
		
		return volteo2;
	}
	
	public static long trozoDeNumero(long num, int a, int b) {
		int i=b;
		int j=a;
		
		do {
			num /= 10;
			i--;
		}while(i>b);
		
		num = voltea(num);
		
		do {
			num /= 10;
			j--;
		}while(j>a);
		
		num = voltea(num);
		
		return num;
	}
	
	public static long juntaNumeros(long a, long b) {		
		long numF = (long)(a * Math.pow(10, digitos(b))) + b;
		
		return numF;
	}


	public static void main(String[] args) {
		
		System.out.println("1. Voltea el n�mero 123456789: " );
		System.out.println(voltea(123456789));
		System.out.println("------------------------------------------------");
		
		System.out.println("2. Ejercicio \"esCapicua\" del n�mero 12321: ");
		System.out.println(esCapicua(12321));
		System.out.println("------------------------------------------------");
		
		System.out.println("3. Cuenta los d�gitos del n�mero 123456789: ");
		System.out.println(digitos(123456789));
		System.out.println("------------------------------------------------");
		
		System.out.println("4. Muestra el digito en la posici�n 2 del n�mero 123456789: ");
		System.out.println(digitoN(123456789, 2));
		System.out.println("------------------------------------------------");
		
		System.out.println("5. Muestra la primera ocurrencia del n�mero 1 en el n�mero 45621849: ");
		System.out.println(posicionDeDigito(45621849, 1));
		System.out.println("------------------------------------------------");
		
		System.out.println("6. Quita 2 cifras al n�mero 123456 por detr�s: ");
		System.out.println(quitaPorDetras(123456, 2));
		System.out.println("------------------------------------------------");
		
		System.out.println("7. Quita 3 cifras al n�mero 45685247 por delante: ");
		System.out.println(quitaPorDelante(45685247, 3));
		System.out.println("------------------------------------------------");
		
		System.out.println("8. Pega el n�mero 6 por detr�s al n�mero 1234587: ");
		System.out.println(pegaPorDetras(1234587, 6));
		System.out.println("------------------------------------------------");
		
		System.out.println("9. Pega el n�mero 9 por delante al n�mero 124634: ");
		System.out.println(pegaPorDelante(124634, 9));
		System.out.println("------------------------------------------------");
		
		System.out.println("10. Selecciona una secci�n del n�mero 456985234 entre las posiciones 2 y 7: ");
		System.out.println(trozoDeNumero(456985234, 2, 7));
		System.out.println("------------------------------------------------");
		
		System.out.println("11. Junta los n�meros 1111 y 2222: ");
		System.out.println(juntaNumeros(1111, 2222));
		System.out.println("------------------------------------------------");
	}

}
