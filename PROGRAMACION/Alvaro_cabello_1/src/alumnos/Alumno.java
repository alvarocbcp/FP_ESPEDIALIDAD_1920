package alumnos;

public class Alumno implements Comparable{
	private String nombreAl;
	private int contador;
	public Alumno(String nombre, int contador)
	{
		this.nombreAl = nombre;
		this.contador = contador;
	}
	public String getNombre()
	{
		return nombreAl;
	}
	public void setNombre(String palabra)
	{
		this.nombreAl = palabra;
	}
	public int getContador()
	{
		return contador;
	}
	public void setContador(int contador)
	{
		this.contador = contador;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombreAl + ", contador=" + contador + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		
		//return contador.compareTo(o.getContador());
		return 0;
	}
	
	

}
