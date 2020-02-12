package PrimeraEvaluacion;

public class Split {

	public static void main(String[] args) {
		String[][] a = new String[4][4];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j] = Integer.toString((int) (Math.random()*10));
			}
		}
		
		String cadena = "";
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				cadena = cadena + a[i][j];
			}
			if(i==a.length) {
				cadena = cadena +"";
			}
			else {
				cadena = cadena + " ";
			}
		}
		System.out.println(cadena);
		System.out.println();
		
		String[] strArray = cadena.split(" ");
		
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		System.out.println(strArray[2]);
		System.out.println(strArray[3]);
		
	}

}
