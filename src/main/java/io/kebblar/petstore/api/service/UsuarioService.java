package io.kebblar.petstore.api.service;

import io.kebblar.petstore.api.exceptions.BusinessException;
import io.kebblar.petstore.api.model.RequestLogin;
import io.kebblar.petstore.api.model.RequestUsuarioRegistro;
import io.kebblar.petstore.api.model.ResponseBase;

public interface UsuarioService {

	Object login(RequestLogin login) throws BusinessException;
	
//	ResponseBase registro(RequestUsuarioRegistro datos) throws BusinessException;
}
