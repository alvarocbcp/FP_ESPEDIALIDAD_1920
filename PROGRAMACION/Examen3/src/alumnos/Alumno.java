package alumnos;

import java.io.Serializable;

public class Alumno implements Serializable
{
	private static final long serialVersionUID = 1L;
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
		
}
