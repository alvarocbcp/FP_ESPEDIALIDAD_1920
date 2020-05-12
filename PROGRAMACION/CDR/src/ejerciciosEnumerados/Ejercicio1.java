package ejerciciosEnumerados;

public class Ejercicio1 {
	 
    enum Animal {
        PERRO, GATO													
    };
 
    public static void main(String[] args) {
 
        Animal animal = Animal.valueOf(args[2]);					//Para que funcione correctamente el valueOf
        															//de args, debemos abrir lapestaña de run configuration
        switch (animal) {											//y agregar los datos PERRO y GATO a los argumentos del
         case PERRO:												//main, asi ya no nos dara error el programa.
            System.out.println("El perro ladra.");
            break;
         case GATO:
            System.out.println("El gato maulla.");
            break;
         default:
            System.out.println("No es un tipo aceptado.");
         }
     }
}

