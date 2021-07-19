package com.test.claro.restapi.service;

import com.test.claro.restapi.entity.Cliente;
import com.test.claro.restapi.entity.Direccion;
import com.test.claro.restapi.repository.direccionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class direccionServices {
    private direccionRepository direccionRepository;

    public direccionServices( direccionRepository direccionRepository){
        this.direccionRepository = direccionRepository;
    }

    public Direccion insert(Direccion newDireccion) {
        return direccionRepository.insert(newDireccion);
    }

    public List<Direccion> getAllUsers() {
        return direccionRepository.findAll();
    }

    public void delete(Long id) {
        direccionRepository.delete(new Direccion(id));
    }

    public Direccion update(Direccion newDireccion, Long id) {
        return direccionRepository.findById(id)
                .map(
                        direccion -> {
                            direccion.setDepartamento(newDireccion.getDepartamento());
                            direccion.setCiudad(newDireccion.getCiudad());
                            direccion.setDireccionCompleta(newDireccion.getDireccionCompleta());
                            return direccionRepository.save(direccion);
                        }
                ).get();
    }

}
