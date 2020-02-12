package clases1;

public class CirculoMain {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo(5);
		Circulo c3 = new Circulo(2,2,4);
		
		System.out.println("*****CIRCULO 1*****");
		c1.ImprimirCoordenadas();
		c1.Imprimir();
		System.out.println();
		
		System.out.println("*****CIRCULO 2*****");
		c2.ImprimirCoordenadas();
		c2.Imprimir();
		System.out.println();
		
		System.out.println("*****CIRCULO 3*****");
		c3.ImprimirCoordenadas();
		c3.Imprimir();
		
	}

}
