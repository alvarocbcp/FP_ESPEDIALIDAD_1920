package clases1;

public class SerHumanoMain {

	public static void main(String[] args) {
		
		SerHumano sh1=new SerHumano();
		sh1.nombre="Jesus";
		sh1.colorOjos="azules";
		sh1.edad=28;
		sh1.mostrarCaracteristicas();
		sh1.esMayorEdad();
		
		System.out.println("---------------------");
		
		SerHumano sh2=new SerHumano();
		sh2.nombre="Rebeca";
		sh2.colorOjos="verdes";
		sh2.edad=27;
		sh2.mostrarCaracteristicas();
		sh2.esMayorEdad();
		System.out.println("---------------------");
		
		SerHumano.planeta = "Marte";
		
		sh1.mostrarCaracteristicas();
		System.out.println("---------------------");
		sh2.mostrarCaracteristicas();
		
		System.out.println("---------------------");
		System.out.println("FIN DEL PROGRAMA");


	}

}
