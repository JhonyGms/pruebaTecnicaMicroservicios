package com.test.claro.restapi.caseuse.Cliente;

import com.test.claro.restapi.entity.Cliente;
import org.springframework.stereotype.Component;
import com.test.claro.restapi.service.clienteServices;

@Component
public class createCliente {

    private clienteServices clienteServices;

    public createCliente(clienteServices clienteServices){
        this.clienteServices = clienteServices;
    }

    public Cliente insert(Cliente newCliente) {
        return clienteServices.insert(newCliente);
    }
}
