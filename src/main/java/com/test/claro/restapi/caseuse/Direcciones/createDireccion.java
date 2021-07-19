package com.test.claro.restapi.caseuse.Direcciones;

import com.test.claro.restapi.entity.Direccion;
import com.test.claro.restapi.service.direccionServices;
import org.springframework.stereotype.Component;

@Component
public class createDireccion {
    private direccionServices direccionServices;

    public createDireccion(direccionServices direccionServices) {
        this.direccionServices = direccionServices;
    }

    public Direccion insert(Direccion newDireccion) {
        return direccionServices.insert(newDireccion);
    }
}
