package com.idat.ec3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.ec3.dto.UsuarioClienteRequestDTO;
import com.idat.ec3.dto.UsuarioClienteResponseDTO;
import com.idat.ec3.service.UsuarioClienteService;


@RestController
@CrossOrigin
public class UsuarioClienteController {

	
	 @Autowired
	 private UsuarioClienteService service;
	 
	 @RequestMapping(method = RequestMethod.GET, path = "/listar")
	 public ResponseEntity<List<UsuarioClienteResponseDTO>>listar(){
		 return new ResponseEntity<List<UsuarioClienteResponseDTO>>(service.listarUsuarioCliente(),HttpStatus.OK);
	 }
	 
	 @RequestMapping(method = RequestMethod.POST, path = "/guardar")
	 public ResponseEntity<Void> guardar(@RequestBody UsuarioClienteRequestDTO usuariocliente) {
		 service.guardarUsuarioCliente(usuariocliente);
		 return new ResponseEntity<Void>(HttpStatus.CREATED);
	 }
	 
	 
	 @RequestMapping(method = RequestMethod.GET,path = "listar/{id}")
	 public @ResponseBody ResponseEntity<UsuarioClienteResponseDTO> hospitalById(@PathVariable Integer id) {
		 UsuarioClienteResponseDTO usuariocliente = service.usuarioCliebnteById(id);
		 if(usuariocliente != null){
			return new ResponseEntity<UsuarioClienteResponseDTO>(HttpStatus.OK); 
		 }
		 return new ResponseEntity<UsuarioClienteResponseDTO>(HttpStatus.NOT_FOUND);
	 }
	 
	 @RequestMapping(method = RequestMethod.GET,path = "eliminar/{id}")
	 public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		 UsuarioClienteResponseDTO usuariocliente = service.usuarioCliebnteById(id);
		 if(usuariocliente != null) {
			 service.eliminarUsuarioCliente(id);
			 return new ResponseEntity<Void>(HttpStatus.OK);
		 }
		 return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	 }
	 
	 
	 
	 public ResponseEntity<Void> editar( @RequestBody UsuarioClienteRequestDTO usuariocliente) {
		 if(usuariocliente != null) {
			service.editarUsuarioCliente(usuariocliente);
			return new ResponseEntity<Void>(HttpStatus.OK);
		 }
		 return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	 }
}
