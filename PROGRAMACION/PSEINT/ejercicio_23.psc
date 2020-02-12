Proceso ejemplo_23
	
	Definir num como real;
	
	Repetir
		Escribir "Introduce el número:";
		Leer num;
	Hasta Que num > 0
	
	Si num = 0 Entonces
		Escribir "El número no es ni par ni impar.";
	SiNo
		Si (num % 2) = 0 Entonces
			Escribir "El número es par.";
		SiNo
			Escribir "El número es impar.";
		FinSi
	FinSi
	
FinProceso
