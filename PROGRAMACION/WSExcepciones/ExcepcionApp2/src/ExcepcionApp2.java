import excepcion.*;

public class ExcepcionApp2 {
	public static void main(String[] args) {
        String str1="100";// Si pongo "1a2" no saltaría nuestra excepción, sino NumberFormatException
	    String str2="-6";
        String respuesta;
	    int numerador, denominador, cociente;
        
        try{
            numerador=Integer.parseInt(str1);
            denominador=Integer.parseInt(str2);
            // Introducimos una función nueva respecto al anterior
            rango(numerador, denominador);
            cociente=numerador/denominador;
            respuesta=String.valueOf(cociente);
        }catch(NumberFormatException ex){
            respuesta="Se han introducido caracteres no numéricos";
        }catch(ArithmeticException ex){
            respuesta="División entre cero";
        }catch(ExcepcionIntervalo ex){
            respuesta=ex.getMessage();
        }
        // Hemos puesto una excepción más (ExcepcionIntervalo) que el caso anterior
        System.out.println(respuesta);
    }
    
    static void rango(int num, int den) throws ExcepcionIntervalo{
        if((den<-5)||(num>100)){
            throw new ExcepcionIntervalo("Números fuera del intervalo");
        }
    }
}
