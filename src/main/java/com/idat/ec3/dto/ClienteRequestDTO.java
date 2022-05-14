package com.idat.ec3.dto;

public class ClienteRequestDTO {

	private Integer idClienteRequest;
	private String nombreCliente;
	private Integer celularCliente;
	
	
	public Integer getIdClienteRequest() {
		return idClienteRequest;
	}
	public void setIdClienteRequest(Integer idClienteRequest) {
		this.idClienteRequest = idClienteRequest;
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
