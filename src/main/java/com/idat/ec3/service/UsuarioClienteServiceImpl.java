package com.idat.ec3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.ec3.dto.UsuarioClienteRequestDTO;
import com.idat.ec3.dto.UsuarioClienteResponseDTO;
import com.idat.ec3.model.UsuarioCliente;
import com.idat.ec3.repository.UsuarioClienteRepository;

public class UsuarioClienteServiceImpl implements UsuarioClienteService {

	@Autowired
	private UsuarioClienteRepository repository;	
	
	@Override
	public void guardarUsuarioCliente(UsuarioClienteRequestDTO u) {
		// TODO Auto-generated method stub
		UsuarioCliente usuariocliente = new UsuarioCliente();
		usuariocliente.setIdUsuario(u.getIdUsuarioRequest());
		usuariocliente.setUsuario(u.getUsuarioCliente());
		usuariocliente.setPassword(u.getPasswordUsuario());
		usuariocliente.setRol(u.getRolUsuario());
		repository.save(usuariocliente);
	}

	@Override
	public void eliminarUsuarioCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void editarUsuarioCliente(UsuarioClienteRequestDTO u) {
		// TODO Auto-generated method stub
		UsuarioCliente usuariocliente = new UsuarioCliente();
		usuariocliente.setIdUsuario(u.getIdUsuarioRequest());
		usuariocliente.setUsuario(u.getUsuarioCliente());
		usuariocliente.setPassword(u.getPasswordUsuario());
		usuariocliente.setRol(u.getRolUsuario());
		repository.saveAndFlush(usuariocliente);
	}

	@Override
	public List<UsuarioClienteResponseDTO> listarUsuarioCliente() {
		// TODO Auto-generated method stub
		List<UsuarioCliente> usuarioclientes = new ArrayList<UsuarioCliente>();
		List<UsuarioClienteResponseDTO> dto = new ArrayList<UsuarioClienteResponseDTO>();
		UsuarioClienteResponseDTO usuarioclienteDTO = null;
		
		for ( UsuarioCliente usuariocliente : usuarioclientes) {
			usuarioclienteDTO = new UsuarioClienteResponseDTO();
			usuarioclienteDTO.setIdUsuarioResponse(usuariocliente.getIdUsuario());
			usuarioclienteDTO.setUsuarioCliente(usuariocliente.getUsuario());
			usuarioclienteDTO.setPasswordUsuario(usuariocliente.getPassword());
			usuarioclienteDTO.setRolUsuario(usuariocliente.getRol());
			dto.add(usuarioclienteDTO);
		}
		return dto;
	}

	@Override
	public UsuarioClienteResponseDTO usuarioCliebnteById(Integer id) {
		// TODO Auto-generated method stub
		UsuarioCliente usuariocliente = repository.findById(id).orElse(null);
		UsuarioClienteResponseDTO usuarioclienteDTO = new UsuarioClienteResponseDTO();
		
		usuarioclienteDTO = new UsuarioClienteResponseDTO();
		usuarioclienteDTO.setIdUsuarioResponse(usuariocliente.getIdUsuario());
		usuarioclienteDTO.setUsuarioCliente(usuariocliente.getUsuario());
		usuarioclienteDTO.setPasswordUsuario(usuariocliente.getPassword());
		usuarioclienteDTO.setRolUsuario(usuariocliente.getRol());
		
		return usuarioclienteDTO;
	}

}
