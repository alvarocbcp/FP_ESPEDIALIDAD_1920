package clases3;

import javax.swing.JOptionPane;

public class PromedioMain {
	
	public static void main(String[] args) {
		
		int opcion;
		boolean repetir = true;
		int longitud;
		int contNumeros=0;
		
		longitud = Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos n�meros desea introducir?"));
		
		Promedio p1 = new Promedio(longitud);		
		
		if(longitud==0) {
			JOptionPane.showMessageDialog(null, "Gracias por no usar este servicio");
		}
		else {
			do {
				do {
					opcion = Integer.parseInt(JOptionPane.showInputDialog("1. A�adir un n�mero\n2. Mostrar n�meros a�adidos\n3. Calcular promedio\n4. Salir"));
				}while(opcion>4 || opcion<1);
				
				switch(opcion) {
				case 1:
					if(contNumeros >= longitud) {
						JOptionPane.showMessageDialog(null, "No se pueden introducir m�s n�meros");
					}
					else {
						int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero"));
						p1.agregarNumero(num);
					}
					contNumeros++;
					break;
				case 2:
					if(contNumeros == 0) {
						JOptionPane.showMessageDialog(null, "No ha introducido ning�n n�mero");
					}
					else {
						JOptionPane.showMessageDialog(null, p1);	
					}
					break;
				case 3:
					if(contNumeros == 0) {
						JOptionPane.showMessageDialog(null, "No ha introducido ning�n n�mero");
					}
					else {
						JOptionPane.showMessageDialog(null, p1.obtenerPromedio());
					}
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "�HASTA LUEGO!");
					repetir = false;
					break;
				}
			}while(opcion<=5 && repetir);
		}
				
	}

}
