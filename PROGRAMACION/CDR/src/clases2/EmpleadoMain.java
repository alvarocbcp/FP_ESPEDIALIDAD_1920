package clases2;

import javax.swing.JOptionPane;

public class EmpleadoMain {

	public static void main(String[] args) {
		
		int plus = 50;
		int contPlus=0;
		int contNoPlus=0;
		int j=0;
		int k=0;
		
		int nEmpleados = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos empleados desea crear?"));
		
		Empleado[] arrEmpleados= new Empleado[nEmpleados];
		
		for(int i=0; i<arrEmpleados.length; i++) {
			String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado " + (i+1));
			String apellido = JOptionPane.showInputDialog("Introduce el apellido del empleado " + (i+1));
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del empleado " + (i+1)));
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Introduce el salario del empleado " + (i+1)));
			
			arrEmpleados[i] = new Empleado(nombre, apellido, edad, salario);
		}
		
		for(int i=0; i<arrEmpleados.length; i++) { 
			if(arrEmpleados[i].getEdad()>=40) {
				arrEmpleados[i].setSalario(arrEmpleados[i].getSalario() + plus);
				contPlus++;
			}
			else {
				contNoPlus++;
			}
		}
		
		Empleado[] arrEmpleadosPlus = new Empleado[contPlus];
		Empleado[] arrEmpleadosNoPlus = new Empleado[contNoPlus];
		
		for(int i=0; i<arrEmpleados.length; i++) {
			if(arrEmpleados[i].getEdad()>=40) {
				arrEmpleadosPlus[j] = arrEmpleados[i];
				j++;
			}
			else {
				arrEmpleadosNoPlus[k] = arrEmpleados[i];
				k++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Empleados a los que se les ha añadido el plus");
		
		for(int i=0; i<arrEmpleadosPlus.length; i++) {
			JOptionPane.showMessageDialog(null, arrEmpleadosPlus[i].getNombre() + "\n" + arrEmpleadosPlus[i].getApellido());
		}
		
		JOptionPane.showMessageDialog(null, "Empleados a los que no se les ha añadido el plus");
		
		for(int i=0; i<arrEmpleadosNoPlus.length; i++) {
			JOptionPane.showMessageDialog(null, arrEmpleadosNoPlus[i].getNombre() + "\n" + arrEmpleadosNoPlus[i].getApellido());
		}
		
		

	}

}
