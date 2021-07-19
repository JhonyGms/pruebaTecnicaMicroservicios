package com.test.claro.restapi.caseuse.Direcciones;

import com.test.claro.restapi.entity.Direccion;
import com.test.claro.restapi.service.direccionServices;

import java.util.List;

public class getDireccionImplement implements getDireccion {

    private direccionServices direccionServices;

    public getDireccionImplement(direccionServices direccionServices){
        this.direccionServices = direccionServices;
    }

    @Override
    public List<Direccion> getAll() {
        return direccionServices.getAllUsers();
    }


}
