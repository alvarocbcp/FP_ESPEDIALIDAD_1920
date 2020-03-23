package clases1;

import java.util.ArrayList;
import javax.swing.*;

class ExcSaldoInsuf extends Exception {
	private static final long serialVersionUID = 1L;
	public ExcSaldoInsuf (String msg) {
		super(msg);
	}
	
}

public class CuentaBancariaMain {

	public static void main(String[] args) {
		
		ArrayList<Cuenta> arrCuentas = new ArrayList<Cuenta>();
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
				Cuenta cont = new Cuenta(dinero);
				arrCuentas.add(cont);
				break;
			case 2:
				if(arrCuentas.size()==0) {
					JOptionPane.showMessageDialog(null, "No existe ninguna cuenta creada.");
				}
				else {
					do {
						nCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu numero de cuenta: "));
					}while(nCuenta<0 || nCuenta>arrCuentas.size() || arrCuentas.get(nCuenta)==null);
					
					
					cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad a retirar: "));
					
					for(int i=0; i<arrCuentas.size(); i++) {
						if(nCuenta == i) {
							try {
								arrCuentas.get(i).retirar(cantidad);
							}
							catch(Exception e){
								JOptionPane.showMessageDialog(null, e.getMessage());
							}
						}
					}
				}
				break;
			case 3:
				if(arrCuentas.size()==0) {
					JOptionPane.showMessageDialog(null, "No existe ninguna cuenta creada.");
				}
				else {
					do {
						nCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu numero de cuenta: "));
					}while(nCuenta<0 || nCuenta>arrCuentas.size() || arrCuentas.get(nCuenta)==null);
					
					cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad a ingresar: "));
					
					for(int i=0; i<arrCuentas.size(); i++) {
						if(nCuenta == i) {
							arrCuentas.get(i).ingresar(cantidad);
						}
					}
				}
				break;
			case 4:
				if(arrCuentas.size()==0) {
					JOptionPane.showMessageDialog(null, "No existe ninguna cuenta creada.");
				}
				else {
					do {
						nCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu numero de cuenta: "));
					}while(nCuenta<0 || nCuenta>arrCuentas.size() || arrCuentas.get(nCuenta)==null);
					
					for(int i=0; i<arrCuentas.size(); i++) {
						if(nCuenta == i) {
							JOptionPane.showMessageDialog(null, arrCuentas.get(i).mostrarCuenta());
						}
					}
				}
				break;
			case 5:
				int i=0;
				if(arrCuentas.size()==0) {
					JOptionPane.showMessageDialog(null, "No existe ninguna cuenta creada.");
				}
				else {
					while((i>=0 || i<arrCuentas.size()) && arrCuentas.get(i)!=null) {
						JOptionPane.showMessageDialog(null, arrCuentas.get(i));
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
