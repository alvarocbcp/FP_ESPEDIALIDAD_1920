Proceso ejercicio_18
	Definir num, raiz_cuadrada, potencia como reales;
	
	Escribir "Introduce el número:";
	Leer num;
	
	//Si el número es mayor que 0, escribe su potencia y su raíz cuadrada
	//Sino muestra un mensaje de error y sale del programa
	
	potencia <- num ^ 2;
	raiz_cuadrada <- rc(num);
	
	Si num < 0 o num = 0 Entonces
		Escribir "Error!";
	SiNo
		Escribir "Del número ",num , ", su potencia es ",potencia, " y su raíz ", raiz_cuadrada, ".";
	FinSi
FinProceso
