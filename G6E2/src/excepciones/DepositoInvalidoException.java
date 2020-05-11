package excepciones;

public class DepositoInvalidoException extends Exception {
	
	private double cantidadInvalida;

	public DepositoInvalidoException(String message, double cantidadInvalida) {
		super(message);
		this.cantidadInvalida = cantidadInvalida;
	}

	public double getCantidadInvalida() {
		return cantidadInvalida;
	}
	
	

}
