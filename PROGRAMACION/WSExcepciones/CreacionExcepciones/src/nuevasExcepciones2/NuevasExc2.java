package nuevasExcepciones2;

class Limites extends Exception {}
class DemasiadoCalor extends Limites {}
class DemasiadoCansado extends Limites {}

public class NuevasExc2 {
	
	public void lanza() throws Limites{
		int temp=41, dormir=7;
		
	        if( temp > 40 )
	            throw( new DemasiadoCalor() );
	            // Si se lanza esta, la otra ya no se lanza 
	        if( dormir < 8 ) {
	           	throw( new DemasiadoCansado() );
	        }	            
	}
	
	public static void main(String args[]) {
		
		NuevasExc2 nuevas = new NuevasExc2();

		try {
			nuevas.lanza();// Puede lanzar una excepcion
		} catch( Limites lim ) {
			if( lim instanceof DemasiadoCalor )
	            {
	            	System.out.println( "Capturada excesivo calor!" );      
	            }
	        if( lim instanceof DemasiadoCansado )
	            {
	            	System.out.println( "Capturada excesivo cansancio!" );
	            }	
		}	
	}
}
    
