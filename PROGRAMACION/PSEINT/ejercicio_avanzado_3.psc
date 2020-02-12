Proceso ejercicio_avanzado_3
	Definir sueldo_inicial, sueldo_neto1, sueldo_neto2, sueldo_neto3, total_trabajadores, acum Como Real;
	
	Escribir "Introduce el número total de trabajadores:";
	Leer total_trabajadores;
	
	Para acum<-1 Hasta total_trabajadores Con Paso 1 Hacer
		
		Escribir "Introduce tu sueldo:";
		Leer sueldo_inicial;
		
		Si sueldo_inicial <= 1000 Entonces
			sueldo_neto1 <- sueldo_inicial - ((sueldo_inicial * 10) / 100);
			Escribir "Su sueldo neto es de: ", sueldo_neto1, "€.";
		SiNo
			Si 1000 < sueldo_inicial Y sueldo_inicial <= 2000 Entonces
				sueldo_neto2 <- sueldo_inicial - ((sueldo_inicial * 15) / 100);
				Escribir "Su sueldo neto es de: ", sueldo_neto2, "€.";
			SiNo
				sueldo_neto3 <- sueldo_inicial - ((sueldo_inicial * 18) / 100);
				Escribir "Su sueldo neto es de: ", sueldo_neto3, "€.";
			FinSi
		FinSi
	FinPara
	
FinProceso
