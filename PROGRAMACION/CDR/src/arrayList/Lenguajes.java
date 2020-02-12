package arrayList;

import java.util.*;

public class Lenguajes {

	public static void main(String[] args) {

		String removeElem = "Perl";

		ArrayList<String> lenguajes = new ArrayList<String>();

		lenguajes.add("Java");
		lenguajes.add("Unix");
		lenguajes.add("Perl");
		lenguajes.add("Perl");
		lenguajes.add("Oracle");
		lenguajes.add("C++");
		lenguajes.add("Perl");
		lenguajes.add("Perl");

		System.out.println("*****ANTES DE BORRAR*****");
		System.out.println(lenguajes);

		Iterator<String> itr = lenguajes.iterator();
		while(itr.hasNext()) {
			if(removeElem.equals(itr.next())){
				itr.remove();
			}
		}

		System.out.println("*****DESPUES DE BORRAR*****");
		System.out.println(lenguajes);

	}

}
