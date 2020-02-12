Proceso ejercicio_27
	Definir salario_hora, n, horas, total_horas, trabajadores como reales;
	
	Escribir "Introduce el salario por hora:";
	Leer salario_hora;
	
	Escribir "Introduce el número de trabajadores:";
	Leer n;
	
	total_horas <- 0;
	horas <- 0;
	trabajadores <- 1;
	
	Si n = 1 Entonces
		Escribir "Introduce el número de horas de un trabajador:";
		Leer horas;
		total_horas <- total_horas + horas;
	SiNo
		Repetir
			total_horas <- total_horas + horas;
			Escribir "Introduce el número de horas de un trabajador:";
			Leer horas;
			trabajadores <- trabajadores + 1;
		Hasta Que trabajadores > n
		
	FinSi
	
	Escribir "El salario total de los ", n, " trabajadores es: ", total_horas * salario_hora, "€.";
	
FinProceso
