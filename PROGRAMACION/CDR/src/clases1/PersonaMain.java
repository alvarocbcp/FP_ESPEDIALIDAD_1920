package clases1;

public class PersonaMain {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Tomas Navarra", 22);
		Persona.contadorPersonas++;
		
		Persona p2 = new Persona("Jonas Estancio", 23);
		Persona.contadorPersonas++;
		
		System.out.println("Se han creado: " + Persona.contadorPersonas + " personas.");

	}

}
