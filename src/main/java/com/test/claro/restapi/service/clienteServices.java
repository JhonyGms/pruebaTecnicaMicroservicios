package com.test.claro.restapi.service;

import com.test.claro.restapi.entity.Cliente;
import org.springframework.stereotype.Service;
import com.test.claro.restapi.repository.clienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class clienteServices {
    private clienteRepository clienteRepository;

    public clienteServices( clienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public Cliente insert(Cliente newCliente) {
        return clienteRepository.insert(newCliente);
    }

    public List<Cliente> getAllUsers() {
        return clienteRepository.findAll();
    }

    public void delete(Long id) {
        clienteRepository.delete(new Cliente(id));
    }

    public Cliente update(Cliente newCliente, Long id) {
        return clienteRepository.findById(id)
                .map(
                        cliente -> {
                            cliente.setNombre(newCliente.getNombre());
                            cliente.setApellido(newCliente.getApellido());
                            cliente.setNumeroDocumento(newCliente.getNumeroDocumento());
                            cliente.setTipoDocumento(newCliente.getTipoDocumento());
                            cliente.setEdad(newCliente.getEdad());
                            cliente.setActivo(newCliente.isActivo());
                            return clienteRepository.save(cliente);
                        }
                ).get();
    }

    public Boolean getIdExiste(Long id) {
        return clienteRepository.existsById(id)? true :false;
    }
}
