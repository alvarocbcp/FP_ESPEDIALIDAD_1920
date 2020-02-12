Proceso ejercicio__avanzado_8
	Definir num1, num2, num3 como reales;
	
	Escribir "Introduce los 3 números pulsando intro despues de cada uno:";
	Leer num1, num2, num3;
	
	Si num1 > num2 Y num1 > num3 Y num2 > num3 Entonces
		Escribir "De mayor a menor: ", num1, " > ", num2, " > ", num3, ".";
		Escribir "De menor a mayor: ", num3, " < ", num2, " < ", num1, ".";
		
	SiNo
		Si num1 > num2 Y num1 > num3 Y num3 > num2 Entonces
			Escribir "De mayor a menor: ", num1, " > ", num3, " > ", num2, ".";
			Escribir "De menor a mayor: ", num2, " < ", num3, " < ", num1, ".";
		SiNo
			Si num2 > num1 Y num2 > num3 Y num1 > num3 Entonces
				Escribir "De mayor a menor: ", num2, " > ", num1, " > ", num3, ".";
				Escribir "De menor a mayor: ", num3, " < ", num1, " < ", num2, ".";
			SiNo
				Si num2 > num1 Y num2 > num3 Y num3 > num1 Entonces
					Escribir "De mayor a menor: ", num2, " > ", num3, " > ", num1, ".";
					Escribir "De menor a mayor: ", num1, " < ", num3, " < ", num2, ".";
				SiNo
					Si num3 > num1 Y num3 > num2 Y num1 > num2 Entonces
						Escribir "De mayor a menor: ", num3, " > ", num1, " > ", num2, ".";
						Escribir "De menor a mayor: ", num2, " < ", num1, " < ", num3, ".";
					SiNo
						Escribir "De mayor a menor: ", num3, " > ", num2, " > ", num1, ".";
						Escribir "De menor a mayor: ", num1, " < ", num2, " < ", num3, ".";
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinProceso
