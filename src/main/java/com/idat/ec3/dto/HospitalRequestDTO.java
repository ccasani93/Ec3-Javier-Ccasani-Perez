package com.idat.ec3.dto;

public class HospitalRequestDTO {

	private Integer idHospitalRequest;
	private String nombreHospital;
	private String descripcionHospital;	
	private String distritoHospital;
	
	
	public Integer getIdHospitalRequest() {
		return idHospitalRequest;
	}
	public void setIdHospitalRequest(Integer idHospitalRequest) {
		this.idHospitalRequest = idHospitalRequest;
	}
	public String getNombreHospital() {
		return nombreHospital;
	}
	public void setNombreHospital(String nombreHospital) {
		this.nombreHospital = nombreHospital;
	}
	
	public String getDescripcionHospital() {
		return descripcionHospital;
	}
	public void setDescripcionHospital(String descripcionHospital) {
		this.descripcionHospital = descripcionHospital;
	}		
	
	public String getDistritoHospital() {
		return distritoHospital;
	}
	public void setDistritoHospital(String distritoHospital) {
		this.distritoHospital = distritoHospital;
	}
	
	
}
