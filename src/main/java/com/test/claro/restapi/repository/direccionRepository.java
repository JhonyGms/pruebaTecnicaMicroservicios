package com.test.claro.restapi.repository;

import com.test.claro.restapi.entity.Direccion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface direccionRepository extends MongoRepository<Direccion, Serializable> { }
