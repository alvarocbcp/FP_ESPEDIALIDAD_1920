Proceso ejercicio_avanzado_7
	Definir l1, l2, l3 Como Real;
	
	Escribir "Introduce el lado 1:";
	Leer l1;
	
	Escribir "Introduce el lado 2:";
	Leer l2;
	
	Escribir "Introduce el lado 3:";
	Leer l3;
	
	Si l1 > (l2 + l3) O l2 > (l1 + l3) O l3 > (l1 + l2) Entonces
		Escribir "Los tres lados no forman un triángulo.";
	SiNo
		Si l1 = l2  Y l2 = l3 Entonces
			Escribir "El triángulo es equilátero.";
		SiNo
			Si (l1 = l2 Y l2 <> l3) O (l2 = l3 Y l3 <> l1) O (l1 = l3 Y l3 <> l2) Entonces
				Escribir "El triángulo es isósceles.";
			SiNo
				Escribir "El triángulo es escaleno.";
			FinSi
		FinSi
	FinSi
	
FinProceso
