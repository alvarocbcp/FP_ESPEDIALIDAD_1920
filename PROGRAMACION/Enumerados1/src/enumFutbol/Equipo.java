package enumFutbol;

public enum Equipo
{
	
	// Se est�n definiendo los enumerados llamando a sus constructores
	// En este caso sin new, pasamos los par�metros
	
	BARCA("FC Barcelona",1), REAL_MADRID("Real Madrid",2),
	SEVILLA("Sevilla FC",4), VILLAREAL("Villareal",7); 
	
	private String nombreClub;
	private int puestoLiga;
	
	// Tiene que ser privada para que no se puedan crear nuevos
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
	
}