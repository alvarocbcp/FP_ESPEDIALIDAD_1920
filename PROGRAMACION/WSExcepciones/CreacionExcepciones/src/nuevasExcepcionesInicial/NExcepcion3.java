package nuevasExcepcionesInicial;  

class nuevaExcepcion extends Exception {

	private static final long serialVersionUID = 6386963178772120771L;

	public nuevaExcepcion(String mensaje){
		super(mensaje);
	}
	// Como está en el mismo paquete puedo no poner modificador
}

public class NExcepcion3 {  

     public static void main(String[] args) {  
          try {
               lanzaExcepcion();
          }
          catch(Exception e){               
               System.out.println( "e.getMessage(): " + e.getMessage());
          }
     }
     
     public static void lanzaExcepcion() throws nuevaExcepcion {
     	throw new nuevaExcepcion("Mi nueva excepcion en una clase");
     }
}
