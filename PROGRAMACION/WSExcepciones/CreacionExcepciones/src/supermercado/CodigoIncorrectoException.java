package supermercado;

public class CodigoIncorrectoException extends Exception {

	private static final long serialVersionUID = 1L;

	public CodigoIncorrectoException(String msg) {
        super(msg);
    }
}