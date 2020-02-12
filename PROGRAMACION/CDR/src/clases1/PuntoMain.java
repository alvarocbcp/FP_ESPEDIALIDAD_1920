package clases1;

public class PuntoMain {

	public static void main(String[] args) {
		
		Punto p1 = new Punto();
		Punto p2 = new Punto(2, 5);
		
		System.out.println("*****PUNTO 1*****");
		p1.imprimirCoordenadas();
		System.out.println();
		
		System.out.println("*****PUNTO 2*****");
		p2.setX(4);
		p2.imprimirCoordenadas();
		System.out.println();

	}

}
