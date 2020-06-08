package gourmet;

import java.io.Serializable;

public class Producto implements Serializable{
	
	private static final long serialVersionUID = 48148874L;
	private int numProducto;
	private String descripcion;
	private int unidades;
	
	
	public Producto(int numProducto, String descripcion, int unidades) {
		super();
		this.numProducto = numProducto;
		this.descripcion = descripcion;
		this.unidades = unidades;
	}
	public int getNumProducto() {
		return numProducto;
	}
	public void setNumProducto(int numProducto) {
		this.numProducto = numProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	@Override
	public String toString() {
		return "Producto [numProducto=" + numProducto + ", descripcion=" + descripcion + ", unidades=" + unidades + "]";
	}
	
		
}
