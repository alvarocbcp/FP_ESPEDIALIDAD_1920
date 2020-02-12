Proceso ejercicio_22
	Definir bachiller, prueba como caracter;
	
	Escribir "¿Tienes el título de bachillerato?";
	Leer bachiller;
	
	Si bachiller = "si" Entonces
		Escribir "Puedes acceder al Grado Superior.";
	SiNo
		Escribir "¿Has superado una prueba de acceso?";
		Leer prueba;
		Si prueba = "si" Entonces
			Escribir "Puedes acceder al Grado Superior.";
		SiNo
			Escribir "No puedes acceder al Grado Superior.";
		FinSi
	FinSi
	
FinProceso
