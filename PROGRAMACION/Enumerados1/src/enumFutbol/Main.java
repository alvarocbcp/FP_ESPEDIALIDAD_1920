package enumFutbol;

public class Main {

	public static void main(String args[]) {
		/*
		Demarcacion delantero = Demarcacion.DELANTERO;
		Demarcacion defensa = Demarcacion.DEFENSA;
		Demarcacion portero = Demarcacion.PORTERO;
		Demarcacion centrocampista = Demarcacion.CENTROCAMPISTA;
		
		// Devuelve un String con el nombre de la constante
		System.out.println("delantero.name()= " + Demarcacion.DELANTERO.name());
		
		//O también:
		
		System.out.println("delantero.name()= " + delantero.name());
		System.out.println("defensa.toString()= " + defensa.toString());
		
		
		//  Devuelve un entero con la posición de la constante según está declarada.
		System.out.println("delantero.ordinal()= " + delantero.ordinal());
		
		
		// Compara el enum con el parámetro según el orden en el que están declaradas las constantes. 
		System.out.println("delantero.compareTo(centrocampista)= " + delantero.compareTo(centrocampista));
		System.out.println("delantero.compareTo(portero)= " + delantero.compareTo(portero));
		System.out.println("delantero.compareTo(delantero)= " + delantero.compareTo(delantero));
		
		
		// Recorre todas las constantes de la enumeracion
		// d va apuntando a los objetos que devuelve values()
		for(Demarcacion d: Demarcacion.values()){
			System.out.print(d.toString()+" - ");
		}
		
		
		System.out.println();
		
		System.out.println(Demarcacion.valueOf("DELANTERO"));
		*/
		
		System.out.println();
		
		// Referenciamos el enumerado
		Equipo villareal = Equipo.VILLAREAL;
		
		// Devuelve un String con el nombre de la constante
		System.out.println("villareal.name()= " + villareal.name());
		
		// Devuelve el contenido de los atributos
		//System.out.println("villareal.getNombreClub()= " + villareal.nombreClub);
		// Lo de arriba se puede si es público el atributo
		System.out.println("villareal.getNombreClub()= " + villareal.getNombreClub());
		System.out.println("villareal.getPuestoLiga()= " + villareal.getPuestoLiga());
		
		// La clase Futbolista es una clase normal, con un atributo de tipo enumerado
		
		Futbolista casillas = new Futbolista("Casillas", 1, Demarcacion.PORTERO, Equipo.REAL_MADRID);
		Futbolista capdevila = new Futbolista("Capdevila", 11, Demarcacion.DEFENSA, Equipo.VILLAREAL);
		Futbolista iniesta = new Futbolista("Iniesta", 6, Demarcacion.CENTROCAMPISTA, Equipo.BARCA);
		Futbolista navas = new Futbolista("Navas", 22, Demarcacion.DELANTERO, Equipo.SEVILLA);
		
		System.out.println(casillas);
		System.out.println(capdevila);
		System.out.println(iniesta);
		System.out.println(navas);
		
	}

}