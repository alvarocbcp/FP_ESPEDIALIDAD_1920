Proceso ejercicio_17
	Definir num1, num2, num3, producto, suma como reales;
	
	Escribir "Introduzca el primer n�mero:";
	Leer num1;
	
	Escribir "Introduzca el segundo n�mero:";
	Leer num2;
	
	Escribir "Introduzca el tercer n�mero:";
	Leer num3;
	
	producto <- num1 * num2 * num3;
	suma <- num1 + num2 + num3;
	
	Si num1 < 0 Entonces
		Escribir "El producto es: ", producto;
	SiNo
		Escribir "La suma es: ", suma;
	FinSi
	
FinProceso
