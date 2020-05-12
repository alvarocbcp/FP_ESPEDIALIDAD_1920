package madera;

public class Test1 {

    public static void main (String[ ] Args) {

        TipoDeMadera miTipoDeMadera = TipoDeMadera.CAOBA;    //El tipo lo definimos en otra clase como public enum
        System.out.println(miTipoDeMadera.toString());  
        
        System.out.println ("Los posibles tipos de madera son: ");

        for (TipoDeMadera tmp: TipoDeMadera.values() ) {
        	
            System.out.print(tmp.toString()+"\t");  
        }  

    } //Cierre del main

} //Cierre de la clase
