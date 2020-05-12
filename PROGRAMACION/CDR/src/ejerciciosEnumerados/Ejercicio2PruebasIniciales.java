package ejerciciosEnumerados;

public class Ejercicio2PruebasIniciales {
	
	public enum Demarcacion {
		PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO
	};
	
	public enum Equipo
	{
		BAR�A("FC Barcelona",1), REAL_MADRID("Real Madrid",2),
		SEVILLA("Sevilla FC",4), VILLAREAL("Villareal",7); 
		
		private String nombreClub;
		private int puestoLiga;
		
		private Equipo (String nombreClub, int puestoLiga){
			this.nombreClub = nombreClub;
			this.puestoLiga = puestoLiga;
		}

		public String getNombreClub() {
			return nombreClub;
		}

		public int getPuestoLiga() {
			return puestoLiga;
		}	
	};


	public static void main(String[] args) {
		
		// EJEMPLOS PARA PROBAR
		Demarcacion delantero = Demarcacion.DELANTERO;
		Demarcacion defensa = Demarcacion.DEFENSA;

		// Devuelve un String con el nombre de la constante
		System.out.println("delantero.name()= " + delantero.name());
		System.out.println("defensa.toString()= " + defensa.toString());

		// Devuelve un entero con la posici�n de la constante seg�n est� declarada.
		System.out.println("delantero.ordinal()= " + delantero.ordinal());

		// Compara el enum con el par�metro seg�n el orden en el que est�n // declaradas las constantes. 
		System.out.println("delantero.compareTo(portero)= " + delantero.compareTo(defensa));
		System.out.println("delantero.compareTo(delantero)= " + delantero.compareTo(delantero));

		// Recorre todas las constantes de la enumeraci�n
		for(Demarcacion d: Demarcacion.values()){
			System.out.println(d.toString()+" - ");
		}
		
		System.out.println("************************************************************************");
		
		
		
		// Instanciamos el enumerado
		Equipo villareal = Equipo.VILLAREAL;

		// Devuelve un String con el nombre de la constante
		System.out.println("villareal.name()= "+villareal.name());

		// Devuelve el contenido de los atributos
		System.out.println("villareal.getNombreClub()="
		+villareal.getNombreClub());
		System.out.println("villareal.getPuestoLiga()=" +villareal.getPuestoLiga());

		



	}

}
