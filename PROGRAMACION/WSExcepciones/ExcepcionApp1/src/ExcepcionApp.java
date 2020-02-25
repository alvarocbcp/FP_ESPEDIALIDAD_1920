public class ExcepcionApp {
    public static void main(String[] args) {

        String str1="7";
	    String str2="0";
        String respuesta="";
	    int numerador, denominador, cociente;
        
        try {
            numerador=Integer.parseInt(str1);
            denominador=Integer.parseInt(str2);
            /* parseInt:
			public static int parseInt(String s)
                    throws NumberFormatException */
           	cociente=numerador/denominador;
            respuesta=String.valueOf(cociente);
            // valueOf obtiene la representación como String del parámetro 
            // entero
        } catch(NumberFormatException ex){
        	System.out.println("ex "+ ex.getMessage());
            respuesta="Se han introducido caracteres no numericos";
        } catch(ArithmeticException ex){
        	System.out.println("ex "+ ex.getMessage());
            respuesta="Division entre cero";
        }
        
        // Sale por el primer catch que se detecte y ya no entra por los demás
        System.out.println(respuesta);

        try {
			//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        } catch (Exception e) {  }// Obligatorio recoger la excepcion
    }
}

