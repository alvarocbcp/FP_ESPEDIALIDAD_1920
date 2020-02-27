package herencia;

import java.util.*;

public class CentrosMain {

	public static void main(String[] args) {
		
		Publico pu1 = new Publico("IES Severo Ochoa", "Ezcaray, 3", 18000);
		Privado pr1 = new Privado("Luyfe", "Junkal, 4", 30000);
		Concertado c1 = new Concertado("Colegio Chesterton", "Luxemburgo, 2", 25000);
		
		ArrayList<Centro> Centros = new ArrayList<Centro>();
		Centros.add(pu1);
		Centros.add(pr1);
		Centros.add(c1);
		
		
		Iterator<Centro> it = Centros.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			System.out.println();
		}
		
		
	}

}
