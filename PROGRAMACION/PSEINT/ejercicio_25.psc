Proceso ejercicio_25
	Definir n, contador, resultado como real;
	
	Escribir "Introduce el número hasta el que desea sumar:";
	Leer n;
	
	contador <- 1;
	resultado <- 0;
	
	Mientras contador <= n Hacer
		resultado <- resultado + contador;
		contador <- contador + 1;
	FinMientras
	
	Escribir resultado;
	
FinProceso
