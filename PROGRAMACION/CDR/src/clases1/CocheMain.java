package clases1;

public class CocheMain {

	public static void main(String[] args) {
		
		Coche c1 = new Coche();
		Coche c2 = new Coche("azul", "seat", "4569JJJ", 3);
		
		System.out.println("*****COCHE 1*****");
		c1.imprimir();
		System.out.println();
		
		System.out.println("*****COCHE 2*****");
		c2.imprimir();
		System.out.println();
	}

}
