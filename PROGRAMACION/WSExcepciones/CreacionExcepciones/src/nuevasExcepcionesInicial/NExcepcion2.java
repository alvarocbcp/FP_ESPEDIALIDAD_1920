package nuevasExcepcionesInicial;  

public class NExcepcion2 {  

     public static void main(String[] args) {  
          try {
               lanzaExcepcion();
          }
          catch(Exception e) {  
               System.out.println( "Dentro de catch");
               System.out.println( "\n\ne.getMessage(): " + e.getMessage());
               System.out.println( "\n\ne.toString(): " + e.toString());
               System.out.println( "\n\ne.printStackTrace():"); e.printStackTrace();
          }
     }
     
     public static void lanzaExcepcion() throws Exception {
     	throw new Exception("Mi nueva excepcion");
     }
}
