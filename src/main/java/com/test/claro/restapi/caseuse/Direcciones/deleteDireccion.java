package com.test.claro.restapi.caseuse.Direcciones;

import com.test.claro.restapi.service.direccionServices;
import org.springframework.stereotype.Component;

@Component
public class deleteDireccion {

    private direccionServices direccionServices;

    public deleteDireccion(direccionServices direccionServices) {
        this.direccionServices = direccionServices;
    }

    public void remove(Long id) {
        direccionServices.delete(id);
    }
}
