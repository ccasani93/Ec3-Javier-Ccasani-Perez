package com.idat.ec3.service;

import java.util.List;

import com.idat.ec3.dto.HospitalRequestDTO;
import com.idat.ec3.dto.HospitalResponseDTO;

public interface HospitalService {

	public void guardarHospital(HospitalRequestDTO h);
	public void eliminarHospital(Integer id);
	public void editarHospital(HospitalRequestDTO h);
	public List<HospitalResponseDTO> listarHospital();
	public HospitalResponseDTO hospitalById(Integer id);
}
