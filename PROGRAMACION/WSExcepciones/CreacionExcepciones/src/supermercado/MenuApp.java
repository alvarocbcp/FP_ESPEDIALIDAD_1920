package supermercado;
import java.util.*;
import java.time.LocalDate;
import lector.Lector;
import productos.Alimento;
import productos.Textil;
import utilidadesFecha.ValidacionFecha;

class MenuApp{
	
	public static final int MAX_OPC=4;
	
	static int menu(int tope_op, Scanner sc)
	{
		int opcion_menu;
		
		System.out.println();
	    System.out.println("\t1. Introducir producto alimenticio.");
		System.out.println("\t2. Introducir producto textil.");
		System.out.println("\t3. Introducir producto drogueria.");
		System.out.println("\t4. Terminar alta de productos.");
		do
		{
			System.out.print("\n\n\tElija opcion:");
			opcion_menu=sc.nextInt();
		} while (opcion_menu  < 1 || opcion_menu > tope_op);
		
	    return opcion_menu;
	}
	
	public static void main(String args[]){
		
	   int opcion=0;
	   Scanner sc = new Scanner(System.in);
	 
	   String codProducto ="", nomProducto, resp, color, marca;
	   Float precioProducto;
	   LocalDate fecActual;
	   
	   Supermercado superMerc=new Supermercado();
	   
	   System.out.println("PROCESO DE CREACIÓN DEL ALMACÉN");
		
	   while (opcion != MAX_OPC)
		{
			opcion = menu(MAX_OPC, sc);
			switch (opcion)
	      	{
	         case 1:
	        	    LocalDate fecCadProducto=null; 
	        	 	        	   
	        	    codProducto = compruebaCodigo(sc, "Alimentación");
	        	 	
	        	 	nomProducto = Lector.leeCadena(sc, "Introduzca nombre del producto de Alimentación:");
	                precioProducto = Lector.leeFloat(sc, "Introduzca precio: ");
	                	                                 		                
		            try {		                	                  
			                boolean repetir=true;
			        	 	while (repetir) {
			        	 		int dia = Lector.leeInt(sc, "Introduce día");
				                int mes = Lector.leeInt(sc, "Introduce mes");
				                int anio = Lector.leeInt(sc, "Introduce año");
				                try {
					                if (! ValidacionFecha.esFechaValida(dia, mes, anio))
				                		throw new FechaNoValidaExcepcion("La fecha de caducidad no tiene valor de fecha válida.");
					                repetir=false;
					                fecCadProducto = LocalDate.of(anio, mes, dia);           
				                }
				                catch (FechaNoValidaExcepcion e) {
				                	System.out.println(e.getMessage());
				                }
				                catch (Exception e) {
				                	System.out.println(e.getMessage());
				                }
			        	 	}// termina while
			        	 	
				            fecActual = LocalDate.now();
				            if (fecCadProducto.isBefore(fecActual)) // Si es igual ??
				                throw new FechaNoValidaExcepcion("La fecha de caducidad debe ser posterior a la fecha de compra.");
				                
				            // Solo si llega hasta aquí sin error, se creará el producto
				            superMerc.aniadir(new Alimento(codProducto, nomProducto, precioProducto, fecCadProducto));	
			                   	 	
		                } catch (FechaNoValidaExcepcion e) {		                	
		                	System.out.println(e.getMessage());
		                } catch (Exception e) {		                	
		                	System.out.println(e);
		                	sc.nextLine();
		                }
		            // Hacer algún método		        	 	
	                break;
	         case 2:
	        	 	        	 	
	        	 	 codProducto = compruebaCodigo(sc, "Textil");
	        	 	 
	        	 	 nomProducto = Lector.leeCadena(sc, "Introduzca nombre producto Textil:");
	                 precioProducto = Lector.leeFloat(sc, "Introduzca precio: ");
	                 color = Lector.leeCadena(sc, "Introduzca color: ");
	                 
					 superMerc.aniadir(new Textil(codProducto,nomProducto,precioProducto,color));		
	                 break;
	         case 3:
	        	 	 	         	 	 
	        	 	 codProducto = compruebaCodigo(sc, "Droguería");
	        	 	 
	        	 	 nomProducto = Lector.leeCadena(sc, "Introduzca producto de Droguería:");
	                 precioProducto = Lector.leeFloat(sc, "Introduzca precio: ");
	                 marca = Lector.leeCadena(sc, "Introduzca marca: ");
	                 
					 superMerc.aniadir(new Textil(codProducto,nomProducto,precioProducto,marca));		
	                 break;
	     	}
	     }
	   
	   Carrito carr; 	   
	   do{
			System.out.println("\n\n\n\n¡¡¡¡Acaba de entrar en el supermercado virtual!!!!");
			superMerc.verProductos();
		
			carr=new Carrito();
			do{
				System.out.println("\nDesea comprar producto?(S/N)");
				resp=sc.next().toUpperCase();
				sc.nextLine();
				if(resp.equals("S")){					
					System.out.println("\nEscriba el código de producto de la lista:");
					String cod=sc.nextLine();
					carr.compra(cod, superMerc);	
					superMerc.verProductos();
				}
			} while(resp.equals("S"));
			if (!carr.esVacio())
				carr.generarTicket();
			//else System.out.println("No hay productos en el carro.");
			System.out.println("\nHay más clientes?(S/N)");
			resp=sc.next().toUpperCase();
	    }while(resp.equals("S"));
		sc.close();
 }


private static String compruebaCodigo(Scanner sc, String cad) {
	boolean repetir=true;
	String codProducto="";
 	
 	 while (repetir) {
 		codProducto = Lector.leeCadena(sc, "Introduzca código del producto de " + cad + " de 5 caracteres(1º y 5º mayúscula, resto números):");
			try {
				Supermercado.validaCodigo(codProducto);
				repetir = false;
			}
			catch (CodigoIncorrectoException e){
				System.out.println(e.getMessage());
			}
 	 };
 	 
 	 return codProducto;
 }

}
