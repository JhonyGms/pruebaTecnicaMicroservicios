package com.test.claro.restapi.caseuse.Cliente;

import com.test.claro.restapi.service.clienteServices;
import org.springframework.stereotype.Component;

@Component
public class deleteCliente {

    private clienteServices clienteServices;

    public deleteCliente(clienteServices clienteServices){
        this.clienteServices = clienteServices;
    }

    public void remove(Long id) {
        clienteServices.delete(id);
    }
}
