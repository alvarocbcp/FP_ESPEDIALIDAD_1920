package arrayList;

import java.util.*;

public class Prueba {

	public static void main(String[] args) {
		
		ArrayList<String> paises = new ArrayList<String>();
		
		paises.add("España");  							// ASI SE AÑADEN DATOS AL ARRAYLIST
		paises.add("Francia");
		paises.add("Portugal");
		
		System.out.println(paises.get(0));				// ASI SE IMPRIME UNA POSICION DEL ARRAYLIST
		System.out.println(paises.get(1));
		System.out.println(paises.get(2));
		System.out.println();
		
		paises.add(1, "Italia"); 						// SOLO SE PUEDEN ESPECIFICAR POSCIONES EN POSICIONES DEL ARRAYLIST QUE YA ESTEN OCUPADAS, DESPLAZA LOS DEMAS DATOS A LA DERECHA
		
		for(int i=0; i<paises.size(); i++) {			// ASI SE RECORRE UN ARRAYLIST PARA IMPRIMIRLO
			System.out.println(paises.get(i));
		}
		System.out.println();
		
		paises.remove(2);								// ASI SE ELIMINA UN DATO EN LA POSICION EXPECIFICADA Y MUEVE LOS DEMAS DATOS A LA IZQUIERDA
		paises.remove("Portugal");						// TAMBIEN SE PUEDEN ELIMINAR DATOS ESCRIBIENDO SU NOMBRE EN LUGAR DE LA POSICION
		
		paises.add(1, "Italia");
		
		paises.set(1, "Alemania");						// ASI SE CAMBIA UN DATO POR OTRO EN UN ARRAYLIST
		
		String paisBuscado = "Francia";
		
		int pos = paises.indexOf(paisBuscado);
		
		if(pos!=-1) {
			System.out.println(paisBuscado + " encontrado en la posición " + pos);
		}
		else {
			System.out.println(paisBuscado + " no se ha encontrado");
		}
		
		System.out.println();
		System.out.println("Con for each");
		System.out.println();
		
		for(String pais: paises)
			System.out.println(pais);
		
		System.out.println();
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(24);
		numeros.add(32);
		numeros.add(45);
		
		Iterator<Integer> it = numeros.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
		
	}

}
