package enumPrecio2;

public class Main {

	public static void main(String args[]) {
				
		Precio precio = Precio.CARO;
		
		System.out.println ("un precio " + precio + " esta entre " + 
		   precio.getPrecioMinimo() + " y " + 
		   precio.getPrecioMaximo());	
	}

}