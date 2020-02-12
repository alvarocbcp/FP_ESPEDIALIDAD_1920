Proceso ejercicio_21
	Definir num como real;
	
	Escribir "Introduce el número:";
	Leer num;
	
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
