Proceso ejercicio_avanzado_5
	Definir precio_producto, numero_productos, IVA, precio_final, precio_final_descuento Como Real;
	
	Escribir "Introduce el precio del producto:";
	Leer precio_producto;
	
	Escribir "Introduce el número de productos que desea comprar:";
	Leer numero_productos;
	
	IVA <- 0.15;
	precio_final <- precio_producto + (precio_producto * IVA);
	
	Si precio_final > 50 Entonces
		precio_final_descuento <- precio_final - ((precio_final * 5) / 100);
		Escribir "El precio total es de: ", precio_final_descuento * numero_productos, " €.";
	SiNo
		Escribir "El precio total es de: ", precio_final * numero_productos, " €.";
	FinSi
	
FinProceso
