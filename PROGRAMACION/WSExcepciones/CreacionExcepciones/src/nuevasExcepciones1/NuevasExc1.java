package nuevasExcepciones1;

class Limites extends Exception {}
class DemasiadoCalor extends Limites {}
class DemasiadoCansado extends Limites {}

public class NuevasExc1 {
	public void lanza() /*throws Limites*/ {
		int temp=40, dormir=7;
		
		try {
	        if( temp > 40 ){
	        	System.out.println("Se lanza demasiado calor");
	        	throw( new DemasiadoCalor() );
	        }
	            
	         // Si se captura esta, se va y la otra no se captura
	        if( dormir < 8 ){
	        	System.out.println("Se lanza demasiado Cansado");
	        	throw( new DemasiadoCansado() );
	        }
	            
	    } catch( Limites lim ) {
	        if( lim instanceof DemasiadoCalor )
	            {
	            	System.out.println( "Capturada excesivo calor!" );
	            }
	        if( lim instanceof DemasiadoCansado )
	            {
	            	System.out.println( "Capturada excesivo cansancio!" );
	            }
	    } finally {
	    	System.out.println( "En la clausula finally " );		
	    }
	        	
	}
	
	public static void main(String args[]){	
		NuevasExc1 nuevas = new NuevasExc1();
		nuevas.lanza();	
	}
}

