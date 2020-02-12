package entornos;

public class Persona {
		int edad;
		String DNI;
		String Nombre;
		String Apellidos;
		String Casado;
		
		public Persona()
		{
			this.edad = edad;
			this.DNI = DNI;
			this.Nombre = Nombre;
			this.Apellidos = Apellidos;
			this.Casado = Casado;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getDNI() {
			return DNI;
		}

		public void setDNI(String dNI) {
			DNI = dNI;
		}

		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public String getApellidos() {
			return Apellidos;
		}

		public void setApellidos(String apellidos) {
			Apellidos = apellidos;
		}

		public String getCasado() {
			return Casado;
		}

		public void setCasado(String casado) {
			Casado = casado;
		}
	}