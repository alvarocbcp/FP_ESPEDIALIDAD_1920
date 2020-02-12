Proceso ejercicio_26
	Definir n, contador, resultado como real;
	
	Escribir "Introduce el número:";
	Leer n;
	
	contador <- 0;
	resultado <- 0;
	
	Mientras contador <= n*2 Hacer
		resultado <- resultado + contador;
		contador <- contador + 2;
	FinMientras
	
	Escribir resultado;
	
FinProceso
