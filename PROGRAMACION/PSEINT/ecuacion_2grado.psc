Proceso segundo_grado
	
	Definir a, b, c, x1, x2 Como Real;
	
	//Introducir par�metros de entrada
	Escribir "Introduce el par�metro a:";
	Leer a;
	
	Escribir "Introduce el par�metro b:";
	Leer b;
	
	Escribir "Introduce el par�metro c:";
	Leer c;
	
	//Escribir la ecuaci�n de segundo grado
	
	x1 <- (-b + (((b^2) - (4*a*c))^0.5)) / 2*a;
	x2 <- (-b - (((b^2) - (4*a*c))^0.5)) / 2*a;
	
	Si x1 = x2 Entonces
		Escribir "Solo existe una soluci�n, x = ", x1;
	SiNo
		Escribir "x1 = ", x1;
		Escribir "x2 = ", x2;
	FinSi
	
FinProceso
