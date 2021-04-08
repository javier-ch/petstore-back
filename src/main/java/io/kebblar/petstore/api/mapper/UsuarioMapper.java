package io.kebblar.petstore.api.mapper;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import io.kebblar.petstore.api.model.Usuario;

@Repository
public interface UsuarioMapper {

	static final String USUARIO_FIELDS=" id, correo, clave, creado, activo, acceso_negado_contador, instante_bloqueo, instante_ultimo_acceso "
			+ ", instante_ultimo_cambio_clave, regenera_clave_token, regenera_clave_instante ";

	@Results(id="UsuarioResultMap", value= {
			@Result(property = "id", column = "id"),
			@Result(property = "correo", column = "correo"),
			@Result(property = "clave", column = "clave"),
			@Result(property = "creado", column = "creado"),
			@Result(property = "activo", column = "activo"),
			@Result(property = "accesoNegadoContador", column = "acceso_negado_contador"),
			@Result(property = "instanteBloqueo", column = "instante_bloqueo"),
			@Result(property = "instanteUltimoAcceso", column = "instante_ultimo_acceso"),
			@Result(property = "instanteUltimoCambioClave", column = "instante_ultimo_cambio_clave"),
			@Result(property = "regeneraClaveToken", column = "regenera_clave_token"),
			@Result(property = "regeneraClaveInstante", column = "regenera_clave_instante")
	})
	
	@Select("SELECT "+USUARIO_FIELDS+" FROM user where correo=#{correo}")
	Usuario findByCorreo(String correo) throws SQLException;
	
//	@Insert("INSERT INTO user (campos) VALUES(valores)")
//	int registro(Usuario datos);
	
	
}
