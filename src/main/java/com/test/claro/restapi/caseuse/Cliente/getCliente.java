package com.test.claro.restapi.caseuse.Cliente;

import com.test.claro.restapi.entity.Cliente;

import java.util.List;

public interface getCliente {
    List<Cliente> getAll();

    Boolean getIdExiste(Long id);
}
