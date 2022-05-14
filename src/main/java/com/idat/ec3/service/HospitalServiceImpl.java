package com.idat.ec3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.ec3.dto.HospitalRequestDTO;
import com.idat.ec3.dto.HospitalResponseDTO;
import com.idat.ec3.model.Hospital;
import com.idat.ec3.repository.HospitalRepository;

public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalRepository repository;
	
	@Override
	public void guardarHospital(HospitalRequestDTO h) {
		// TODO Auto-generated method stub
		Hospital hospital = new Hospital();
		hospital.setIdHospital(h.getIdHospitalRequest());
		hospital.setNombre(h.getNombreHospital());
		hospital.setDescripcion(h.getDescripcionHospital());
		hospital.setDistrito(h.getDistritoHospital());
		repository.save(hospital);
	}

	@Override
	public void eliminarHospital(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void editarHospital(HospitalRequestDTO h) {
		// TODO Auto-generated method stub
		Hospital hospital = new Hospital();
		hospital.setIdHospital(h.getIdHospitalRequest());
		hospital.setNombre(h.getNombreHospital());
		hospital.setDescripcion(h.getDescripcionHospital());
		hospital.setDistrito(h.getDistritoHospital());
		repository.saveAndFlush(hospital);
	}

	@Override
	public List<HospitalResponseDTO> listarHospital() {
		// TODO Auto-generated method stub
		List<Hospital> hospital = repository.findAll();
		List<HospitalResponseDTO> dto = new ArrayList<HospitalResponseDTO>();
		HospitalResponseDTO hospitalDTO = null;
		
		for (Hospital hospitals : hospital) {
			hospitalDTO = new HospitalResponseDTO();
			hospitalDTO.setIdHospitalResponse(hospitals.getIdHospital());
			hospitalDTO.setNombreHospital(hospitals.getNombre());
			hospitalDTO.setDescripcionHospital(hospitals.getDescripcion());
			hospitalDTO.setDistritoHospital(hospitals.getDistrito());
			dto.add(hospitalDTO);
		}
		return dto;
	}

	@Override
	public HospitalResponseDTO hospitalById(Integer id) {
		// TODO Auto-generated method stub

		Hospital hospital = repository.findById(id).orElse(null);
		HospitalResponseDTO hospitalDTO = new HospitalResponseDTO();
		
		hospitalDTO = new HospitalResponseDTO();
		hospitalDTO.setIdHospitalResponse(hospital.getIdHospital());
		hospitalDTO.setNombreHospital(hospital.getNombre());
		hospitalDTO.setDescripcionHospital(hospital.getDescripcion());
		hospitalDTO.setDistritoHospital(hospital.getDistrito());
		
		return hospitalDTO;
	}
	
	

}
