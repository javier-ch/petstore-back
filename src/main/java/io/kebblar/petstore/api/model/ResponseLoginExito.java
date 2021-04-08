package io.kebblar.petstore.api.model;

public class ResponseLoginExito {

	private String jwt;
	private String nombreCompleto;
	private String ultimoAcceso;
	
	public String getJwt() {
		return jwt;
	}
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getUltimoAcceso() {
		return ultimoAcceso;
	}
	public void setUltimoAcceso(String ultimoAcceso) {
		this.ultimoAcceso = ultimoAcceso;
	}
}
