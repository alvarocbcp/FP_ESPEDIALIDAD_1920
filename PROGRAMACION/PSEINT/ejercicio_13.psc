Proceso ejercicio_13
	Definir horas, horas_extra, sueldo, tarifa como reales;
	
	Escribir "Introduce las horas trabajadas:";
	Leer horas;
	
	Escribir "Introduce la tarifa:";
	Leer tarifa;
	
	
	Si horas > 40 Entonces
		horas_extra <- horas - 40;
	SiNo
		horas_extra <- 0;
	FinSi
	
	sueldo <- horas * tarifa + (horas_extra * ((tarifa * 50) / 100));
	
	Escribir "El sueldo es de ", sueldo, "€.";
	
FinProceso
