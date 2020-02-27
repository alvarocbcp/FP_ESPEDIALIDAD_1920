package productos;
import java.time.LocalDate;

public class Alimento extends Producto {
	private LocalDate fechaCad;
	
	public Alimento(String _c, String _n, float _p, LocalDate _fechaCad) {
		super(_c, _n, _p);
		fechaCad=_fechaCad;		
	}
	
	public String toString() {
		String s=super.toString();
		return (s+" fecha caducidad alimento:" + fechaCad);
	}
		
}