package enumPrecio1;

public class Main {

	public static void main(String args[]) {
		
		
		Precio a = Precio.CARO;
		Precio b = Precio.BARATO;
		if (Precio.MEDIO.equals(a)) {
		   System.out.println ("a tiene precio "+Precio.MEDIO);
		}
		
		System.out.println ("b tiene precio " + b);
		System.out.println (Precio.MEDIO);
		System.out.println (Precio.valueOf("MEDIO"));
		Precio[] valores = Precio.values();
		
		for  (Precio valor : valores) {
			System.out.println (valor);
		}
		

		
	}

}