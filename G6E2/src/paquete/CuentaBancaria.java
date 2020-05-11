package paquete;

import excepciones.DepositoInvalidoException;
import excepciones.ExtraccionInvalidaException;

public class CuentaBancaria {
	
	private double saldo;
	private String titular;
	
	public CuentaBancaria(String titular) {
		this.titular = titular;
		saldo = 200;
	}
	
	public void depositar(double cantidad) throws DepositoInvalidoException {
		if (cantidad <= 0)
			throw new DepositoInvalidoException("El deposito es invalido",cantidad);
		else
			saldo+=cantidad;
	}
	
	public void extraer(double cantidad) throws ExtraccionInvalidaException {
		if (cantidad > saldo) {
			DatoExtraccionInvalido d = new DatoExtraccionInvalido(cantidad,saldo);
			throw new ExtraccionInvalidaException("La extraccion es invalida",d);
		}
		else
			saldo-=cantidad;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}
	
	

}
