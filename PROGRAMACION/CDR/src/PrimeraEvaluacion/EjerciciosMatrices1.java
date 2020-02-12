package PrimeraEvaluacion;

public class EjerciciosMatrices1 {

	public static void main(String[] args) {

		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio5();
		//ejercicio6();
		//ejercicio7();
		//ejercicio8();
		//ejercicio9();
	}

	public static void ejercicio1() {
		System.out.println("Matriz 1: ");
		int[][] mat1 = creaMatriz4x4();
		muestraMatriz(mat1);
		System.out.println();
		System.out.println("Matriz 2: ");
		int[][] mat2 = creaMatriz4x4();
		muestraMatriz(mat2);
		System.out.println();
		System.out.println("Suma de las matrices: ");
		int[][] mat3 = sumaMatriz(mat1, mat2);
		muestraMatriz(mat3);

	}

	public static void ejercicio2() {
		int[][] m = creaMatriz5x4();
		int n = (int) (Math.random()*10);
		boolean coincide = false;
		System.out.println("Matriz: ");
		muestraMatriz(m);
		System.out.println("Numero aleatorio: " + n);

		int i=0, j=0;

		for(i=0; i<m.length; i++) {
			while(j<m[i].length && !coincide) {
				if (m[i][j] == n) {
					System.out.println("La primera ocurrencia se encuentra en la posición " + (i+1) + "x" + (j+1));
					coincide = true;
				}
				else {
					coincide = false;
				}
				j++;
			}
		}
		
		if(coincide == false) {
			System.out.println("El número no está en la matriz.");
		}


	}
	
