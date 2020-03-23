package clases1;

import javax.swing.*;

public class Cuenta {
	
	private double saldo;
	private int numeroCuenta;
	private static int contadorCuentas;
	
	public Cuenta() {
		numeroCuenta = contadorCuentas;
		contadorCuentas++;
	}
	
	public Cuenta(double saldo) {
		this.saldo=saldo;
		numeroCuenta = contadorCuentas;
		contadorCuentas++;
	}
	
	void ingresar(double cantidad) {
		saldo = saldo + cantidad;
	}
	
	void retirar(double cantidad) throws ExcSaldoInsuf{
		if(saldo<cantidad){
			throw new ExcSaldoInsuf("No dispone de ese dinero en la cuenta.");
		}
		else {
			saldo = saldo - cantidad;
		}
	}
	
	public String mostrarCuenta() {
		String cad="Su numero de cuenta es: " + numeroCuenta + "\nEl saldo de su cuenta es de: " + saldo + "€.";
		return cad;
	}
	
	public String toString() {
		String cad="Cuenta numero: " + numeroCuenta + "\nSaldo en la cuenta: " + getSaldo();
		return cad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public static int getContadorCuentas() {
		return contadorCuentas;
	}

	public static void setContadorCuentas(int contadorCuentas) {
		Cuenta.contadorCuentas = contadorCuentas;
	}
	

}
