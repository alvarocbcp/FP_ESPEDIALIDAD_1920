package productos;

public class Drogueria extends Producto{
	private String marca;
		
	
	public Drogueria(String _c, String _n, float _p, String _m){
		super(_c, _n,_p);
		marca=_m;
	}
	
	public String toString(){
		String s=super.toString();
		return (s+" Marca:"+marca);
	}
}