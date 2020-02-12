Proceso ejercicio_12
	Definir num1, num2 como reales;
	
	Escribir "Introduce el primer número:";
	Leer num1;
	
	Escribir "Introduce el segundo número:";
	Leer num2;
	
	Si num1 > num2 Entonces
		Escribir num1, " es el mayor.";
	SiNo
		Si num1 < num2 Entonces
			Escribir num2, " es el mayor.";
		SiNo
			Escribir num1, " y ", num2, " son iguales.";
		FinSi
	FinSi
FinProceso
