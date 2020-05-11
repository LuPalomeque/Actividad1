package excepciones;

import paquete.DatoExtraccionInvalido;

public class ExtraccionInvalidaException extends Exception {
	
	private DatoExtraccionInvalido datoInvalido;

	public ExtraccionInvalidaException(String message, DatoExtraccionInvalido datoInvalido) {
		super(message);
		this.datoInvalido = datoInvalido;
	}
	
	
	
}
