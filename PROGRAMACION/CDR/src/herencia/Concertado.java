package herencia;

public class Concertado extends Centro{

	protected int asignacionMensual;

	public Concertado(String n, String d, int asignacionMensual) {
		super(n, d);
		this.asignacionMensual = asignacionMensual;
	}

	public String toString() {
		String cad = super.toString();
		cad = cad + "\nASIGNACION MENSUAL PUBLICA RECIBIDA: " + asignacionMensual;
		return cad;
	}
}
