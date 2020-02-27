package supermercado;
import productos.*;
import java.util.ArrayList;
import productos.Producto;

public class Carrito{	
	private ArrayList <Producto>lista;
	
	
	public Carrito(){
		lista = new ArrayList <Producto>();
	}
	
	public void compra(String codP, Supermercado s){
		
		boolean enc=false;
		
		for(int i=0; i<(s.dameProductos()).size(); i++){
			Producto p=(Producto)(s.dameProductos()).get(i);		
			if(p.dameCodigo().equals(codP)){
				enc = true;
				lista.add(p);
			}
		}
		if (!enc) System.out.println("El producto no existe.");
	}

	public void generarTicket (){
		System.out.println ("************* TICKET DE COMPRA **************");
		for (int i = 0 ; i < lista.size() ; i++){
			if (lista.get(i) instanceof Alimento)
				System.out.println ("* Producto alimenticio ");
			else if (lista.get(i) instanceof Textil)
				System.out.println ("* Producto textil ");
			else
				System.out.println ("* Producto de droguería ");
			System.out.println(lista.get(i));
		}	
		System.out.println ("*********************************************");
		System.out.println ("*\tPrecio total de la compra: "+ calcularImporte() + " euros.\t*");	
		System.out.println ("*********************************************");
	}
	
	public float calcularImporte (){
		float precio_total= 0;
		for (int i = 0 ; i < lista.size() ; i++){
			precio_total = precio_total + lista.get(i).damePrecio();
		}
		return precio_total;
	}
	
	public boolean esVacio(){
		if (lista.size() == 0) return true;
		else return false;
	}
}