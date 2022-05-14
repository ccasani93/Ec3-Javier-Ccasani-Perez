package com.idat.ec3.dto;

public class HospitalResponseDTO {

	private Integer idHospitalResponse;
	private String nombreHospital;
	private String descripcionHospital;
	private String distritoHospital;
	
	
	public Integer getIdHospitalResponse() {
		return idHospitalResponse;
	}
	public void setIdHospitalResponse(Integer idHospitalResponse) {
		this.idHospitalResponse = idHospitalResponse;
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
