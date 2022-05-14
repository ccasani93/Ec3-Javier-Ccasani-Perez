package com.idat.ec3.dto;

public class ClienteResponseDTO {

	private Integer idClienteResponse;
	private String nombreCliente;
	private Integer celularCliente;
	
	
	
	public Integer getIdClienteResponse() {
		return idClienteResponse;
	}
	public void setIdClienteResponse(Integer idClienteResponse) {
		this.idClienteResponse = idClienteResponse;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public Integer getCelularCliente() {
		return celularCliente;
	}
	public void setCelularCliente(Integer celularCliente) {
		this.celularCliente = celularCliente;
	}
}
