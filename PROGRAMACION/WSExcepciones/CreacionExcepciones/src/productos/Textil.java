package productos;

public class Textil extends Producto{
	private String color;
	
	public Textil(String _c, String _n, float _p, String _color){
		super(_c, _n, _p);
		color=_color;
	}
	public String toString(){
		String s=super.toString();
		return (s+" Color:"+color);
	}
}