package io.kebblar.petstore.api.exceptions;

public class BusinessException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public BusinessException() {
		super();
	}

	public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}

	public Object getIdentificador() {
		return null;
	}

	public Object getCveException() {
		return null;
	}

	public Object getDescException() {
		return null;
	}
	
	
}
