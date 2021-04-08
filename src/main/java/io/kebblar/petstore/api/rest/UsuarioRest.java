package io.kebblar.petstore.api.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kebblar.petstore.api.exceptions.BusinessException;
import io.kebblar.petstore.api.model.RequestLogin;
import io.kebblar.petstore.api.model.RequestUsuarioRegistro;
import io.kebblar.petstore.api.model.ResponseBase;
import io.kebblar.petstore.api.service.UsuarioService;

@RestController
@RequestMapping(value = "/api/usuario/")
public class UsuarioRest {

	private UsuarioService usuarioService;
	
	public UsuarioRest(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping(path = "/login.json", produces = "application/json; charset=utf-8")//@Valid
    public Object login(@RequestBody  RequestLogin login) throws BusinessException {
    	return usuarioService.login(login);
    }
	
//	@PostMapping(path = "/registro.json", produces = "application/json; charset=utf-8")
//    public ResponseBase registro(@RequestBody RequestUsuarioRegistro datos) throws BusinessException {
//    	return usuarioService.registro(datos);
//    }
}
