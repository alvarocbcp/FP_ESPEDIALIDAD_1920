Proceso ejercicio_16
	Definir num1, num2, num3 como reales;
	
	Escribir "Introduzca el primer n�mero:";
	Leer num1;
	
	Escribir "Introduzca el segundo n�mero:";
	Leer num2;
	
	Escribir "Introduzca el tercer n�mero:";
	Leer num3;
	
	Si (num1 > num2 & num1 > num3)  Entonces
		Escribir "El n�mero mayor es ", num1;
	SiNo
		Si num2 > num3 Entonces
			Escribir "El n�mero mayor es ", num2;
		SiNo
			Escribir "El n�mero mayor es ", num3;
		FinSi
	FinSi
	
FinProceso
