package paquete;

public class DatoExtraccionInvalido {

	private double extraccionSolicitada;
	private double saldo;
	
	public DatoExtraccionInvalido(double extraccionSolicitada, double saldo) {
		this.extraccionSolicitada = extraccionSolicitada;
		this.saldo = saldo;
	}

	public double getExtraccionSolicitada() {
		return extraccionSolicitada;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
