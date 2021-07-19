package com.test.claro.restapi.caseuse.Cliente;

import com.test.claro.restapi.entity.Cliente;
import com.test.claro.restapi.service.clienteServices;
import org.springframework.stereotype.Component;

@Component
public class upadateCliente {

    private clienteServices clienteServices;

    public upadateCliente(clienteServices clienteServices){
        this.clienteServices = clienteServices;
    }

    public Cliente update(Cliente newCliente, Long id) {
        return clienteServices.update(newCliente, id);
    }
}
