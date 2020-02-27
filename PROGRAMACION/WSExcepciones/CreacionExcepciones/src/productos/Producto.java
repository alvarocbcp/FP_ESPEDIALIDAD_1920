package productos;



public class Producto{
	private String codigo;
	private String nombre;
	private float precio;
	
	public Producto(String _codigo, String _nombre, float _precio){
		codigo =_codigo;
		nombre=_nombre;
		precio=_precio;		
	}
	public Producto(){
	}
	public String dameCodigo(){
		return codigo;
	}
	public String dameNombre(){
		return nombre;
	}
	public float damePrecio(){
		return precio;
	}
	public String toString(){
		return ("Codigo:"+codigo+" Nombre:"+nombre+" Precio:"+precio);
	}
	
}