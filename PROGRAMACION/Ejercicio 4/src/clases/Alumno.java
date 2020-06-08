package clases;

import excepciones.IdentificacionException;
import excepciones.NIFException;

public class Alumno {
	
	long NIF;
	String identificacion;

	public long getNIF() {
		return NIF;
	}

	public void setNIF(long nIF) {
		NIF = nIF;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	public void establecerNIF(long NIF) throws NIFException{
		if(NIF<=9 || NIF>10) {
			setNIF(NIF);
		}
	}
	
	public void establecerIdentificacion(String ident) throws IdentificacionException{
		if(ident.length()<5 || ident.length()>=5) {
			setIdentificacion(ident);
		}
	}
	

}
