package serializables1;

/*
 * Escribimos dos objetos en un fichero y a continuación los leemos.
 * No se vuelve a abrir para añadir más objetos
 * */
import java.io.*;
public class PruebaPersona {
	final static String NOM_FICH="datos.obj";
	public static void main(String[] args) {
		Persona p1=new Persona("Pablo", 20);
		Persona p2=new Persona("Rosa", 35);
		
		try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(NOM_FICH))){            			
			oos.writeObject(p1);
			oos.writeObject(p2);			
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
		
		try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(NOM_FICH))){ 
			p1=(Persona)ois.readObject();		              
			while(p1 != null){ 					
				System.out.println(p1);
				p1=(Persona)ois.readObject();
			}
		} catch (EOFException ex) {			
		} catch (IOException ex) {  
			System.out.println(ex);
		} catch (ClassNotFoundException ex) { 
			System.out.println(ex); 
		} 
	}
}

