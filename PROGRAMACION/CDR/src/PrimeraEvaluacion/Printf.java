package PrimeraEvaluacion;

public class Printf {

	public static void main(String[] args) {
		
		System.out.printf("%.2f%n", 12.3698);
		
		double n = 1.25036;
		System.out.printf("%.3f %n", n);
		System.out.printf("%+.3f %n", n);
		
		int x = 10;
		System.out.printf("%d %n", x);
		System.out.printf("%+d %n", x);
		
		n = 1.25036;
		x = 10;
		System.out.printf("n = %.2f x = %d %n", n, x);
		
		System.out.printf("n = %1$.2f x = %2$d %n", n, x);
		
		int uno = 1, dos = 2;
		
		System.out.printf(" uno = %1$d dos = %2$d %n", uno, dos);
		System.out.printf(" dos = %2$d uno = %1$d %n", uno, dos);
		System.out.printf(" dos = %d uno = %d %n", uno, dos);
		
		n = 123.4567;
		System.out.printf("El cuadrado de %.2f es %.2f\n", n, n*n);
		System.out.printf("El cuadrado de %.2e es %.2e\n", n, n*n);
		
		n = 1.25036;
		System.out.printf("%+10.2f %n", n);
		
		System.out.printf("%+010.2f %n", n);
		
		double precio = 1.22;
		System.out.printf("%10.2f %n", precio);
		
		System.out.printf("FIN");
		System.out.printf("%-10s", "Total:");
		System.out.printf("FIN");
		System.out.printf("%10s", "Total:");
		System.out.printf("FIN");

	}

}
