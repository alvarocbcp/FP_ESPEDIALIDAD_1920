package clases3;

public class Promedio {
	
	private int[] numero;
	private int cont=0;
	
	
	public Promedio(int num) {
		numero = new int[num];
	}
	
	public void agregarNumero(int n) {
		numero[cont] = n;
		cont++;
	}
	
	public double obtenerPromedio() {
		double resultado = 0;
		for(int i=0; i<cont; i++) {
			resultado = resultado + numero[i];
		}
		
		resultado = resultado/cont;
		return resultado;
	}
	
	public String toString() {
		String str = "";
		for(int i=0; i<cont; i++) {
			str = str + numero[i] + " ";
		}
		return str;
	}

}
