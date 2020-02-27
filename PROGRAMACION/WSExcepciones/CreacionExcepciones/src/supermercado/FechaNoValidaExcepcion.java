package supermercado;

public class FechaNoValidaExcepcion extends Exception {

	private static final long serialVersionUID = 1L;

	public FechaNoValidaExcepcion(String msg) {
        super(msg);
    }
}