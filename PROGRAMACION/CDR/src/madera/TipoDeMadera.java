package madera;

public enum TipoDeMadera {
	// Clase que contiene los tipos de madera que usa la empresa, su color y su peso espec�fico en kg/m3

	    ROBLE ("Casta�o verdoso", 800), //Separamos con comas

	    CAOBA ("Marr�n oscuro", 770),

	    NOGAL("Marr�n rojizo", 820),

	    CEREZO ("Marr�n cereza", 790),

	    BOJ ("Marr�n negruzco", 675);  //Cuando terminamos cerramos con ; 

	    //Campos tipo constante   

	    private final String color; //Color de la madera

	    private final int pesoEspecifico; //Peso espec�fico de la madera 

	    /**

	     * Constructor. Al asignarle uno de los valores posibles a una variable del tipo enumerado el constructor asigna 

	        autom�ticamente valores de los campos

	     */ 

	    TipoDeMadera (String color, int pesoEspecifico) { 

	        this.color = color;

	        this.pesoEspecifico = pesoEspecifico;

	    } //Cierre del constructor

	 

	    //M�todos de la clase tipo Enum

	    public String getColor() { return color; }

	    public int getPesoEspecifico() { return pesoEspecifico; }

}
