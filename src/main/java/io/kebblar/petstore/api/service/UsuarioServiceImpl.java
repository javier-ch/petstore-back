package io.kebblar.petstore.api.service;

import org.springframework.stereotype.Service;

import io.kebblar.petstore.api.exceptions.BusinessException;
import io.kebblar.petstore.api.mapper.UsuarioMapper;
import io.kebblar.petstore.api.model.RequestLogin;
import io.kebblar.petstore.api.model.ResponseLoginError;
import io.kebblar.petstore.api.model.ResponseLoginExito;
import io.kebblar.petstore.api.model.Usuario;

@Service
class UsuarioServiceImpl implements UsuarioService{

	private UsuarioMapper usuarioMapper;
	
	public UsuarioServiceImpl(UsuarioMapper usuarioMapper) {
		this.usuarioMapper = usuarioMapper;
	}
	
	@Override
	public Object login(RequestLogin login) throws BusinessException {
		try {
			Usuario usuario = usuarioMapper.findByCorreo(login.getUsuario());
			
			if(usuario == null) {//Si el correo no existe
				ResponseLoginError error = new ResponseLoginError();
				error.setConteoIntentosFallidos(0);
				error.setInstanteBloqueo(0);
				error.setExitoIngreso(false);
				return error;
			}
			
			//Validamos la contraseña
			if(usuario.getClave().equals(login.getClave())) {
				//Existe el correo
				ResponseLoginExito exito = new ResponseLoginExito();
				exito.setJwt("123132");
				exito.setNombreCompleto("Nombre completo");
				exito.setUltimoAcceso("1232132132");
				return exito;
			}else {
				ResponseLoginError error = new ResponseLoginError();
				error.setConteoIntentosFallidos(0);
				error.setInstanteBloqueo(0);
				error.setExitoIngreso(true);
				return error;
			}
		}catch (Exception e) {
			e.printStackTrace();
			throw new BusinessException("texto adecuado...");
		}
	}

}
