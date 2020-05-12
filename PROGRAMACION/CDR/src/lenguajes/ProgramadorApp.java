package lenguajes;
public class ProgramadorApp {
 
	public static void main(String[] args) {
		 
        //Array de Programadores
        Programador programadores[]=new Programador[3];
        programadores[0]=new Programador("Fernando", 23, Lenguajes.JAVA);
        programadores[1]=new Programador("Alberto", 27, Lenguajes.PHP);
        programadores[2]=new Programador("Sergio", 30, Lenguajes.PYTHON);
 
        int cuentaAniosAprendizaje=0;
 
        for(int i=0;i<programadores.length;i++) {
            //Invoco el lenguaje de programacion y a partir de este, el numero de años de aprendizaje
            cuentaAniosAprendizaje += programadores[i].getExpertoEn().getAniosAprendizaje();
        }
 
        System.out.println("La suma de los años de aprendizaje de los programadores es de "+cuentaAniosAprendizaje);
    }
 
}