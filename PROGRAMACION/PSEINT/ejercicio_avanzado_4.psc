Proceso ejercicio_avanzado_4
	Definir tiempo, minutos, horas, dias, x Como Real;
	
	Escribir "Introduce el tiempo en minutos:";
	Leer tiempo;
	
	dias <- trunc(tiempo / 1440);
	x <- tiempo % 1440;
	horas <- trunc(x / 60);
	minutos <- x % 60;
	
	Escribir "Te da ", dias, " días, ", horas, " horas y ", minutos, " minutos.";
	
FinProceso
 