package clases3;

public class Fraccion {

	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Fraccion() {

	}

	public Fraccion suma(Fraccion f1, Fraccion f2) {
		Fraccion f3 = new Fraccion();

		if(f1.denominador == f2.denominador) {
			f3.numerador = f1.numerador + f2.numerador;
			f3.numerador = f1.denominador;
		}
		else {
			f3.numerador = (f1.numerador*f2.denominador) + (f2.numerador*f1.denominador);
			f3.denominador = f1.denominador*f2.denominador;
		}
		return f3;
	}

	public Fraccion resta(Fraccion f1, Fraccion f2) {
		Fraccion f3 = new Fraccion();

		if(f1.denominador == f2.denominador) {
			f3.numerador = f1.numerador - f2.numerador;
			f3.numerador = f1.denominador;
		}
		else {
			f3.numerador = (f1.numerador*f2.denominador) - (f2.numerador*f1.denominador);
			f3.denominador = f1.denominador*f2.denominador;
		}
		return f3;
	}

	public Fraccion multiplicar(Fraccion f1, Fraccion f2) {
		Fraccion f3 = new Fraccion();

		f3.numerador = f1.numerador*f2.numerador;
		f3.denominador = f1.denominador*f2.denominador;

		return f3;
	}

	public Fraccion division(Fraccion f1, Fraccion f2) {
		Fraccion f3 = new Fraccion();

		f3.numerador = f1.numerador*f2.denominador;
		f3.denominador = f1.denominador*f2.numerador;

		return f3;
	}

	public Fraccion inversa(Fraccion f1) {
		Fraccion f3 = new Fraccion();

		f3.numerador = f1.denominador;
		f3.denominador = f1.numerador;
		return f3;
	}

	public Fraccion simplificar(Fraccion f1) {
		for(int i=2; i<=410; i++) {
			if(((f1.numerador%i)==0) && ((f1.denominador%i)==0)) {
				f1.numerador = f1.numerador/i;
				f1.denominador = f1.denominador/i;
			}
		}		
		return f1;
	}

	public String toString() {
		String cad="";

		if(denominador==1) {
			cad = cad + numerador;
		}
		else {
			cad = numerador + "/" + denominador;
		}
		return cad;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}


}
