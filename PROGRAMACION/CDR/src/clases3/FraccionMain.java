package clases3;

public class FraccionMain {

	public static void main(String[] args) {
		
		Fraccion f1 = new Fraccion(6,12);
		Fraccion f2 = new Fraccion(6,12);
		Fraccion f3 = new Fraccion();
		
		System.out.println("SUMA f1+f2");
		f3=f3.suma(f1, f2);
		System.out.println(f3.simplificar(f3));
		System.out.println();
		
		System.out.println("RESTA f1-f2");
		f3=f3.resta(f1, f2);
		System.out.println(f3.simplificar(f3));
		System.out.println();
		
		System.out.println("DIVISION f1/f2");
		f3=f3.division(f1, f2);
		System.out.println(f3.simplificar(f3));
		System.out.println();
		
		System.out.println("MULTIPLICACION f1*f2");
		f3=f3.multiplicar(f1, f2);
		System.out.println(f3.simplificar(f3));
		System.out.println();
		
		System.out.println("INVERSA f1");
		System.out.println(f3=f3.inversa(f1));
		System.out.println();
		
		System.out.println("INVERSA f2");
		System.out.println(f3=f3.inversa(f2));
		System.out.println(f3.simplificar(f3));
		System.out.println();
		
		System.out.println("SIMPLIFICAR f1");
		System.out.println(f3.simplificar(f1));
		System.out.println();
		
		System.out.println("SIMPLIFICAR f2");
		System.out.println(f3.simplificar(f2));
		System.out.println();

	}

}
