package clases2;

import javax.swing.JOptionPane;

public class Libro {
	
	private String titulo;
	private String autor;
	private int ejemplares;
	private int ejemplaresPrestados;
	
	public Libro() {}
	
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
		
	}
	
	public void prestamo() {
		if(getEjemplares() == 0) {
			JOptionPane.showMessageDialog(null, "No disponemos de ejemplares.\nTitulo: " + titulo + "\nAutor: " + autor);
		}
		else {
			JOptionPane.showMessageDialog(null, "¡¡¡Aquí tiene su libro!!!\nTitulo: " + titulo + "\nAutor: " + autor);
			ejemplaresPrestados++;
			ejemplares--;
		}
	}
	
	public void devolucion() {
		if(getEjemplaresPrestados() == 0) {
			JOptionPane.showMessageDialog(null, "Ese libro no ha sido prestado.\nTitulo: " + titulo + "\nAutor: " + autor);
		}
		else {
			JOptionPane.showMessageDialog(null, "¡¡¡Gracias por su devolución!!!\nTitulo: " + titulo + "\nAutor: " + autor);
			ejemplaresPrestados--;
			ejemplares++;
		}
	}
	
	public String toString() {
		String cad="Titulo: " + titulo + "\nAutor: " + autor + "\nEjemplares: " + ejemplares + "\nEjemplares prestados: " + ejemplaresPrestados;
		return cad;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String setTitulo(String titulo) {
		return this.titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String setAutor(String autor) {
		return this.autor;
	}
	
	public int getEjemplares() {
		return ejemplares;
	}
	
	public int setEjemplares(int ejemplares) {
		return this.ejemplares;
	}
	
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}
	
	public int setEjemplaresPrestados(int ejemplaresPrestados) {
		return this.ejemplaresPrestados;
	}
}
