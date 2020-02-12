package clases1;

public class Persona3Main {

	public static void main(String[] args) {
		
		Persona3 p1 = new Persona3("Tomas Navarra", 22);
		
		Persona3 p2 = new Persona3("Jonas Estancio", 23);
		
		System.out.println("Se han creado: " + Persona3.getContadorPersonas() + " personas.");

	}

}
