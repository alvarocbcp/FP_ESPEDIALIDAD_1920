Proceso ejercicio_17
	Definir num1, num2, num3, producto, suma como reales;
	
	Escribir "Introduzca el primer número:";
	Leer num1;
	
	Escribir "Introduzca el segundo número:";
	Leer num2;
	
	Escribir "Introduzca el tercer número:";
	Leer num3;
	
	producto <- num1 * num2 * num3;
	suma <- num1 + num2 + num3;
	
	Si num1 < 0 Entonces
		Escribir "El producto es: ", producto;
	SiNo
		Escribir "La suma es: ", suma;
	FinSi
	
FinProceso
