Proceso ejercicio_18
	Definir num, raiz_cuadrada, potencia como reales;
	
	Escribir "Introduce el n�mero:";
	Leer num;
	
	//Si el n�mero es mayor que 0, escribe su potencia y su ra�z cuadrada
	//Sino muestra un mensaje de error y sale del programa
	
	potencia <- num ^ 2;
	raiz_cuadrada <- rc(num);
	
	Si num < 0 o num = 0 Entonces
		Escribir "Error!";
	SiNo
		Escribir "Del n�mero ",num , ", su potencia es ",potencia, " y su ra�z ", raiz_cuadrada, ".";
	FinSi
FinProceso
