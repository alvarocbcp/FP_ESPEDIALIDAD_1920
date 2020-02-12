package clases1;

import javax.swing.*;

public class CuentaBancariaMain {

	public static void main(String[] args) {
		
		Cuenta[] arrCuentas = new Cuenta[5];
		int nCuenta;
		double cantidad;
		boolean repetir = true;
		int opcion;
		
		do{			
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Crear una cuenta\n2. Sacar dinero\n3. Ingresar dinero\n4. Mostrar una cuenta\n5. Mostrar todas las cuentas"));
				
			}while(opcion>5 || opcion<1);
			
			switch(opcion) {
			case 1:
				double dinero = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Qué cantidad desea ingresar como cantidad inicial?"));
				arrCuentas[Cuenta.getContadorCuentas()] = new Cuenta(dinero);
				break;
			case 2:
				if(arrCuentas[0]==null) {
					JOptionPane.showMessageDialog(null, "No existe ninguna cuenta creada.");
				}
				else {
					do {
						nCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu numero de cuenta: "));
					}while(nCuenta<0 || nCuenta>4 || arrCuentas[nCuenta]==null);
					
					
					cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad a retirar: "));
					
					for(int i=0; i<arrCuentas.length; i++) {
						if(nCuenta == i) {
							arrCuentas[i].retirar(cantidad);
						}
					}
				}
				break;
			case 3:
				if(arrCuentas[0]==null) {
					JOptionPane.showMessageDialog(null, "No existe ninguna cuenta creada.");
				}
				else {
					do {
						nCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu numero de cuenta: "));
					}while(nCuenta<0 || nCuenta>4 || arrCuentas[nCuenta]==null);
					
					cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad a ingresar: "));
					
					for(int i=0; i<arrCuentas.length; i++) {
						if(nCuenta == i) {
							arrCuentas[i].ingresar(cantidad);
						}
					}
				}
				break;
			case 4:
				if(arrCuentas[0]==null) {
					JOptionPane.showMessageDialog(null, "No existe ninguna cuenta creada.");
				}
				else {
					do {
						nCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu numero de cuenta: "));
					}while(nCuenta<0 || nCuenta>4 || arrCuentas[nCuenta]==null);
					
					for(int i=0; i<arrCuentas.length; i++) {
						if(nCuenta == i) {
							JOptionPane.showMessageDialog(null, arrCuentas[i].mostrarCuenta());
						}
					}
				}
				break;
			case 5:
				int i=0;
				if(arrCuentas[0]==null) {
					JOptionPane.showMessageDialog(null, "No existe ninguna cuenta creada.");
				}
				else {
					while((i>=0 || i<arrCuentas.length) && arrCuentas[i]!=null) {
						JOptionPane.showMessageDialog(null, arrCuentas[i]);
						i++;
					}
				}
				break;					
			}
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?", "¿Continuar?", JOptionPane.YES_NO_OPTION);
			if(respuesta == JOptionPane.NO_OPTION) {
				repetir = false;
				JOptionPane.showMessageDialog(null, "¡Hasta pronto!");
			}
		}while(opcion<=5 && repetir);
	}

}
