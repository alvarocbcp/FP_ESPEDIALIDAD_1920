package PrimeraEvaluacion;

public class ParametroEnMetodos {
	static int miGlobal=19;
	
	//METODOS
	
	public static void modificarGlobal1(int v) {
		System.out.println("Valor de v dentro del método antes de mod" + v);
		v += 100;
		System.out.println("Valor de v dentro del método después de mod" + v);
	}
	
	public static void modificarGlobal2() {
		System.out.println("Valor de v dentro del método antes de mod" + miGlobal);
		miGlobal += 100;
		System.out.println("Valor de v dentro del método despueés de mod" + miGlobal);
	}
	
	public static void modificar1(int v) {
		System.out.println("Valor de v antes " + v);
		v += 100;
		System.out.println("Valor de v despueés " + v);
	}
	
	public static int modificar2(int v) {
		System.out.println("Valor de v antes " + miGlobal);
		miGlobal += 100;
		System.out.println("Valor de v despueés " + miGlobal);
		return v;
	}
	
	public static void modificarA1(int[] v) {
		System.out.println("Valor de v dentro del método antes " + v);
		for (int i=0; i<v.length; i++) {
			v[i] += 100;
			System.out.println("Valor de v dentro del método después " + v);
		}
	}
	
	public static int[] modificarA2(int[] v) {
		System.out.println("Valor de v dentro del método antes " + v);
		for (int i=0; i<v.length; i++) {
			v[i] += 100;
			System.out.println("Valor de v dentro del método después " + v);
		}
		return v;
	}
	
	static void escribirArray(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		modificarGlobal1(miGlobal);
		System.out.println("Valor de miGlobal tras modificarGlobal1 " + miGlobal);
		modificarGlobal2();
		System.out.println("Valor de miGlobal tras modificarGlobal2 " + miGlobal);
		
		int p=9;
		
		modificar1(p);
		System.out.println("Valor de p tras modificar1 " + p);
		
		modificar2(p);
		System.out.println("Valor de p tras modificar2 " + p);
		
		int[] array = {9, 4};
		
		modificarA1(array);
		System.out.println("Valor de array tras modificarA1 " + array);
		escribirArray(array);
		
		System.out.println();
		System.out.println();	
		
		array = modificarA2(array);
		System.out.println("Valor de array tras modificarA2 " + array);
		escribirArray(array);

	}

}