	public static void ejercicio3() {
		
		int[][] m1 = new int[8][8];
		
		int[][] m2 = new int[m1.length][m1.length];
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				m1[i][j] = (int) (Math.random()*10);
			}
		}
		
		System.out.println("MATRIZ ORIGINAL:");
		muestraMatriz(m1);
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[i].length; j++) {
				m2[i][j] = m1[i][j];
			}
		}
		
		System.out.println();
		System.out.println("MATRIZ COPIA:");
		muestraMatriz(m2);
	}
	
	public static void ejercicio4() {
		// echo en el ejemplo de calse
	}
	
	public static void ejercicio5() {
		
		int[][] matriz = new int[5][5];
		int cont = 0;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random()*100+1);
			}
		}
		
		System.out.println("Matriz inicial: ");
		muestraMatriz(matriz);
		System.out.println();
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(j>i) {
					matriz[i][j] = (int) Math.pow(matriz[i][j], 2);
				}
				else if(j==i) {
					matriz[i][j] = matriz[i][j] + 1;
				}
				else if(j<i) {
					cont = cont + matriz[i][j];
				}
			}
		}
		
		System.out.println("Matriz 3 condiciones: ");
		muestraMatriz(matriz);
		System.out.println("Suma de los números inferiores de la diagonal principal: " + cont);
		System.out.println();
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(j+i==matriz.length-1) {
					matriz[i][j] = matriz[i][j] * 2;
				}
			}
		}
		
		System.out.println("Matriz condicion final: ");
		muestraMatriz(matriz);
		System.out.println();
	}
	
	public static void ejercicio6() {
		int[][] matriz = new int[4][5];
		int[] sumaColumnas = new int[5];
		int contFilas = 0;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random()*10);
			}
		}
		
		System.out.println("ARRAY INICIAL:");
		muestraMatriz(matriz);
		System.out.println();
		
		System.out.println("ARRAY FINAL:");
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(j==matriz.length) {
					contFilas = contFilas + matriz[i][j];
					System.out.print(matriz[i][j] + "\t" + contFilas);
				}
				else {
					contFilas = contFilas + matriz[i][j];
					System.out.print(matriz[i][j] + "\t");
				}
				sumaColumnas[j] = sumaColumnas[j] + matriz[i][j];
			}
			contFilas = 0;
			System.out.println();
		}
		for(int i=0; i<sumaColumnas.length; i++) {
			System.out.print(sumaColumnas[i] + "\t");
		}
		
		
	}
	
	public static void ejercicio7() {
		int[][] matriz = new int[4][4];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random()*10);
			}
		}
		
		System.out.println("Matriz inicial: ");
		muestraMatriz(matriz);
		System.out.println();
		System.out.println("Matriz traspuesta 1:");
		trasponer1(matriz);
		System.out.println();
		System.out.println("Matriz traspuesta 2:");
		trasponer2(matriz);
		
	}
	
	public static void ejercicio8() {
		String[] nombres = {"Alvaro", "Pablo", "Adrian"};
		String[] apellido1 = {"Cabello", "Herran", "Morante"};
		String[] apellido2 = {"Benito", "Castrillo", "Molina"};
		
		String[] nombresCompletos = new String[nombres.length];
		String[][] matrizNombres = new String[3][nombres.length];
		
		for(int i=0; i<nombresCompletos.length; i++) {
			nombresCompletos[i] = nombres[i] + " " + apellido1[i] + " " + apellido2[i];
		}
		
		for(int i=0; i<nombresCompletos.length; i++) {
			System.out.print(nombresCompletos[i] + "\t");
		}
		System.out.println();
		System.out.println();
		
		for(int i=0; i<matrizNombres.length; i++) {
			for (int j=0; j<matrizNombres[i].length; j++) {
				if(i==0) {
					matrizNombres[i][j] = nombres[j];
				}
				if(i==1) {
					matrizNombres[i][j] = apellido1[j];
				}
				if(i==2) {
					matrizNombres[i][j] = apellido2[j];
				}
			}
		}
		
		for(int i=0; i<matrizNombres.length; i++) {
			for (int j=0; j<matrizNombres[i].length; j++) {
				System.out.printf("%-15s", matrizNombres[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	public static void ejercicio9() {
		int[][] matrizEquipos = new int[6][4];
		int contFilas = 0;
		int masAlto = 0;
		double[] arrayMedias = new double[matrizEquipos.length];
		int[] arrayAltos = new int[matrizEquipos.length];
		
		for(int i=0; i<matrizEquipos.length; i++) {
			for(int j=0; j<matrizEquipos[i].length; j++) {
				matrizEquipos[i][j] = (int) (Math.random()*70+150);
			}
		}
		System.out.println("***** EQUIPOS Y ALTURAS *****");
		muestraMatriz(matrizEquipos);
		System.out.println();
		
		for(int i=0; i<matrizEquipos.length; i++) {
			for(int j=0; j<matrizEquipos[i].length; j++) {
				if(j==matrizEquipos[i].length-1) {
					contFilas = contFilas + matrizEquipos[i][j];
					arrayMedias[i] = (double)contFilas/matrizEquipos[i].length;
					if(matrizEquipos[i][j]>masAlto) {
						masAlto = matrizEquipos[i][j];
					}
					arrayAltos[i] = masAlto;
					}
				else {
					contFilas = contFilas + matrizEquipos[i][j];
					if(matrizEquipos[i][j]>masAlto) {
						masAlto = matrizEquipos[i][j];
					}
				}
			}
			contFilas = 0;
			masAlto = 0;
		}
		
		System.out.println("***** ARRAY ALTURAS MEDIAS *****");
		for(int i=0; i<arrayMedias.length; i++) {
			System.out.print(arrayMedias[i] + "\t");
		}
		System.out.println();
		
		System.out.println("\n***** ARRAY MAS ALTOS *****");
		for(int i=0; i<arrayAltos.length; i++) {
			System.out.print(arrayAltos[i] + "\t");
		}
		
	}
	
	//***** METODOS AUXILIARES *****

	public static int[][] creaMatriz4x4(){
		int[][] m = new int[4][4];

		for(int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				m[i][j] = (int) (Math.random()*10);
			}
		}
		return m;
	}

	public static int[][] creaMatriz5x4(){
		int[][] m = new int[5][4];

		for(int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				m[i][j] = (int) (Math.random()*10);
			}
		}
		return m;
	}

	public static void muestraMatriz(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				System.out.printf("%-5s", m[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] sumaMatriz(int[][] a, int[][] b) {
		int[][] mat3 = new int[4][4];

		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				mat3[i][j] = a[i][j] + b[i][j];
			}
		}
		return mat3;
	}
	
	public static void trasponer1(int[][] m){
		int aux;
		for(int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				if(i>j) {
					aux = m[i][j];
					m[i][j] = m[j][i];
					m[j][i] = aux;
				}
			}
		}
		muestraMatriz(m);
	}
	
	public static void trasponer2(int[][] m) {
		int[][] aux = new int[m[0].length][m.length];
		
		for(int i=0; i<aux.length; i++) {
			for (int j=0; j<aux[i].length; j++) {
				aux[j][i] = m[i][j];
			}
		}
		muestraMatriz(aux);
	}

}
