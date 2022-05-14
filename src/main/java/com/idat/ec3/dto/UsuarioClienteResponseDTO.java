package com.idat.ec3.dto;

public class UsuarioClienteResponseDTO {

	private Integer idUsuarioResponse;
	private String usuarioCliente;
	private String passwordUsuario;
	private String rolUsuario;
	
	
	public Integer getIdUsuarioResponse() {
		return idUsuarioResponse;
	}
	public void setIdUsuarioResponse(Integer idUsuarioResponse) {
		this.idUsuarioResponse = idUsuarioResponse;
	}
	public String getUsuarioCliente() {
		return usuarioCliente;
	}
	public void setUsuarioCliente(String usuarioCliente) {
		this.usuarioCliente = usuarioCliente;
	}
	public String getPasswordUsuario() {
		return passwordUsuario;
	}
	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}
	public String getRolUsuario() {
		return rolUsuario;
	}
	public void setRolUsuario(String rolUsuario) {
		this.rolUsuario = rolUsuario;
	}
	
	
	
}
