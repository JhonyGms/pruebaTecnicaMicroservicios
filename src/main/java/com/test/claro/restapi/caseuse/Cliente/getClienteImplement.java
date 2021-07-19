package com.test.claro.restapi.caseuse.Cliente;

import com.test.claro.restapi.entity.Cliente;
import com.test.claro.restapi.service.clienteServices;

import java.util.List;

public class getClienteImplement implements getCliente {
    private clienteServices clienteServices;

    public getClienteImplement(clienteServices clienteServices) {
        this.clienteServices = clienteServices;
    }

    @Override
    public List<Cliente> getAll() {
        return clienteServices.getAllUsers();
    }

    @Override
    public Boolean getIdExiste(Long id) {
        return clienteServices.getIdExiste(id);
    }

}
