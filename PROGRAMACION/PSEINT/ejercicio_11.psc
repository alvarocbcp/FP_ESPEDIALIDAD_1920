Proceso ejercicio_11
	Definir base1, altura1, base2, altura2, area1, area2 como reales;
	
	Escribir "Introduce la base del primer triángulo:";
	Leer base1;
	
	Escribir "Introduce la altura del primer triángulo:";
	Leer altura1;
	
	Escribir "Introduce la base del segundo triángulo:";
	Leer base2;
	
	Escribir "Introduce la altura del segundo triángulo:";
	Leer altura2;
	
	area1 <- (base1 * altura1) / 2;
	area2 <- (base2 * altura2) / 2;
	
	Si area1 > area2 Entonces
		Escribir "El área del primer triángulo es mayor.";
	SiNo
		Si area1 < area2 Entonces
			Escribir "El área del segundo triángulo es mayor.";
		SiNo
			Escribir "Las dos áreas son iguales.";
		FinSi
	FinSi
	
FinProceso
