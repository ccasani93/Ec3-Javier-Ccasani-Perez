package com.idat.ec3.service;

import java.util.List;

import com.idat.ec3.dto.UsuarioClienteRequestDTO;
import com.idat.ec3.dto.UsuarioClienteResponseDTO;

public interface UsuarioClienteService {

	public void guardarUsuarioCliente(UsuarioClienteRequestDTO u);
	public void eliminarUsuarioCliente(Integer id);
	public void editarUsuarioCliente(UsuarioClienteRequestDTO u);
	public List<UsuarioClienteResponseDTO> listarUsuarioCliente();
	public UsuarioClienteResponseDTO usuarioCliebnteById(Integer id);
}
