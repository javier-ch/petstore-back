package io.kebblar.petstore.api.model;

public class ResponseLoginError {
	
	private int conteoIntentosFallidos;
	private long instanteBloqueo;
	private boolean exitoIngreso;
	
	public int getConteoIntentosFallidos() {
		return conteoIntentosFallidos;
	}
	public void setConteoIntentosFallidos(int conteoIntentosFallidos) {
		this.conteoIntentosFallidos = conteoIntentosFallidos;
	}
	public long getInstanteBloqueo() {
		return instanteBloqueo;
	}
	public void setInstanteBloqueo(long instanteBloqueo) {
		this.instanteBloqueo = instanteBloqueo;
	}
	public boolean isExitoIngreso() {
		return exitoIngreso;
	}
	public void setExitoIngreso(boolean exitoIngreso) {
		this.exitoIngreso = exitoIngreso;
	}
}
