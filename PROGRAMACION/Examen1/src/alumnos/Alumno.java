package alumnos;
public class Alumno implements Comparable<Alumno>
{
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
	public int compareTo(Alumno al) {
		if(this.getContador() < al.getContador()) {
			return 1;
		}
		else if(this.getContador() > al.getContador()) {
			return -1;
		}
		else {
			return 0;
		}
	}
		
}