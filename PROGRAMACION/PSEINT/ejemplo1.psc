Proceso ejemlo
	definir num1, num2, suma, resta, producto, division como reales;
	definir mensaje1, mensaje2, mensaje3, mensaje4 como caracter;
	
	Escribir "Introduzca el primer número:";
	Leer num1;
	
	Escribir "Introduzca el segundo número:";
	Leer num2;
	
	suma <- num1 + num2;
	mensaje1 <- "Suma:" + ConvertirATexto(suma);
	escribir mensaje1;
	
	resta <- num1 - num2;
	mensaje2 <- "Resta:" + ConvertirATexto(resta);
	escribir mensaje2;
	
	producto <- num1 * num2;
	mensaje3 <- "Producto:" + ConvertirATexto(producto);
	escribir mensaje3;
	
	division <- num1 / num2;
	mensaje4 <- "Division:" + ConvertirATexto(division);
	escribir mensaje2;
	
	
FinProceso
