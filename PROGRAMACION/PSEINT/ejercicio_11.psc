Proceso ejercicio_11
	Definir base1, altura1, base2, altura2, area1, area2 como reales;
	
	Escribir "Introduce la base del primer tri�ngulo:";
	Leer base1;
	
	Escribir "Introduce la altura del primer tri�ngulo:";
	Leer altura1;
	
	Escribir "Introduce la base del segundo tri�ngulo:";
	Leer base2;
	
	Escribir "Introduce la altura del segundo tri�ngulo:";
	Leer altura2;
	
	area1 <- (base1 * altura1) / 2;
	area2 <- (base2 * altura2) / 2;
	
	Si area1 > area2 Entonces
		Escribir "El �rea del primer tri�ngulo es mayor.";
	SiNo
		Si area1 < area2 Entonces
			Escribir "El �rea del segundo tri�ngulo es mayor.";
		SiNo
			Escribir "Las dos �reas son iguales.";
		FinSi
	FinSi
	
FinProceso
