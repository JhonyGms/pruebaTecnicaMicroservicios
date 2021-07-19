package com.test.claro.restapi.caseuse.Direcciones;

import com.test.claro.restapi.entity.Direccion;
import com.test.claro.restapi.service.direccionServices;
import org.springframework.stereotype.Component;

@Component
public class updateDireccion {

    private direccionServices direccionServices;

    public updateDireccion(direccionServices direccionServices) {
        this.direccionServices = direccionServices;
    }

    public Direccion update(Direccion direccion, Long id) {
        return direccionServices.update(direccion,id);
    }
}
