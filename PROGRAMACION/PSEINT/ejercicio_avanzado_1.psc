Proceso ejercicio_avanzado_1
	Definir hora1, hora2, minuto1, minuto2,total_minutos1, total_minutos2, diferencia1, diferencia2, horafinal1, minutofinal1, horafinal2, minutofinal2 Como Real;
	
	Escribir "Introduce la primera hora, luego pulsa intro e introduce los minutos:";
	Leer hora1, minuto1;
	
	Escribir "Introduce la segunda hora, luego pulsa intro e introduce los minutos:";
	Leer hora2, minuto2;
	
	total_minutos1 <- (hora1 * 60) + minuto1;
	total_minutos2 <- (hora2 * 60) + minuto2;
	
	Si minuto1 > 60 O minuto2 > 60 O hora1 > 23 O hora2 > 23 Entonces
		Escribir "Error! Esa hora no existe.";
	SiNo
		Si total_minutos1 > total_minutos2 Entonces
			diferencia1 <- total_minutos1 - total_minutos2;
			horafinal1 <- trunc(diferencia1 / 60);
			minutofinal1 <- diferencia1 % 60;
			Escribir "La diferencia es de ", horafinal1, " horas y ", minutofinal1, " minutos.";
		SiNo
			Si total_minutos1 < total_minutos2 Entonces
				diferencia2 <- total_minutos2 - total_minutos1;
				horafinal2 <- trunc(diferencia2 / 60);
				minutofinal2 <- diferencia2 % 60;
				Escribir "La diferencia es de ", horafinal2, " horas y ", minutofinal2, " minutos.";
			SiNo
				Escribir "Las dos horas son iguales, no hay diferencia horaria.";
			FinSi
		FinSi
	FinSi
	
FinProceso
