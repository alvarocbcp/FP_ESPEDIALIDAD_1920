package supermercado;

import java.util.ArrayList;

import productos.Producto;

public class Supermercado{
	// En este ArrayList se guardaran los productos del supermercado
	private ArrayList <Producto>sup;
	
	public Supermercado(){
		sup = new ArrayList <Producto>();		
	}
	
	public void aniadir(Producto _p){
		sup.add(_p);
	}
	
	public void verProductos(){
		if (sup.size() == 0)
			System.out.println("No hay productos en el supermercado.");
		else {
			System.out.println("               Lista de productos");
			for(int i=0;i<sup.size();i++){
				System.out.println((i+1)+" "+sup.get(i));
			}
		}
		
	}
	
	public static void validaCodigo(String _codigo) throws CodigoIncorrectoException {
		if (!_codigo.matches("[A-Z][0-9][0-9][0-9][A-Z]"))
			throw new CodigoIncorrectoException("Código inválido.");		
	}
	
	public ArrayList <Producto>dameProductos(){
		return sup;
	}
	
	
	
	
}