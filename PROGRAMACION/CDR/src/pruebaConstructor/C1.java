package pruebaConstructor;

enum Color{
	 
    // Enums
    ROJO("Rojo", 3), AZUL("Azul", 5);

    // Atributos
     private String nombreColor;
       private int numColor;
       public int contador=0;

    // Constructor
       Color(String nom, int col) {

              this.nombreColor = nom;
        this.numColor = col;
        this.contador ++;

        System.out.println(this.nombreColor + " - " + this.numColor + " - " + this.contador);
        // Rojo - 3 - 1
        // Azul - 5 - 1
    }
}

public class C1{

   public static void main(String[] args){

        //System.out.println("Inicializando: " + Color.ROJO);
        // ROJO
        // Se inicializan todas las instancias. 
        Color c1;
        
        c1 = Color.AZUL;
        
        System.out.println("Inicializando: " + c1);
        
        Color c2;
        
        c2 = Color.ROJO;
        
        System.out.println("Inicializando: " + c2);
   }

}
