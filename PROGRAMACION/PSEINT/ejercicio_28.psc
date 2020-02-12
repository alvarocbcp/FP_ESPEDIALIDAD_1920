 Proceso ejercicio_28
	
	Definir salario_hora, numero_trabajadores, horas, total_horas, trabajadores, horas_extra, total_horas_extra como reales;
	
	Escribir "Introduce el salario por hora:";
	Leer salario_hora;
	
	Escribir "Introduce el número de trabajadores:";
	Leer numero_trabajadores;
	
	total_horas <- 0;
	horas <- 0;
	trabajadores <- 1;
	total_horas_extra <- 0;
	horas_extra <- 0;
	
	Repetir
		total_horas <- total_horas + horas;
		total_horas_extra <- total_horas_extra + horas_extra;
		Escribir "Introduce el número de horas de un trabajador:";
		Leer horas;
		Si horas > 40 Entonces
			horas_extra <- horas - 40;
		SiNo
			horas_extra <- 0;
		FinSi
		trabajadores <- trabajadores + 1;
	Hasta Que trabajadores > numero_trabajadores
	
	Escribir "El salario total de los ", numero_trabajadores, " trabajadores es: ", total_horas * salario_hora + (total_horas_extra * ((salario_hora * 50) / 100)), "€.";
FinProceso
