package com.test.claro.restapi.configuration;

import com.test.claro.restapi.caseuse.Cliente.getCliente;
import com.test.claro.restapi.caseuse.Cliente.getClienteImplement;
import com.test.claro.restapi.caseuse.Direcciones.getDireccion;
import com.test.claro.restapi.caseuse.Direcciones.getDireccionImplement;
import com.test.claro.restapi.service.clienteServices;
import com.test.claro.restapi.service.direccionServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class caseUseConfiguration {

    @Bean
    getCliente getCliente(clienteServices clienteServices) {return  new getClienteImplement(clienteServices); }

    @Bean
    getDireccion getDireccion(direccionServices direccionServices) {return new getDireccionImplement(direccionServices); }

}
