package com.idat.ec3.service;

import java.util.List;

import com.idat.ec3.dto.ClienteRequestDTO;
import com.idat.ec3.dto.ClienteResponseDTO;

public interface ClienteService {
	
	public void guardarCliente(ClienteRequestDTO c);
	public void eliminarCliente(Integer id);
	public void editarCliente(ClienteRequestDTO c);
	public  List<ClienteResponseDTO> listarCliente();
	public ClienteResponseDTO clienteById(Integer id);
	
}
