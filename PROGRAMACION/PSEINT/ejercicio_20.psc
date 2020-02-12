Proceso ejercicio_20
	Definir octubre como caracter;
	Definir precio, precio_reb como real;
	
	Escribir "Introduce el precio de la compra:";
	Leer precio;
	
	Escribir "Introduce el mes:";
	Leer octubre;
	
	precio_reb <- precio - ((precio * 15) / 100);
	
	Si octubre = "octubre" Entonces
		Escribir "El precio es de ", precio_reb, "€.";
	SiNo
		Escribir "El precio es de ", precio, "€.";
	FinSi
	
FinProceso
