package herencia;

public class Privado extends Centro{

	protected int cuota;

	public Privado(String n, String d, int asignacion) {
		super(n, d);
		this.cuota = asignacion;
	}

	public String toString() {
		String cad = super.toString();
		cad = cad + "\nCUOTA MENSUAL A PAGAR: " + cuota;
		return cad;
	}
}
