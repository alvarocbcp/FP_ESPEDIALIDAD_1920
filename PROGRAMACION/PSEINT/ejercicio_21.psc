Proceso ejercicio_21
	Definir num como real;
	
	Escribir "Introduce el n�mero:";
	Leer num;
	
	Si num = 0 Entonces
		Escribir "El n�mero no es ni par ni impar.";
	SiNo
		Si (num % 2) = 0 Entonces
			Escribir "El n�mero es par.";
		SiNo
			Escribir "El n�mero es impar.";
		FinSi
	FinSi
	
FinProceso
