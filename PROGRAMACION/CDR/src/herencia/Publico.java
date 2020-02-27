package herencia;

public class Publico extends Centro{
	
	protected int asignacionAnual;
	
	public Publico(String n, String d, int asignacionAnual) {
		super(n, d);
		this.asignacionAnual = asignacionAnual;
	}
	
	public String toString() {
		String cad = super.toString();
		cad = cad + "\nASIGNACION ANUAL PUBLICA RECIBIDA: " + asignacionAnual;
		return cad;
	}

}
