package clases1;

public class CircunferenciaMain {

	public static void main(String[] args) {
		
		Circunferencia c1 = new Circunferencia();
		Circunferencia c2 = new Circunferencia(2, 0, 10);
		
		System.out.println("*****CIRCUNFERENCIA C1*****");
		System.out.println("Origen:" + " (" + c1.dameX() + ", " + c1.dameY() + ")\n" + "Radio: "+ c1.dameRadio());
		System.out.println();
		
		c1.ponX(14);
		c1.ponY(10);
		c1.ponRadio(25);
		System.out.println("*****CAMBIANDO DATOS*****");
		System.out.println("Origen:" + " (" + c1.dameX() + ", " + c1.dameY() + ")\n" + "Radio: "+ c1.dameRadio());
		System.out.println();
		
		System.out.println("*****POSICIONES DE MEMORIA*****");
		System.out.println(c1.toString());
		System.out.println(c2);
		System.out.println();
		
		System.out.println("*****CIRCUNFERENCIA C2*****");
		System.out.println("Origen:" + " (" + c2.dameX() + ", " + c2.dameY() + ")\n" + "Radio: "+ c2.dameRadio());
		System.out.println();
	}

}
