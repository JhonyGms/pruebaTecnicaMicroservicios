package com.test.claro.restapi.repository;

import com.test.claro.restapi.entity.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface clienteRepository extends MongoRepository<Cliente, Serializable> { }
