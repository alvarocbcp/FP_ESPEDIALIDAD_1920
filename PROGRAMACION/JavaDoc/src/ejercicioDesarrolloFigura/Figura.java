package ejercicioDesarrolloFigura;

/**
 * La clase Figura permite crear objetos de tipo figura
 * @author Alvaro
 * @version 18/03/2020
 */
public class Figura 
{
	private String forma;
	private String color;
	private static final String ListaColores[] = {"rojo", "anaranjado", "amarillo", "verde", "azul",
			"violeta","rosa", "negro", "blanco", "oro", "plata", "bronce"};

	/**
	 * Constructor vacio de la clase Figura.
	 * Permite crear una figura sin datos.
	 */
	public Figura()
	{

	}
	
	/**
	 * Este constructor permite crear una figura
	 * con forma y color(String).
	 * @param forma String forma de la figura.
	 * @param color String color de la figura.
	 */
	public Figura(String forma, String color)
	{
		this.forma ="";
		this.color ="";
	}
	
	/**
	 *  Este constructor permite crear una figura
	 * con forma y color(int).
	 * 
	 * @param forma String forma de la figura.
	 * @param color int color de la figura.
	 */
	public Figura(String forma, int color)
	{
		this.forma = forma;		
	}
	
	/**
	 * Devuelve la forma de la figura.
	 * @return forma. Devuelve la forma de la figura.
	 */
	public String getForma() 
	{
		return forma;
	}
	
	/**
	 * Permite establecer la forma de la figura.
	 * @param forma. Establece la forma de la figura.
	 */
	public void setForma(String forma) 
	{
		this.forma = forma;
	}
	
	/**
	 * Devuelve el color de la figura.
	 * @return color. Devuelve el color de la figura.
	 */
	public String getColor() 
	{
		return color;
	}

	/**
	 * Comprueba que el color sea un color valido.
	 * @param color. Color de la figura.
	 * @return boolean, true si el color existe, false si el color no existe.
	 */
	public static boolean validColor(int color)
	{
		return color > 0  && color < ListaColores.length;
	}

	/**
	 * El metodo comprueba si el color esta en el array de colores.
	 * @param color. Color de la figura.
	 * @return boolean, true si el color esta en el array, false si no lo esta.
	 */
	public static boolean  validColor(String color)
	{
		boolean isValid = false;
		for (int i = 0; i < ListaColores.length && !isValid; i++) 
		{
			isValid = ListaColores[i] == color;
		}
		return isValid;
	}
	
	/**
	 * Establece el color de la figura si lo pasamos como un String.
	 * @param color. Color de la figura.
	 */
	public void setColor(String color) 
	{
		if (validColor(color)) 
		{
			this.color = color;	
		}

	}
	
	/**
	 * Establece el color de la figura si lo pasamos como un int.
	 * @param color. Color de la figura.
	 */
	public void setColor(int color) 
	{
		if(validColor(color))
		{
			this.color = colorToColor(color);
		}
	}
	
	/**
	 * El metodo devuelve la posicion de un color
	 * dentro del array de colores.
	 * @param colo. Color de la figura.
	 * @return int la posicion del array asociada al color.
	 */
	private int colorToColor(String color)
	{
		int posicion = -1;
		for (int i = 0; i < ListaColores.length && posicion != -1; i++) 
		{
			if (ListaColores[i] == color)
			{
				posicion = i;
			}
		}
		return posicion;
	}

	/**
	 * Devuelve el color en funcion de la posicion
	 * dentro del array de colores.
	 * @param colo. Color de la figura.
	 * @return String el color asociado a la posicion
	 * del array que le hemos pasado como int.
	 */
	private String colorToColor(int color)
	{
		return color > 0 && color < ListaColores.length ? ListaColores[color]: "";
	}
}
