package ejercicioAlumno;

/**
 * La clase Alumno nos permite crear un alunmo,
 * @author Alvaro
 * @version 18/03/2020
 */

public class Alumno 
{
	private int numExpediente;
	private String nombre;
	private String[] asignaturas;
	private int[] notas;

	/**
	 * El constructor crea un array de 10 posiciones
	 * y lo rellena con las asignaturas del alumno.
	 */
	public Alumno() 
	{
		asignaturas = new String[11];
		asignaturas[0] = new String("Desarrollo de aplicaciones en el servidor");
		asignaturas[1] = new String("Desarrollo de aplicaciones web en el cliente");
		asignaturas[2] = new String("Despliegue de aplicaciones");
		asignaturas[3] = new String("Diseño de interfaces");
		asignaturas[4] = new String("Acceso a datos");
		asignaturas[5] = new String("Programación de servicios y procesos");
		asignaturas[6] = new String("Programación multimedia y de móviles");
		asignaturas[7] = new String("Sistemas de gestión empresarial");
		asignaturas[8] = new String("Desarrollo de interfaces");
		asignaturas[9] = new String("Iniciativa emprendedora");
		asignaturas[10] = new String("Inglés");
		notas = new int [10];
	}
	
	/**
	 * El metodo existe materia comprueba si existe dicha materia en el array
	 * @param asignaturas comprueba si existe dicha asignatura en el array
	 * @return true si la asignatura existe en el array, en caso contrario devuelve false
	 */
	
	private boolean existeMateria (String asignatura) 
	{
		boolean existe = false;
		for (int i = 0; i < asignaturas.length && !existe; i++) 
		{
			existe = this.asignaturas[i] == asignatura;
		}
		return existe;
	}
	
	/**
	 * El metodo devuelve la posicion en el array 
	 * de la asignatura que se le pasa por parametro.
	 * @param asignatura asignatura del alumno
	 * @return int con la posicion en el array.
	 */
	
	private int getIndexMateria (String asignatura) 
	{
		int posicion = -1;
		for (int i = 0; i < asignaturas.length && posicion == -1; i++) 
		{
			if (this.asignaturas[i] == asignatura)
			{
			 posicion = i;	
			}
			
		}
		return posicion;
	}
	
	/**
	 * El metodo ponerNota recibe por 
	 * @param nota, asignatura y pone a un alumno dicha nota en esa asignatura.
	 * @return boolean, true si se ha podiddo asignar la nota y false si no se ha podido.
	 */
	
	public	boolean ponerNota (int nota, String asignatura)
	{
		boolean validNota = false;
		if (existeMateria(asignatura))
		{
			notas[getIndexMateria(asignatura)] = nota;
			validNota = true;
		}
		return validNota;
	}
	
	/**
	 * El metodo dameNota recibe por 
	 * @param asignatura y recibe el valor de la nota en dicha asignatura, es decir, 
	 * @return int (nota).
	 */
	
	public	int dameNota( String asignatura) 
	{
		int nota = -1;
		if (existeMateria(asignatura))
		{
		  nota = this.notas[getIndexMateria(asignatura)];	
		}
		return nota;
	}
	
	/**
	 * @return the numExpediente
	 */
	public int getNumExpediente() {
		return numExpediente;
	}

	/**
	 * @param numExpediente the numExpediente to set
	 */
	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the asignaturas
	 */
	public String[] getAsignaturas() {
		return asignaturas;
	}

	/**
	 * @param asignaturas the asignaturas to set
	 */
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * @return the notas
	 */
	public int[] getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(int[] notas) {
		this.notas = notas;
	}


}
