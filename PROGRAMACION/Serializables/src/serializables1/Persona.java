package serializables1;

import java.io.*;
public class Persona implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int edad;
  
  public Persona(String n,int e) {
	nombre=n;
	edad=e; 
  }
  
  void cambiarEdad(int e){
		edad=e;           
  }
  
  int devolverEdad(){
		return edad;           
  }
  
  void cambiarNombre(String nom){
		nombre=nom;           
  }
	
  String devolverNombre(){
		return nombre;           
  }  
  
  public String toString (){ 
		return "Nombre "+nombre+" Edad "+edad;  
  } 

}

