package io.kebblar.petstore.api.exceptions;

public class ProductoInexistenteException extends BusinessException{

	private static final long serialVersionUID = 1L;

	public ProductoInexistenteException(String msg) {
		super(msg);	
	}
}
