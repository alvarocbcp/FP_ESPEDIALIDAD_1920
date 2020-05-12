package lenguajes;
public enum Lenguajes{
    //Valores
    JAVA(4),
    PHP(2),
    C(5),
    PERL(6),
    RUBY(3),
    PYTHON(4);
 
    //Atributo
    int aniosAprendizaje ;
 
    //Constructor
    Lenguajes(int aniosAprendizaje){
        this.aniosAprendizaje=aniosAprendizaje;
    }
 
    //Metodo
    public int getAniosAprendizaje(){
        return aniosAprendizaje;
    }
 
}