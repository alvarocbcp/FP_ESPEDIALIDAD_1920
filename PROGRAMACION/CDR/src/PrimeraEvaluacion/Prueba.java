package PrimeraEvaluacion;

public class Prueba {



	static void operacion(String a, String b, String c) {
		if(b.equals("+")) {
			System.out.println(a + " + " + c + " = " + Integer.parseInt(a) + Integer.parseInt(c));
		}
		else if(b.equals("-")) {
			System.out.println((a + " - " + c + " = ") + (Integer.parseInt(a) - Integer.parseInt(c)));
		}
		else if(b.equals("*")) {
			System.out.println(a + " * " + c + " = " + Integer.parseInt(a) * Integer.parseInt(c));
		}
		else if(b.equals("/")){
			System.out.println(a + " / " + c + " = " + Integer.parseInt(a) / Integer.parseInt(c));
		}
	}


	public static void main(String [] args) {

		operacion(args[0], args[1], args[2]);
	}
}