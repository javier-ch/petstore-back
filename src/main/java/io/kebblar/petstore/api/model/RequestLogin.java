package io.kebblar.petstore.api.model;

//import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestLogin {

	@JsonProperty(value = "usuario")
//	@NotEmpty(message="Parametro usuario requerido")
	private String usuario;
	@JsonProperty(value = "clave")
//	@NotEmpty(message="Parametro clave requerido")
	private String clave;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
}
