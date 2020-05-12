package serializablesError;

/*
 * Escribimos dos objetos en un fichero y a continuación los leemos.
 * Creamos un par de objetos más y los añadimos al fichero. Vemos que da error 
 * al leer el fichero de nuevo:
 * java.io.StreamCorruptedException: invalid type code: AC
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

			try{                 
				while(true){ 
					p1=(Persona)ois.readObject();
					System.out.println(p1);
				}
			} catch(EOFException e){ } 
			ois.close(); 
			
		} catch (IOException ex) {  
			System.out.println(ex);
		} catch (ClassNotFoundException ex) { 
			System.out.println(ex); 
		}
		
		p1=new Persona("Lola", 5);
		p2=new Persona("Pepe", 45);
		
		try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(NOM_FICH, true))){            			
			oos.writeObject(p1);
			oos.writeObject(p2);
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
		
		try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(NOM_FICH))){

			try{                 
				while(true){ 
					p1=(Persona)ois.readObject();
					System.out.println(p1);
				}
			} catch(EOFException e){ } 
			 
		} catch (IOException ex) {  
			System.out.println(ex);
		} catch (ClassNotFoundException ex) { 
			System.out.println(ex); 
		} 
	}
}