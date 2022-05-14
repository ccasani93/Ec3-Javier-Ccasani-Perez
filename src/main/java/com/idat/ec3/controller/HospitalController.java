package com.idat.ec3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.ec3.dto.HospitalRequestDTO;
import com.idat.ec3.dto.HospitalResponseDTO;
import com.idat.ec3.service.HospitalService;

@RestController
@RequestMapping(name = "/hospital/v1")
public class HospitalController {

	 @Autowired
	 private HospitalService service;
	 
	 @RequestMapping(method = RequestMethod.GET, path = "/listar")
	 public ResponseEntity<List<HospitalResponseDTO>>listar(){
		 return new ResponseEntity<List<HospitalResponseDTO>>(service.listarHospital(),HttpStatus.OK);
	 }
	 
	 @RequestMapping(method = RequestMethod.POST, path = "/guardar")
	 public ResponseEntity<Void> guardar(@RequestBody HospitalRequestDTO hospital) {
		 service.guardarHospital(hospital);
		 return new ResponseEntity<Void>(HttpStatus.CREATED);
	 }
	 
	 
	 @RequestMapping(method = RequestMethod.GET,path = "listar/{id}")
	 public @ResponseBody ResponseEntity<HospitalResponseDTO> hospitalById(@PathVariable Integer id) {
		 HospitalResponseDTO hospital = service.hospitalById(id);
		 if(hospital != null){
			return new ResponseEntity<HospitalResponseDTO>(HttpStatus.OK); 
		 }
		 return new ResponseEntity<HospitalResponseDTO>(HttpStatus.NOT_FOUND);
	 }
	 
	 @RequestMapping(method = RequestMethod.GET,path = "eliminar/{id}")
	 public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		 HospitalResponseDTO hospital = service.hospitalById(id);
		 if(hospital != null) {
			 service.eliminarHospital(id);
			 return new ResponseEntity<Void>(HttpStatus.OK);
		 }
		 return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	 }
	 
	 
	 
	 public ResponseEntity<Void> editar( @RequestBody HospitalRequestDTO hospital) {
		 if(hospital != null) {
			service.editarHospital(hospital);
			return new ResponseEntity<Void>(HttpStatus.OK);
		 }
		 return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	 }
}
