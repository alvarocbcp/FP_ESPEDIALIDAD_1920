package ejerciciosDesarrolloClase;

/**
 * La clase Empleado permite crear un objeto Empleado.
 * @author Alvaro
 * @version 18/03/2020
 */
public class Empleado 
{
	private String DNI;
	private String nombre;
	private String fechaAlta;
	private int codigoEmpleado;

	/**
	 * Constructor vacio de la clase Empleado.
	 */
	public Empleado()
	{
		
	}
	
	/**
	 * Constructor con parametros de la clase Empleado, 
	 * @param DNI. Dni del empleado.
	 * @param nombre. Nombre del empleado.
	 * @param fecha. Fecha de alta del empleado.
	 * @param codigoEmpleado. Codigo del empleado.
	 */
	public Empleado (String DNI, String nombre, String fecha, int codigoEmpleado)
	{
		this.DNI = DNI;
		this.nombre = nombre;
		this.fechaAlta = fecha;
		this.codigoEmpleado = codigoEmpleado;
	}
	
	/**
	 * Metodo que permite visualizar
	 * como cadena los datos de un empleado.
	 */
	public String	toString()
	{
		String aux;
		aux = ("DNI: "+this.DNI+" Nombre: "+this.nombre+" Fecha Alta: "
						+this.fechaAlta+ " Tipo Empleado:"+getTipoEmpleado()+" Código empleado: "+this.codigoEmpleado);
		return aux;
	}
	
	/**
	 * Metodo que compara dos empleados por medio de su 
	 * DNI para ver si son los mismos.
	 * @param e. Objeto de tipo empleado
	 * @return boolean, true si se trata del mismo empleado, false si no lo es.
	 */
	public boolean	equals(Empleado e) 
	{
		return this.DNI == e.getDNI();
	}

	/**
	 * Devuelve el nombre del empleado
	 * @return nombre. Nombre del empleado.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Permite establecer el nombre del empleado.
	 * @param nombre. Nombre del empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve la fecha de alta del empleado
	 * @return fechaAlta. Fecha de alta del empleado.
	 */
	public String getFechaAlta() {
		return fechaAlta;
	}
	
	/**
	 * Permite establecer la fecha de alta del empleado.
	 * @param fechaAlta. Fecha de alta del empleado
	 */
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	/**
	 * Permite establecer el codigo de empleado del empleado.
	 * @param tipoEmpleado tipo de empleado al que establecer el codigo de empleado.
	 */
	public void setCodigoEmpleado(String tipoEmpleado) 
	{
		
		if (tipoEmpleado.toLowerCase().contains("analista"))
		{
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("programador") ? 1299 : 1255;
		}else if (tipoEmpleado.toLowerCase().contains("programador"))
		{
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("senior") ? 1555 : 1599;
		}else if (tipoEmpleado.toLowerCase().contains("administrador"))
		{
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("senior") ? 1955 : 1999;
		}
		
	}
	
	/**
	 * Devuelve el tipo de empleado.
	 * @return tipo. Tipo de empleado.
	 */
	public String getTipoEmpleado()
	{
		String aux  = "";
		switch (this.codigoEmpleado)
		{
			case 1255:
				aux = "ANALISTA";
			break;
			case 1299:
				aux = "ANALISTA-PROGRAMADOR";
			break;
			case 1555:
				aux = "PROGRAMADOR SENIOR";
			break;
			case 1599:
				aux = "PROGRAMADOR JUNIOR";
			break;
			case 1955:
				aux = "ADMINITRADOR JUNIOR";
			break;
			case 1999:
				aux = "ADMINITRADOR JUNIOR";
			break;
		}
		return aux;
	}
	
	/**
	 * Devuelve el codigo del empleado.
	 * @return codigo. Codigo del empleado.
	 */
	public int getCodigoEmpleado() 
	{
		return codigoEmpleado;
	}
	
	/**
	 * Permite establecer el codigo del empleado,
	 * que sera pasado por parametro al metodo.
	 * @param codigooEmpleado. Codigo del empleado.
	 */
	public void setCodigoEmpleado(int codigooEmpleado) {
		this.codigoEmpleado = codigooEmpleado;
	}

	/**
	 * Permite establecer un DNI al empleado
	 * @param DNI. DNI del empleado.
	 */
	public void setDNI(String DNI)
	{
		this.DNI = DNI;
	}
	
	/**
	 * Devuelve el DNI del empleado.
	 * @return DNI. DNI del empleado.
	 */
	public String getDNI() 
	{
		return DNI;
	}
	
	/**
	 * El metodo permite comparar dos fechas de alta.
	 * Una de ellas es la longitud del DNI 
	 * y la otra es la longitud de la fecha de alta.
	 * @param fecha. Fecha de alta.
	 * @return int 0 en caso de ser fechas diferentes.
	 */
	public int	compareTo(String fecha)
	{   
		int dif;
		int f1 = this.getDNI().length();
		int f2 = fecha.length();
		dif = (f1 != f2) ? f1 - f2 : 0;  
		return dif;  
	}

}
