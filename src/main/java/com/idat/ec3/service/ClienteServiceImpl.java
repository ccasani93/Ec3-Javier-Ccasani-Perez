package com.idat.ec3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec3.dto.ClienteRequestDTO;
import com.idat.ec3.dto.ClienteResponseDTO;
import com.idat.ec3.model.Cliente;
import com.idat.ec3.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public void guardarCliente(ClienteRequestDTO c) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setIdCliente(c.getIdClienteRequest());
		cliente.setNombre(c.getNombreCliente());
		cliente.setCelular(c.getCelularCliente());
		repository.save(cliente);
			
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void editarCliente(ClienteRequestDTO c) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setIdCliente(c.getIdClienteRequest());
		cliente.setNombre(c.getNombreCliente());
		cliente.setCelular(c.getCelularCliente());
		repository.saveAndFlush(cliente);
	}

	@Override
	public List<ClienteResponseDTO> listarCliente() {
		// TODO Auto-generated method stub
		List<Cliente> cliente = repository.findAll();
		List<ClienteResponseDTO> dto = new ArrayList<ClienteResponseDTO>();
		ClienteResponseDTO clienteDTO = null;
		
		for (Cliente clientes: cliente) {
			clienteDTO = new ClienteResponseDTO();
			clienteDTO.setIdClienteResponse(clientes.getIdCliente());
			clienteDTO.setNombreCliente(clientes.getNombre());
			clienteDTO.setCelularCliente(clientes.getCelular());
			dto.add(clienteDTO);
		}
		
		return dto;
		
		}	

	@Override
	public ClienteResponseDTO clienteById(Integer id) {
		// TODO Auto-generated method stub
		Cliente cliente = repository.findById(id).orElse(null);
		ClienteResponseDTO clienteDTO = new ClienteResponseDTO();
		
		clienteDTO = new ClienteResponseDTO();
		clienteDTO.setIdClienteResponse(cliente.getIdCliente());
		clienteDTO.setNombreCliente(cliente.getNombre());
		clienteDTO.setCelularCliente(cliente.getCelular());
		
		return clienteDTO;
	}

}
